package org.opensim.view.nodes;

import javax.swing.undo.AbstractUndoableEdit;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import org.opensim.modeling.AbstractProperty;
import org.opensim.modeling.ArrayDouble;
import org.opensim.modeling.Model;
import org.opensim.modeling.OpenSimContext;
import org.opensim.modeling.OpenSimObject;
import org.opensim.modeling.PropertyHelper;
import org.opensim.view.ExplorerTopComponent;
import org.opensim.view.pub.OpenSimDB;
import org.opensim.view.pub.ViewDB;

/**
 *
 * @author ayman
 * Copyright (c)  2005-2012, Stanford University, Ayman Habib
 * Use of the OpenSim software in source form is permitted provided that the following
 * conditions are met:
 * 	1. The software is used only for non-commercial research and education. It may not
 *     be used in relation to any commercial activity.
 * 	2. The software is not distributed or redistributed.  Software distribution is allowed
 *     only through https://simtk.org/home/opensim.
 * 	3. Use of the OpenSim software or derivatives must be acknowledged in all publications,
 *      presentations, or documents describing work in which OpenSim or derivatives are used.
 * 	4. Credits to developers may not be removed from executables
 *     created from modifications of the source.
 * 	5. Modifications of source code must retain the above copyright notice, this list of
 *     conditions and the following disclaimer.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 *  EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 *  SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 *  TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 *  HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 *  OR BUSINESS INTERRUPTION) OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY
 *  WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
/**
 *  PropertyEditorAdaptor is an adaptor class to implement the expected signatures for methods to be used
 * by built in property editors. The signatures are along the form:
 * setValueX( X valueToSet)
 * X getValueX()
 * 
 * These signature patterns originate in JavaBeans
 * The actual functionality is implemented by the native side class PropertyHelper that can leverage RTTI
 * @author ayman
 */
public class PropertyEditorAdaptor {

    OpenSimObject obj;
    AbstractProperty prop;
    OpenSimContext context = null;
    Model model;

    public PropertyEditorAdaptor(AbstractProperty prop, OpenSimObject obj, Model model) {
        this.prop = prop;
        this.context = OpenSimDB.getInstance().getContext(model);
        this.model = model;
        this.obj = obj;
    }
    // Double Properties

    public double getValueDouble() {
        return PropertyHelper.getValueDouble(prop);
    }

    public void setValueDouble(double v) {
        setValueDouble(v, true);
    }

    /**
     * set value of property to a double, with optional undo support
     * 
     * @param v
     * @param supportUndo 
     */
    public void setValueDouble(double v, boolean supportUndo) {
        double oldValue = PropertyHelper.getValueDouble(prop);
        PropertyHelper.setValueDouble(v, prop);
        handlePropertyChange(oldValue, v, supportUndo);
    }

    public void setValueDouble(Double v) {
        setValueDouble(v.doubleValue());
    }

    // Int Properties
    public int getValueInt() {
        return PropertyHelper.getValueInt(prop);
    }

    public void setValueInt(int v) {
        setValueInt(v, true);
    }

    public void setValueInt(int v, boolean supportUndo) {
        int oldValue = getValueInt();
        PropertyHelper.setValueInt(v, prop);
        handlePropertyChange(oldValue, v, supportUndo);
    }

    public void setValueInt(Integer v) {
        setValueInt(v.intValue());
    }

    // Bool Properties
    public boolean getValueBool() {
        return PropertyHelper.getValueBool(prop);
    }

    public void setValueBool(boolean v) {
        setValueBool(v, true);
    }

    public void setValueBool(boolean v, boolean supportUndo) {
        boolean oldValue = getValueBool();
        PropertyHelper.setValueBool(v, prop);
        //boolean newValue = PropertyHelper.getValueBool(prop);
        //System.out.println("new value1="+newValue);
        handlePropertyChange(oldValue, v, supportUndo);
        //newValue = PropertyHelper.getValueBool(prop);
        //System.out.println("new value2="+newValue);
    }

