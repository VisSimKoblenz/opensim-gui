/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TrackingTask extends OpenSimObject {
  private transient long swigCPtr;

  public TrackingTask(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.TrackingTask_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(TrackingTask obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_TrackingTask(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static TrackingTask safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.TrackingTask_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new TrackingTask(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.TrackingTask_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.TrackingTask_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.TrackingTask_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TrackingTask(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.TrackingTask_getConcreteClassName(swigCPtr, this);
  }

  public void setModel(Model aModel) {
    opensimActuatorsAnalysesToolsJNI.TrackingTask_setModel(swigCPtr, this, Model.getCPtr(aModel), aModel);
  }

  public Model getModel() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.TrackingTask_getModel(swigCPtr, this);
    return (cPtr == 0) ? null : new Model(cPtr, false);
  }

  public void setOn(boolean aTrueFalse) {
    opensimActuatorsAnalysesToolsJNI.TrackingTask_setOn(swigCPtr, this, aTrueFalse);
  }

  public boolean getOn() {
    return opensimActuatorsAnalysesToolsJNI.TrackingTask_getOn(swigCPtr, this);
  }

  public void setWeight(double aW0, double aW1, double aW2) {
    opensimActuatorsAnalysesToolsJNI.TrackingTask_setWeight__SWIG_0(swigCPtr, this, aW0, aW1, aW2);
  }

  public void setWeight(double aW0, double aW1) {
    opensimActuatorsAnalysesToolsJNI.TrackingTask_setWeight__SWIG_1(swigCPtr, this, aW0, aW1);
  }

  public void setWeight(double aW0) {
    opensimActuatorsAnalysesToolsJNI.TrackingTask_setWeight__SWIG_2(swigCPtr, this, aW0);
  }

  public void setWeights(ArrayDouble aWeights) {
    opensimActuatorsAnalysesToolsJNI.TrackingTask_setWeights(swigCPtr, this, ArrayDouble.getCPtr(aWeights), aWeights);
  }

  public double getWeight(int aWhich) {
    return opensimActuatorsAnalysesToolsJNI.TrackingTask_getWeight(swigCPtr, this, aWhich);
  }

  public ArrayDouble getWeights() {
    return new ArrayDouble(opensimActuatorsAnalysesToolsJNI.TrackingTask_getWeights(swigCPtr, this), false);
  }

  public int getNumTaskFunctions() {
    return opensimActuatorsAnalysesToolsJNI.TrackingTask_getNumTaskFunctions(swigCPtr, this);
  }

  public void setTaskFunctions(Function aF0, Function aF1, Function aF2) {
    opensimActuatorsAnalysesToolsJNI.TrackingTask_setTaskFunctions__SWIG_0(swigCPtr, this, Function.getCPtr(aF0), aF0, Function.getCPtr(aF1), aF1, Function.getCPtr(aF2), aF2);
  }

  public void setTaskFunctions(Function aF0, Function aF1) {
    opensimActuatorsAnalysesToolsJNI.TrackingTask_setTaskFunctions__SWIG_1(swigCPtr, this, Function.getCPtr(aF0), aF0, Function.getCPtr(aF1), aF1);
  }

  public void setTaskFunctions(Function aF0) {
    opensimActuatorsAnalysesToolsJNI.TrackingTask_setTaskFunctions__SWIG_2(swigCPtr, this, Function.getCPtr(aF0), aF0);
  }

}
