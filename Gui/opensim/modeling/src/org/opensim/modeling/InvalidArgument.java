/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class InvalidArgument extends OpenSimException {
  private transient long swigCPtr;

  public InvalidArgument(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.InvalidArgument_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(InvalidArgument obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_InvalidArgument(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public InvalidArgument(String file, long line, String func, String msg) {
    this(opensimCommonJNI.new_InvalidArgument__SWIG_0(file, line, func, msg), true);
  }

  public InvalidArgument(String file, long line, String func) {
    this(opensimCommonJNI.new_InvalidArgument__SWIG_1(file, line, func), true);
  }

}
