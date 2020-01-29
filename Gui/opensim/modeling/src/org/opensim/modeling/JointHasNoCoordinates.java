/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class JointHasNoCoordinates extends OpenSimException {
  private transient long swigCPtr;

  public JointHasNoCoordinates(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.JointHasNoCoordinates_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(JointHasNoCoordinates obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_JointHasNoCoordinates(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public JointHasNoCoordinates(String file, long line, String func) {
    this(opensimSimulationJNI.new_JointHasNoCoordinates(file, line, func), true);
  }

}
