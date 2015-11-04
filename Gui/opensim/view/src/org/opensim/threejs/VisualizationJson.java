/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.threejs;

import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.UUID;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.opensim.modeling.ArrayDecorativeGeometry;
import org.opensim.modeling.BodiesList;
import org.opensim.modeling.BodyIterator;
import org.opensim.modeling.Component;
import org.opensim.modeling.ComponentIterator;
import org.opensim.modeling.ComponentsList;
import org.opensim.modeling.DecorativeGeometry;
import org.opensim.modeling.Model;
import org.opensim.modeling.ModelDisplayHints;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.PhysicalFrame;
import org.opensim.modeling.State;
import org.opensim.modeling.Transform;
import org.opensim.view.ObjectSelectedEvent;
import org.opensim.view.pub.ViewDB;

/**
 *
 * @author Ayman
 */
public class VisualizationJson implements Observer{
    State state;
    private final JSONObject topJson;
    private final HashMap<Integer, JSONObject> mapBodyIndicesToGroups = new HashMap<Integer, JSONObject>();
    private final HashMap<Integer, PhysicalFrame> mapBodyIndicesToFrames = new HashMap<Integer, PhysicalFrame>();
    private final double visScaleFactor = 1000.0;
    private HashMap<String, UUID> mapDecorativeGeometryToUUID = new HashMap<String, UUID>();
    private HashMap<String, UUID> mapMaterialToUUID = new HashMap<String, UUID>();
    private HashMap<UUID, Component> mapUUIDToComponent = new HashMap<UUID, Component>();

    public VisualizationJson(Model model) {
        topJson =  createJsonForModel(model);
        ViewDB.getInstance().addObserver(this);
    }
    private JSONObject createJsonForModel(Model model) {
        state = model.getWorkingState();
        ModelDisplayHints mdh = model.getDisplayHints();
        ComponentsList mcList = model.getComponentsList();
        ComponentIterator mcIter = mcList.begin();
        JSONObject jsonTop = loadTemplateJSON();
        if (jsonTop == null) {
        }
        BodiesList bodies = model.getBodiesList();
        BodyIterator body = bodies.begin();
        mapBodyIndicesToFrames.put(0, model.getGround());
        while (!body.equals(bodies.end())) {
            int id = body.getMobilizedBodyIndex();
            mapBodyIndicesToFrames.put(id, PhysicalFrame.safeDownCast(body.__deref__()));
            System.out.println("id=" + id + " body =" + body.getName());
            body.next();
        }
        JSONArray json_geometries = (JSONArray) jsonTop.get("geometries");
        JSONArray json_materials = (JSONArray) jsonTop.get("materials");
        JSONObject sceneObject = (JSONObject) jsonTop.get("object");
        JSONArray json_scene_objects = (JSONArray) sceneObject.get("children");
        DecorativeGeometryImplementationJS dgimp = new DecorativeGeometryImplementationJS(json_geometries, visScaleFactor);
        while (!mcIter.equals(mcList.end())) {
            Component comp = mcIter.__deref__();
            ArrayDecorativeGeometry adg = new ArrayDecorativeGeometry();
            comp.generateDecorations(true, mdh, model.getWorkingState(), adg);
            if (adg.size() > 0) {
                DecorativeGeometry dg;
                for (int idx = 0; idx < adg.size(); idx++) {
                    dg = adg.getElt(idx);
                    String geomId = comp.getPathName().concat(String.valueOf(dg.getIndexOnBody()));
                    UUID uuid = UUID.randomUUID();
                    mapDecorativeGeometryToUUID.put(geomId, uuid);
                    mapUUIDToComponent.put(uuid, comp);
                    dgimp.setGeomID(uuid);
                    dg.implementGeometry(dgimp);
                    UUID uuid_mat = UUID.randomUUID();
                    mapMaterialToUUID.put(geomId, uuid_mat);
                    addMaterialJsonForGeometry(uuid_mat, dg, json_materials);
                    addSceneJsonObject(model, dg, geomId, uuid, uuid_mat, json_scene_objects, null);
                }
            }
            mcIter.next();
        }
        return jsonTop;
    }

    private void addMaterialJsonForGeometry(UUID uuid_mat, DecorativeGeometry dg, JSONArray json_materials) {
        Map mat_json = new LinkedHashMap();
        mat_json.put("uuid", uuid_mat.toString());
        mat_json.put("type", "MeshPhongMaterial");
        String colorString = JSONUtilities.mapColorToRGBA(dg.getColor());
        mat_json.put("color", colorString);
        mat_json.put("shininess", 50);
        mat_json.put("emissive", colorString);
        mat_json.put("specular", colorString);
        mat_json.put("side", 2);
        double opacity = dg.getOpacity();
        if (opacity < 0.999) {
            mat_json.put("opacity", opacity);
            mat_json.put("transparent", true);
        }
        json_materials.add(mat_json);
    }

    private JSONObject loadTemplateJSON() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        try {
            Object obj = parser.parse(new FileReader("visResources/templateScene.json"));
            jsonObject = (JSONObject) obj;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonObject;
    }

    private void addSceneJsonObject(Model model, DecorativeGeometry dg, String geomName, UUID uuid, UUID uuid_mat, JSONArray scene_objects, Component comp) {
        Map obj_json = new LinkedHashMap();
        obj_json.put("uuid", UUID.randomUUID().toString());
        obj_json.put("type", "Mesh");
        obj_json.put("name", geomName);
        obj_json.put("geometry", uuid.toString());
        obj_json.put("material", uuid_mat.toString());
        int bod = dg.getBodyId();
        Transform relativeTransform = dg.getTransform();
        PhysicalFrame bodyFrame = mapBodyIndicesToFrames.get(bod);
        Transform xform = bodyFrame.getGroundTransform(state);
        Transform fullTransform = xform.compose(relativeTransform);
        obj_json.put("matrix", JSONUtilities.createMatrixFromTransform(fullTransform, dg.getScaleFactors(), visScaleFactor));
        scene_objects.add(obj_json);
    }

    /**
     * @return the topJson
     */
    public JSONObject getJson() {
        return topJson;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ViewDB ){
            if (arg instanceof ObjectSelectedEvent){
                ObjectSelectedEvent evt = (ObjectSelectedEvent) arg;
                OpenSimObject obj = evt.getSelectedObject().getOpenSimObject();
                //List<UUID> uuids = mapComponentToUUIDList.get(obj);
                //System.out.println(uuids.toString());
            }
        }
    }
    
}