/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ContactHalfSpace extends ContactGeometry {
  private transient long swigCPtr;

  public ContactHalfSpace(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.ContactHalfSpace_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(ContactHalfSpace obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_ContactHalfSpace(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static ContactHalfSpace safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.ContactHalfSpace_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new ContactHalfSpace(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.ContactHalfSpace_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.ContactHalfSpace_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.ContactHalfSpace_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new ContactHalfSpace(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.ContactHalfSpace_getConcreteClassName(swigCPtr, this);
  }

  public ContactHalfSpace() {
    this(opensimSimulationJNI.new_ContactHalfSpace__SWIG_0(), true);
  }

  public ContactHalfSpace(Vec3 location, Vec3 orientation, PhysicalFrame frame) {
    this(opensimSimulationJNI.new_ContactHalfSpace__SWIG_1(Vec3.getCPtr(location), location, Vec3.getCPtr(orientation), orientation, PhysicalFrame.getCPtr(frame), frame), true);
  }

  public ContactHalfSpace(Vec3 location, Vec3 orientation, PhysicalFrame frame, String name) {
    this(opensimSimulationJNI.new_ContactHalfSpace__SWIG_2(Vec3.getCPtr(location), location, Vec3.getCPtr(orientation), orientation, PhysicalFrame.getCPtr(frame), frame, name), true);
  }

  public SWIGTYPE_p_SimTK__ContactGeometry createSimTKContactGeometry() {
    return new SWIGTYPE_p_SimTK__ContactGeometry(opensimSimulationJNI.ContactHalfSpace_createSimTKContactGeometry(swigCPtr, this), true);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State s, ArrayDecorativeGeometry geometry) {
    opensimSimulationJNI.ContactHalfSpace_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(s), s, ArrayDecorativeGeometry.getCPtr(geometry), geometry);
  }

}
