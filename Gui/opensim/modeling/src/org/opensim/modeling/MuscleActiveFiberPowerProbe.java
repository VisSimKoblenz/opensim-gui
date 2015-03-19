/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MuscleActiveFiberPowerProbe extends Probe {
  private long swigCPtr;

  public MuscleActiveFiberPowerProbe(long cPtr, boolean cMemoryOwn) {
    super(opensimModelJNI.MuscleActiveFiberPowerProbe_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MuscleActiveFiberPowerProbe obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_MuscleActiveFiberPowerProbe(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static MuscleActiveFiberPowerProbe safeDownCast(OpenSimObject obj) {
    long cPtr = opensimModelJNI.MuscleActiveFiberPowerProbe_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new MuscleActiveFiberPowerProbe(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimModelJNI.MuscleActiveFiberPowerProbe_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimModelJNI.MuscleActiveFiberPowerProbe_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimModelJNI.MuscleActiveFiberPowerProbe_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new MuscleActiveFiberPowerProbe(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimModelJNI.MuscleActiveFiberPowerProbe_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_muscle_names(MuscleActiveFiberPowerProbe source) {
    opensimModelJNI.MuscleActiveFiberPowerProbe_copyProperty_muscle_names(swigCPtr, this, MuscleActiveFiberPowerProbe.getCPtr(source), source);
  }

  public String get_muscle_names(int i) {
    return opensimModelJNI.MuscleActiveFiberPowerProbe_get_muscle_names(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_muscle_names(int i) {
    return new SWIGTYPE_p_std__string(opensimModelJNI.MuscleActiveFiberPowerProbe_upd_muscle_names(swigCPtr, this, i), false);
  }

  public void set_muscle_names(int i, String value) {
    opensimModelJNI.MuscleActiveFiberPowerProbe_set_muscle_names(swigCPtr, this, i, value);
  }

  public int append_muscle_names(String value) {
    return opensimModelJNI.MuscleActiveFiberPowerProbe_append_muscle_names(swigCPtr, this, value);
  }

  public void constructProperty_muscle_names() {
    opensimModelJNI.MuscleActiveFiberPowerProbe_constructProperty_muscle_names(swigCPtr, this);
  }

  public MuscleActiveFiberPowerProbe() {
    this(opensimModelJNI.new_MuscleActiveFiberPowerProbe__SWIG_0(), true);
  }

  public MuscleActiveFiberPowerProbe(ArrayStr muscle_names) {
    this(opensimModelJNI.new_MuscleActiveFiberPowerProbe__SWIG_1(ArrayStr.getCPtr(muscle_names), muscle_names), true);
  }

  public PropertyString getMuscleNames() {
    return new PropertyString(opensimModelJNI.MuscleActiveFiberPowerProbe_getMuscleNames(swigCPtr, this), false);
  }

  public void setMuscleNames(ArrayStr muscleNames) {
    opensimModelJNI.MuscleActiveFiberPowerProbe_setMuscleNames(swigCPtr, this, ArrayStr.getCPtr(muscleNames), muscleNames);
  }

  public Vector computeProbeInputs(State state) {
    return new Vector(opensimModelJNI.MuscleActiveFiberPowerProbe_computeProbeInputs(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public int getNumProbeInputs() {
    return opensimModelJNI.MuscleActiveFiberPowerProbe_getNumProbeInputs(swigCPtr, this);
  }

  public ArrayStr getProbeOutputLabels() {
    return new ArrayStr(opensimModelJNI.MuscleActiveFiberPowerProbe_getProbeOutputLabels(swigCPtr, this), true);
  }

}