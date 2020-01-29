/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class RowVectorBaseVec3 extends MatrixBaseVec3 {
  private transient long swigCPtr;

  public RowVectorBaseVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimSimbodyJNI.RowVectorBaseVec3_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(RowVectorBaseVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_RowVectorBaseVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RowVectorBaseVec3(int n) {
    this(opensimSimbodyJNI.new_RowVectorBaseVec3__SWIG_0(n), true);
  }

  public RowVectorBaseVec3() {
    this(opensimSimbodyJNI.new_RowVectorBaseVec3__SWIG_1(), true);
  }

  public RowVectorBaseVec3(RowVectorBaseVec3 source) {
    this(opensimSimbodyJNI.new_RowVectorBaseVec3__SWIG_2(RowVectorBaseVec3.getCPtr(source), source), true);
  }

  public RowVectorBaseVec3(int n, Vec3 initialValue) {
    this(opensimSimbodyJNI.new_RowVectorBaseVec3__SWIG_3(n, Vec3.getCPtr(initialValue), initialValue), true);
  }

  public int size() {
    return opensimSimbodyJNI.RowVectorBaseVec3_size(swigCPtr, this);
  }

  public int nrow() {
    return opensimSimbodyJNI.RowVectorBaseVec3_nrow(swigCPtr, this);
  }

  public int ncol() {
    return opensimSimbodyJNI.RowVectorBaseVec3_ncol(swigCPtr, this);
  }

  public SWIGTYPE_p_ptrdiff_t nelt() {
    return new SWIGTYPE_p_ptrdiff_t(opensimSimbodyJNI.RowVectorBaseVec3_nelt(swigCPtr, this), true);
  }

  public RowVectorViewVec3 index(SWIGTYPE_p_Array_T_int_t indices) {
    return new RowVectorViewVec3(opensimSimbodyJNI.RowVectorBaseVec3_index(swigCPtr, this, SWIGTYPE_p_Array_T_int_t.getCPtr(indices)), true);
  }

  public RowVectorViewVec3 updIndex(SWIGTYPE_p_Array_T_int_t indices) {
    return new RowVectorViewVec3(opensimSimbodyJNI.RowVectorBaseVec3_updIndex(swigCPtr, this, SWIGTYPE_p_Array_T_int_t.getCPtr(indices)), true);
  }

  public RowVectorBaseVec3 resize(int n) {
    return new RowVectorBaseVec3(opensimSimbodyJNI.RowVectorBaseVec3_resize(swigCPtr, this, n), false);
  }

  public RowVectorBaseVec3 resizeKeep(int n) {
    return new RowVectorBaseVec3(opensimSimbodyJNI.RowVectorBaseVec3_resizeKeep(swigCPtr, this, n), false);
  }

  public void clear() {
    opensimSimbodyJNI.RowVectorBaseVec3_clear(swigCPtr, this);
  }

  public Vec3 sum() {
    return new Vec3(opensimSimbodyJNI.RowVectorBaseVec3_sum(swigCPtr, this), true);
  }

  public SWIGTYPE_p_VectorIteratorT_SimTK__VecT_3_double_1_t_SimTK__RowVectorBaseT_SimTK__VecT_3_double_1_t_t_t begin() {
    return new SWIGTYPE_p_VectorIteratorT_SimTK__VecT_3_double_1_t_SimTK__RowVectorBaseT_SimTK__VecT_3_double_1_t_t_t(opensimSimbodyJNI.RowVectorBaseVec3_begin(swigCPtr, this), true);
  }

  public SWIGTYPE_p_VectorIteratorT_SimTK__VecT_3_double_1_t_SimTK__RowVectorBaseT_SimTK__VecT_3_double_1_t_t_t end() {
    return new SWIGTYPE_p_VectorIteratorT_SimTK__VecT_3_double_1_t_SimTK__RowVectorBaseT_SimTK__VecT_3_double_1_t_t_t(opensimSimbodyJNI.RowVectorBaseVec3_end(swigCPtr, this), true);
  }

  public Vec3 get(int i) {
    return new Vec3(opensimSimbodyJNI.RowVectorBaseVec3_get(swigCPtr, this, i), true);
  }

  public void set(int i, Vec3 value) {
    opensimSimbodyJNI.RowVectorBaseVec3_set(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public Vec3 __getitem__(int i) {
    return new Vec3(opensimSimbodyJNI.RowVectorBaseVec3___getitem__(swigCPtr, this, i), true);
  }

  public void __setitem__(int i, Vec3 value) {
    opensimSimbodyJNI.RowVectorBaseVec3___setitem__(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

}
