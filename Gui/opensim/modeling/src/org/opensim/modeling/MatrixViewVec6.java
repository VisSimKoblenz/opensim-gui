/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MatrixViewVec6 extends MatrixBaseVec6 {
  private transient long swigCPtr;

  public MatrixViewVec6(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.MatrixViewVec6_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(MatrixViewVec6 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_MatrixViewVec6(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MatrixViewVec6(MatrixViewVec6 m) {
    this(opensimSimbodyJNI.new_MatrixViewVec6(MatrixViewVec6.getCPtr(m), m), true);
  }

}
