/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.opensim.view;

import java.beans.PropertyEditor;
import java.lang.reflect.InvocationTargetException;
import org.openide.nodes.PropertySupport;
import org.opensim.modeling.AbstractProperty;
import org.opensim.modeling.Function;
import org.opensim.modeling.OpenSimObject;
import org.opensim.view.nodes.OpenSimFunctionEditor;
import org.opensim.view.nodes.OpenSimObjectNode;

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
public class OpenSimFunctionProperty extends OpenSimBaseObjectProperty  {

    Function objectToEdit;

    public OpenSimFunctionProperty(AbstractProperty ap, OpenSimObjectNode parentNode){
        super(ap.getName(), ap.getName(), ap.getComment());
        OpenSimObject dObj = ap.isOptionalProperty()?ap.getValueAsObject(0): ap.getValueAsObject();
        objectToEdit = Function.safeDownCast(dObj);
        this.ap = ap;
        this.parentNode = parentNode;

    }
    
    @Override
    public OpenSimObject getValue() {
        return objectToEdit;
    }

    @Override
    public void setValue(OpenSimObject value)  {
        objectToEdit = Function.safeDownCast(value);
    }

    @Override
    public PropertyEditor getPropertyEditor() {
        return new OpenSimFunctionEditor(ap, objectToEdit, parentNode);
    }

    @Override
    public void restoreDefaultValue() throws IllegalAccessException, InvocationTargetException {
        super.restoreDefaultValue();
    }


}
