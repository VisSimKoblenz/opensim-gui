/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PhysicalFrameWithOffset extends PhysicalFrame {
  private transient long swigCPtr;

  public PhysicalFrameWithOffset(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.PhysicalFrameWithOffset_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PhysicalFrameWithOffset obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_PhysicalFrameWithOffset(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PhysicalFrameWithOffset safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.PhysicalFrameWithOffset_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PhysicalFrameWithOffset(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.PhysicalFrameWithOffset_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.PhysicalFrameWithOffset_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.PhysicalFrameWithOffset_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PhysicalFrameWithOffset(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.PhysicalFrameWithOffset_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_translation(PhysicalFrameWithOffset source) {
    opensimSimulationJNI.PhysicalFrameWithOffset_copyProperty_translation(swigCPtr, this, PhysicalFrameWithOffset.getCPtr(source), source);
  }

  public Vec3 get_translation(int i) {
    return new Vec3(opensimSimulationJNI.PhysicalFrameWithOffset_get_translation__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_translation(int i) {
    return new Vec3(opensimSimulationJNI.PhysicalFrameWithOffset_upd_translation__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_translation(int i, Vec3 value) {
    opensimSimulationJNI.PhysicalFrameWithOffset_set_translation__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_translation(Vec3 value) {
    return opensimSimulationJNI.PhysicalFrameWithOffset_append_translation(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_translation(Vec3 initValue) {
    opensimSimulationJNI.PhysicalFrameWithOffset_constructProperty_translation(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_translation() {
    return new Vec3(opensimSimulationJNI.PhysicalFrameWithOffset_get_translation__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_translation() {
    return new Vec3(opensimSimulationJNI.PhysicalFrameWithOffset_upd_translation__SWIG_1(swigCPtr, this), false);
  }

  public void set_translation(Vec3 value) {
    opensimSimulationJNI.PhysicalFrameWithOffset_set_translation__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_orientation(PhysicalFrameWithOffset source) {
    opensimSimulationJNI.PhysicalFrameWithOffset_copyProperty_orientation(swigCPtr, this, PhysicalFrameWithOffset.getCPtr(source), source);
  }

  public Vec3 get_orientation(int i) {
    return new Vec3(opensimSimulationJNI.PhysicalFrameWithOffset_get_orientation__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_orientation(int i) {
    return new Vec3(opensimSimulationJNI.PhysicalFrameWithOffset_upd_orientation__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_orientation(int i, Vec3 value) {
    opensimSimulationJNI.PhysicalFrameWithOffset_set_orientation__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_orientation(Vec3 value) {
    return opensimSimulationJNI.PhysicalFrameWithOffset_append_orientation(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_orientation(Vec3 initValue) {
    opensimSimulationJNI.PhysicalFrameWithOffset_constructProperty_orientation(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_orientation() {
    return new Vec3(opensimSimulationJNI.PhysicalFrameWithOffset_get_orientation__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_orientation() {
    return new Vec3(opensimSimulationJNI.PhysicalFrameWithOffset_upd_orientation__SWIG_1(swigCPtr, this), false);
  }

  public void set_orientation(Vec3 value) {
    opensimSimulationJNI.PhysicalFrameWithOffset_set_orientation__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void setPropertyIndex_socket_parent(SWIGTYPE_p_PropertyIndex value) {
    opensimSimulationJNI.PhysicalFrameWithOffset_PropertyIndex_socket_parent_set(swigCPtr, this, SWIGTYPE_p_PropertyIndex.getCPtr(value));
  }

  public SWIGTYPE_p_PropertyIndex getPropertyIndex_socket_parent() {
    return new SWIGTYPE_p_PropertyIndex(opensimSimulationJNI.PhysicalFrameWithOffset_PropertyIndex_socket_parent_get(swigCPtr, this), true);
  }

  public void connectSocket_parent(OpenSimObject object) {
    opensimSimulationJNI.PhysicalFrameWithOffset_connectSocket_parent(swigCPtr, this, OpenSimObject.getCPtr(object), object);
  }

  public void setParentFrame(PhysicalFrame parent) {
    opensimSimulationJNI.PhysicalFrameWithOffset_setParentFrame(swigCPtr, this, PhysicalFrame.getCPtr(parent), parent);
  }

  public PhysicalFrame getParentFrame() {
    return new PhysicalFrame(opensimSimulationJNI.PhysicalFrameWithOffset_getParentFrame(swigCPtr, this), false);
  }

  public Transform getOffsetTransform() {
    return new Transform(opensimSimulationJNI.PhysicalFrameWithOffset_getOffsetTransform(swigCPtr, this), false);
  }

  public void setOffsetTransform(Transform offset) {
    opensimSimulationJNI.PhysicalFrameWithOffset_setOffsetTransform(swigCPtr, this, Transform.getCPtr(offset), offset);
  }

  public void extendScale(State s, ScaleSet scaleSet) {
    opensimSimulationJNI.PhysicalFrameWithOffset_extendScale(swigCPtr, this, State.getCPtr(s), s, ScaleSet.getCPtr(scaleSet), scaleSet);
  }

}
