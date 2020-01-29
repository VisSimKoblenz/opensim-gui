/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class CoordinateDirection {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public CoordinateDirection(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(CoordinateDirection obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimbodyJNI.delete_CoordinateDirection(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class Negative {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    public Negative(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    public static long getCPtr(Negative obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          opensimSimbodyJNI.delete_CoordinateDirection_Negative(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public Negative() {
      this(opensimSimbodyJNI.new_CoordinateDirection_Negative(), true);
    }
  
  }

  public CoordinateDirection(CoordinateAxis axis) {
    this(opensimSimbodyJNI.new_CoordinateDirection__SWIG_0(CoordinateAxis.getCPtr(axis), axis), true);
  }

  public CoordinateDirection(CoordinateAxis axis, int direction) {
    this(opensimSimbodyJNI.new_CoordinateDirection__SWIG_1(CoordinateAxis.getCPtr(axis), axis, direction), true);
  }

  public CoordinateAxis getAxis() {
    return new CoordinateAxis(opensimSimbodyJNI.CoordinateDirection_getAxis(swigCPtr, this), true);
  }

  public int getDirection() {
    return opensimSimbodyJNI.CoordinateDirection_getDirection(swigCPtr, this);
  }

  public boolean hasSameAxis(CoordinateDirection dir2) {
    return opensimSimbodyJNI.CoordinateDirection_hasSameAxis(swigCPtr, this, CoordinateDirection.getCPtr(dir2), dir2);
  }

  public boolean isSameAxisAndDirection(CoordinateDirection dir2) {
    return opensimSimbodyJNI.CoordinateDirection_isSameAxisAndDirection(swigCPtr, this, CoordinateDirection.getCPtr(dir2), dir2);
  }

  public int dotProduct(CoordinateDirection dir2) {
    return opensimSimbodyJNI.CoordinateDirection_dotProduct(swigCPtr, this, CoordinateDirection.getCPtr(dir2), dir2);
  }

  public int crossProductSign(CoordinateDirection dir2) {
    return opensimSimbodyJNI.CoordinateDirection_crossProductSign(swigCPtr, this, CoordinateDirection.getCPtr(dir2), dir2);
  }

  public CoordinateAxis crossProductAxis(CoordinateDirection dir2) {
    return new CoordinateAxis(opensimSimbodyJNI.CoordinateDirection_crossProductAxis(swigCPtr, this, CoordinateDirection.getCPtr(dir2), dir2), true);
  }

  public CoordinateAxis crossProduct(CoordinateDirection dir2, SWIGTYPE_p_int sign) {
    return new CoordinateAxis(opensimSimbodyJNI.CoordinateDirection_crossProduct(swigCPtr, this, CoordinateDirection.getCPtr(dir2), dir2, SWIGTYPE_p_int.getCPtr(sign)), true);
  }

}
