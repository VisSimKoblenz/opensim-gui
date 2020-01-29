/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Control extends OpenSimObject {
  private transient long swigCPtr;

  public Control(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.Control_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Control obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_Control(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static Control safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.Control_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new Control(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.Control_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.Control_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.Control_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Control(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.Control_getConcreteClassName(swigCPtr, this);
  }

  public void setIsModelControl(boolean aTrueFalse) {
    opensimSimulationJNI.Control_setIsModelControl(swigCPtr, this, aTrueFalse);
  }

  public boolean getIsModelControl() {
    return opensimSimulationJNI.Control_getIsModelControl(swigCPtr, this);
  }

  public void setExtrapolate(boolean aTrueFalse) {
    opensimSimulationJNI.Control_setExtrapolate(swigCPtr, this, aTrueFalse);
  }

  public boolean getExtrapolate() {
    return opensimSimulationJNI.Control_getExtrapolate(swigCPtr, this);
  }

  public void setFilterOn(boolean aTrueFalse) {
    opensimSimulationJNI.Control_setFilterOn(swigCPtr, this, aTrueFalse);
  }

  public boolean getFilterOn() {
    return opensimSimulationJNI.Control_getFilterOn(swigCPtr, this);
  }

  public int getNumParameters() {
    return opensimSimulationJNI.Control_getNumParameters(swigCPtr, this);
  }

  public void setDefaultParameterMin(double aMin) {
    opensimSimulationJNI.Control_setDefaultParameterMin(swigCPtr, this, aMin);
  }

  public double getDefaultParameterMin() {
    return opensimSimulationJNI.Control_getDefaultParameterMin(swigCPtr, this);
  }

  public void setDefaultParameterMax(double aMax) {
    opensimSimulationJNI.Control_setDefaultParameterMax(swigCPtr, this, aMax);
  }

  public double getDefaultParameterMax() {
    return opensimSimulationJNI.Control_getDefaultParameterMax(swigCPtr, this);
  }

  public void setParameterMin(int aI, double aMin) {
    opensimSimulationJNI.Control_setParameterMin(swigCPtr, this, aI, aMin);
  }

  public double getParameterMin(int aI) {
    return opensimSimulationJNI.Control_getParameterMin(swigCPtr, this, aI);
  }

  public void setParameterMax(int aI, double aMax) {
    opensimSimulationJNI.Control_setParameterMax(swigCPtr, this, aI, aMax);
  }

  public double getParameterMax(int aI) {
    return opensimSimulationJNI.Control_getParameterMax(swigCPtr, this, aI);
  }

  public double getParameterTime(int aI) {
    return opensimSimulationJNI.Control_getParameterTime(swigCPtr, this, aI);
  }

  public void getParameterNeighborhood(int aI, SWIGTYPE_p_double rTLower, SWIGTYPE_p_double rTUpper) {
    opensimSimulationJNI.Control_getParameterNeighborhood(swigCPtr, this, aI, SWIGTYPE_p_double.getCPtr(rTLower), SWIGTYPE_p_double.getCPtr(rTUpper));
  }

  public int getParameterList(double aT, ArrayInt rList) {
    return opensimSimulationJNI.Control_getParameterList__SWIG_0(swigCPtr, this, aT, ArrayInt.getCPtr(rList), rList);
  }

  public int getParameterList(double aTLower, double aTUpper, ArrayInt rList) {
    return opensimSimulationJNI.Control_getParameterList__SWIG_1(swigCPtr, this, aTLower, aTUpper, ArrayInt.getCPtr(rList), rList);
  }

  public double getParameterValue(int aI) {
    return opensimSimulationJNI.Control_getParameterValue(swigCPtr, this, aI);
  }

  public void setParameterValue(int aI, double aX) {
    opensimSimulationJNI.Control_setParameterValue(swigCPtr, this, aI, aX);
  }

  public double getControlValue(double aT) {
    return opensimSimulationJNI.Control_getControlValue__SWIG_0(swigCPtr, this, aT);
  }

  public double getControlValue() {
    return opensimSimulationJNI.Control_getControlValue__SWIG_1(swigCPtr, this);
  }

  public void setControlValue(double aT, double aX) {
    opensimSimulationJNI.Control_setControlValue(swigCPtr, this, aT, aX);
  }

  public double getControlValueMin(double aT) {
    return opensimSimulationJNI.Control_getControlValueMin__SWIG_0(swigCPtr, this, aT);
  }

  public double getControlValueMin() {
    return opensimSimulationJNI.Control_getControlValueMin__SWIG_1(swigCPtr, this);
  }

  public void setControlValueMin(double aT, double aMin) {
    opensimSimulationJNI.Control_setControlValueMin(swigCPtr, this, aT, aMin);
  }

  public double getControlValueMax(double aT) {
    return opensimSimulationJNI.Control_getControlValueMax__SWIG_0(swigCPtr, this, aT);
  }

  public double getControlValueMax() {
    return opensimSimulationJNI.Control_getControlValueMax__SWIG_1(swigCPtr, this);
  }

  public void setControlValueMax(double aT, double aMax) {
    opensimSimulationJNI.Control_setControlValueMax(swigCPtr, this, aT, aMax);
  }

  public double getFirstTime() {
    return opensimSimulationJNI.Control_getFirstTime(swigCPtr, this);
  }

  public double getLastTime() {
    return opensimSimulationJNI.Control_getLastTime(swigCPtr, this);
  }

  public void simplify(SWIGTYPE_p_PropertySet aProperties) {
    opensimSimulationJNI.Control_simplify(swigCPtr, this, SWIGTYPE_p_PropertySet.getCPtr(aProperties));
  }

  public void filter(double aT) {
    opensimSimulationJNI.Control_filter(swigCPtr, this, aT);
  }

}
