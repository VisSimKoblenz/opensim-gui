/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Quaternion extends Vec4 {
  private transient long swigCPtr;

  public Quaternion(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.Quaternion_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(Quaternion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_Quaternion(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Quaternion() {
    this(opensimSimbodyJNI.new_Quaternion__SWIG_0(), true);
  }

  public Quaternion(Quaternion q) {
    this(opensimSimbodyJNI.new_Quaternion__SWIG_1(Quaternion.getCPtr(q), q), true);
  }

  public Quaternion(double e0, double e1, double e2, double e3) {
    this(opensimSimbodyJNI.new_Quaternion__SWIG_2(e0, e1, e2, e3), true);
  }

  public Quaternion(Vec4 q) {
    this(opensimSimbodyJNI.new_Quaternion__SWIG_3(Vec4.getCPtr(q), q), true);
  }

  public void setQuaternionToZeroRotation() {
    opensimSimbodyJNI.Quaternion_setQuaternionToZeroRotation(swigCPtr, this);
  }

  public void setQuaternionToNaN() {
    opensimSimbodyJNI.Quaternion_setQuaternionToNaN(swigCPtr, this);
  }

  public Quaternion normalizeThis() {
    return new Quaternion(opensimSimbodyJNI.Quaternion_normalizeThis(swigCPtr, this), false);
  }

  public Quaternion normalize() {
    return new Quaternion(opensimSimbodyJNI.Quaternion_normalize(swigCPtr, this), true);
  }

  public Quaternion(Vec4 v, boolean arg1) {
    this(opensimSimbodyJNI.new_Quaternion__SWIG_4(Vec4.getCPtr(v), v, arg1), true);
  }

}
