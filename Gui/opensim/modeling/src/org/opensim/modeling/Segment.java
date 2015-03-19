/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class Segment {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public Segment(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Segment obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimModelJNI.delete_Segment(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Segment() {
    this(opensimModelJNI.new_Segment__SWIG_0(), true);
  }

  public Segment(int l, int ofs) {
    this(opensimModelJNI.new_Segment__SWIG_1(l, ofs), true);
  }

  public Segment(int l) {
    this(opensimModelJNI.new_Segment__SWIG_2(l), true);
  }

  public void setLength(int value) {
    opensimModelJNI.Segment_length_set(swigCPtr, this, value);
  }

  public int getLength() {
    return opensimModelJNI.Segment_length_get(swigCPtr, this);
  }

  public void setOffset(int value) {
    opensimModelJNI.Segment_offset_set(swigCPtr, this, value);
  }

  public int getOffset() {
    return opensimModelJNI.Segment_offset_get(swigCPtr, this);
  }

}