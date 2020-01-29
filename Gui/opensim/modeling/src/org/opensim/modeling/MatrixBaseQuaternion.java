/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MatrixBaseQuaternion {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public MatrixBaseQuaternion(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(MatrixBaseQuaternion obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_MatrixBaseQuaternion(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int nrow() {
    return opensimSimbodyJNI.MatrixBaseQuaternion_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.MatrixBaseQuaternion_ncol(swigCPtr, this);
  }

  public boolean isResizeable() {
    return opensimSimbodyJNI.MatrixBaseQuaternion_isResizeable(swigCPtr, this);
  }

  public MatrixBaseQuaternion() {
    this(opensimSimbodyJNI.new_MatrixBaseQuaternion__SWIG_0(), true);
  }

  public MatrixBaseQuaternion(int m, int n) {
    this(opensimSimbodyJNI.new_MatrixBaseQuaternion__SWIG_1(m, n), true);
  }

  public void clear() {
    opensimSimbodyJNI.MatrixBaseQuaternion_clear(swigCPtr, this);
  }

  public MatrixBaseQuaternion setTo(Quaternion t) {
    return new MatrixBaseQuaternion(opensimSimbodyJNI.MatrixBaseQuaternion_setTo(swigCPtr, this, Quaternion.getCPtr(t), t), false);
  }

  public MatrixBaseQuaternion setToNaN() {
    return new MatrixBaseQuaternion(opensimSimbodyJNI.MatrixBaseQuaternion_setToNaN(swigCPtr, this), false);
  }

  public MatrixBaseQuaternion setToZero() {
    return new MatrixBaseQuaternion(opensimSimbodyJNI.MatrixBaseQuaternion_setToZero(swigCPtr, this), false);
  }

  public Quaternion getElt(int i, int j) {
    return new Quaternion(opensimSimbodyJNI.MatrixBaseQuaternion_getElt(swigCPtr, this, i, j), false);
  }

  public MatrixBaseQuaternion negateInPlace() {
    return new MatrixBaseQuaternion(opensimSimbodyJNI.MatrixBaseQuaternion_negateInPlace(swigCPtr, this), false);
  }

  public MatrixBaseQuaternion resize(int m, int n) {
    return new MatrixBaseQuaternion(opensimSimbodyJNI.MatrixBaseQuaternion_resize(swigCPtr, this, m, n), false);
  }

  public MatrixBaseQuaternion resizeKeep(int m, int n) {
    return new MatrixBaseQuaternion(opensimSimbodyJNI.MatrixBaseQuaternion_resizeKeep(swigCPtr, this, m, n), false);
  }

  public void lockShape() {
    opensimSimbodyJNI.MatrixBaseQuaternion_lockShape(swigCPtr, this);
  }

  public void unlockShape() {
    opensimSimbodyJNI.MatrixBaseQuaternion_unlockShape(swigCPtr, this);
  }

  public final static int NScalarsPerElement = opensimSimbodyJNI.MatrixBaseQuaternion_NScalarsPerElement_get();
  public final static int CppNScalarsPerElement = opensimSimbodyJNI.MatrixBaseQuaternion_CppNScalarsPerElement_get();

}
