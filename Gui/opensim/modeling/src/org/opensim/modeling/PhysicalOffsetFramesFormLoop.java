/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PhysicalOffsetFramesFormLoop extends OpenSimException {
  private transient long swigCPtr;

  public PhysicalOffsetFramesFormLoop(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.PhysicalOffsetFramesFormLoop_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PhysicalOffsetFramesFormLoop obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_PhysicalOffsetFramesFormLoop(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public PhysicalOffsetFramesFormLoop(String file, long line, String func, OpenSimObject obj, String frameName) {
    this(opensimSimulationJNI.new_PhysicalOffsetFramesFormLoop(file, line, func, OpenSimObject.getCPtr(obj), obj, frameName), true);
  }

}
