/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class RowVectorBaseRotation extends MatrixBaseRotation {
  private transient long swigCPtr;

  public RowVectorBaseRotation(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.RowVectorBaseRotation_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(RowVectorBaseRotation obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_RowVectorBaseRotation(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RowVectorBaseRotation(int n) {
    this(opensimSimbodyJNI.new_RowVectorBaseRotation__SWIG_0(n), true);
  }

  public RowVectorBaseRotation() {
    this(opensimSimbodyJNI.new_RowVectorBaseRotation__SWIG_1(), true);
  }

  public RowVectorBaseRotation(RowVectorBaseRotation source) {
    this(opensimSimbodyJNI.new_RowVectorBaseRotation__SWIG_2(RowVectorBaseRotation.getCPtr(source), source), true);
  }

  public RowVectorBaseRotation(int n, Rotation initialValue) {
    this(opensimSimbodyJNI.new_RowVectorBaseRotation__SWIG_3(n, Rotation.getCPtr(initialValue), initialValue), true);
  }

  public int size() {
    return opensimSimbodyJNI.RowVectorBaseRotation_size(swigCPtr, this);
  }

  public int nrow() {
    return opensimSimbodyJNI.RowVectorBaseRotation_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.RowVectorBaseRotation_ncol(swigCPtr, this);
  }

  public SWIGTYPE_p_ptrdiff_t nelt() {
    return new SWIGTYPE_p_ptrdiff_t(opensimSimbodyJNI.RowVectorBaseRotation_nelt(swigCPtr, this), true);
  }

  public RowVectorViewRotation index(SWIGTYPE_p_Array_T_int_t indices) {
    return new RowVectorViewRotation(opensimSimbodyJNI.RowVectorBaseRotation_index(swigCPtr, this, SWIGTYPE_p_Array_T_int_t.getCPtr(indices)), true);
  }

  public RowVectorViewRotation updIndex(SWIGTYPE_p_Array_T_int_t indices) {
    return new RowVectorViewRotation(opensimSimbodyJNI.RowVectorBaseRotation_updIndex(swigCPtr, this, SWIGTYPE_p_Array_T_int_t.getCPtr(indices)), true);
  }

  public RowVectorBaseRotation resize(int n) {
    return new RowVectorBaseRotation(opensimSimbodyJNI.RowVectorBaseRotation_resize(swigCPtr, this, n), false);
  }

  public RowVectorBaseRotation resizeKeep(int n) {
    return new RowVectorBaseRotation(opensimSimbodyJNI.RowVectorBaseRotation_resizeKeep(swigCPtr, this, n), false);
  }

  public void clear() {
    opensimSimbodyJNI.RowVectorBaseRotation_clear(swigCPtr, this);
  }

  public Rotation sum() {
    return new Rotation(opensimSimbodyJNI.RowVectorBaseRotation_sum(swigCPtr, this), true);
  }

  public SWIGTYPE_p_VectorIteratorT_SimTK__Rotation_T_double_t_SimTK__RowVectorBaseT_SimTK__Rotation_T_double_t_t_t begin() {
    return new SWIGTYPE_p_VectorIteratorT_SimTK__Rotation_T_double_t_SimTK__RowVectorBaseT_SimTK__Rotation_T_double_t_t_t(opensimSimbodyJNI.RowVectorBaseRotation_begin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_VectorIteratorT_SimTK__Rotation_T_double_t_SimTK__RowVectorBaseT_SimTK__Rotation_T_double_t_t_t end() {
    return new SWIGTYPE_p_VectorIteratorT_SimTK__Rotation_T_double_t_SimTK__RowVectorBaseT_SimTK__Rotation_T_double_t_t_t(opensimSimbodyJNI.RowVectorBaseRotation_end(swigCPtr, this), true);
  }

}
