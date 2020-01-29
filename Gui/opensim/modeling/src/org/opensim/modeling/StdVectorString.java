/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class StdVectorString {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public StdVectorString(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(StdVectorString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_StdVectorString(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public StdVectorString() {
    this(opensimSimbodyJNI.new_StdVectorString__SWIG_0(), true);
  }

  public StdVectorString(long n) {
    this(opensimSimbodyJNI.new_StdVectorString__SWIG_1(n), true);
  }

  public long size() {
    return opensimSimbodyJNI.StdVectorString_size(swigCPtr, this);
  }

  public long capacity() {
    return opensimSimbodyJNI.StdVectorString_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    opensimSimbodyJNI.StdVectorString_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return opensimSimbodyJNI.StdVectorString_isEmpty(swigCPtr, this);
  }

  public void clear() {
    opensimSimbodyJNI.StdVectorString_clear(swigCPtr, this);
  }

  public void add(String x) {
    opensimSimbodyJNI.StdVectorString_add(swigCPtr, this, x);
  }

  public String get(int i) {
    return opensimSimbodyJNI.StdVectorString_get(swigCPtr, this, i);
  }

  public void set(int i, String val) {
    opensimSimbodyJNI.StdVectorString_set(swigCPtr, this, i, val);
  }

}