    public void setValueBool(Boolean v) {
        setValueBool(v.booleanValue());
    }

    // String Properties
    public String getValueString() {
        return PropertyHelper.getValueString(prop);
    }

    public void setValueString(String v) {
        setValueString(v, true);
    }

    public void setValueString(String v, boolean supportUndo) {
        String oldValue = PropertyHelper.getValueString(prop);
        PropertyHelper.setValueString(v, prop);
        handlePropertyChange(oldValue, v, supportUndo);
    }

    public OpenSimObject getValueObj() {
        return prop.getValueAsObject();
    }

    public void setValueObj(OpenSimObject v) {
        prop.setValueAsObject(v);
    }

    public String toString() {
        return prop.toString();
    }

    public void setValueDoubleListFromString(String aString) {
        // Parse String into an array of doubles, check that it's the right size for prop then assign
        ArrayDouble d = new ArrayDouble();
        d.fromString(aString);
        if (prop.size() == d.getSize()) {
            int sz = prop.size();
            for (int i = 0; i < sz; i++) {
                PropertyHelper.setValueDouble(d.getitem(i), prop, i);
            }
        }
        context.recreateSystemAfterSystemExistsKeepStage();
        ViewDB.getInstance().updateModelDisplay(model);
    }

    private void handlePropertyChange(final double oldValue, final double v, boolean supportUndo) {
        context.recreateSystemAfterSystemExistsKeepStage();
        ViewDB.getInstance().updateModelDisplay(model);
        if (supportUndo) {
            AbstractUndoableEdit auEdit = new AbstractUndoableEdit() {

                @Override
                public void undo() throws CannotUndoException {
                    super.undo();
                    setValueDouble(oldValue, false);
                }

                @Override
                public void redo() throws CannotRedoException {
                    super.redo();
                    setValueDouble(v, true);
                }
            };
            ExplorerTopComponent.addUndoableEdit(auEdit);
        }
    }

    private void handlePropertyChange(final String oldValue, final String v, boolean supportUndo) {
        context.recreateSystemAfterSystemExistsKeepStage();
        ViewDB.getInstance().updateModelDisplay(model);
        if (supportUndo) {
            AbstractUndoableEdit auEdit = new AbstractUndoableEdit() {

                @Override
                public void undo() throws CannotUndoException {
                    super.undo();
                    setValueString(oldValue, false);
                }

                @Override
                public void redo() throws CannotRedoException {
                    super.redo();
                    setValueString(v, true);
                }
            };
            ExplorerTopComponent.addUndoableEdit(auEdit);
        }
    }

    private void handlePropertyChange(final boolean oldValue, final boolean v, boolean supportUndo) {
        context.recreateSystemAfterSystemExistsKeepStage();
        ViewDB.getInstance().updateModelDisplay(model);
        if (supportUndo) {
            AbstractUndoableEdit auEdit = new AbstractUndoableEdit() {

                @Override
                public void undo() throws CannotUndoException {
                    super.undo();
                    setValueBool(oldValue, false);
                }

                @Override
                public void redo() throws CannotRedoException {
                    super.redo();
                    setValueBool(v, true);
                }
            };
            ExplorerTopComponent.addUndoableEdit(auEdit);
        }
    }

    private void handlePropertyChange(final int oldValue, final int v, boolean supportUndo) {
        context.recreateSystemAfterSystemExistsKeepStage();
        ViewDB.getInstance().updateModelDisplay(model);
        if (supportUndo) {
            AbstractUndoableEdit auEdit = new AbstractUndoableEdit() {

                @Override
                public void undo() throws CannotUndoException {
                    super.undo();
                    setValueInt(oldValue, false);
                }

                @Override
                public void redo() throws CannotRedoException {
                    super.redo();
                    setValueInt(v, true);
                }
            };
            ExplorerTopComponent.addUndoableEdit(auEdit);
        }
    }
}
