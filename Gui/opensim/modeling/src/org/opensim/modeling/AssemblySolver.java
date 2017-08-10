/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class AssemblySolver extends Solver {
  private transient long swigCPtr;

  public AssemblySolver(long cPtr, boolean cMemoryOwn) {
    super(opensimSimulationJNI.AssemblySolver_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(AssemblySolver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_AssemblySolver(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static AssemblySolver safeDownCast(OpenSimObject obj) {
    long cPtr = opensimSimulationJNI.AssemblySolver_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new AssemblySolver(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimSimulationJNI.AssemblySolver_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimSimulationJNI.AssemblySolver_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.AssemblySolver_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new AssemblySolver(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.AssemblySolver_getConcreteClassName(swigCPtr, this);
  }

  public AssemblySolver(Model model, SimTKArrayCoordinateReference coordinateReferences, double constraintWeight) {
    this(opensimSimulationJNI.new_AssemblySolver__SWIG_0(Model.getCPtr(model), model, SimTKArrayCoordinateReference.getCPtr(coordinateReferences), coordinateReferences, constraintWeight), true);
  }

  public AssemblySolver(Model model, SimTKArrayCoordinateReference coordinateReferences) {
    this(opensimSimulationJNI.new_AssemblySolver__SWIG_1(Model.getCPtr(model), model, SimTKArrayCoordinateReference.getCPtr(coordinateReferences), coordinateReferences), true);
  }

  public void setAccuracy(double accuracy) {
    opensimSimulationJNI.AssemblySolver_setAccuracy(swigCPtr, this, accuracy);
  }

  public void setConstraintWeight(double weight) {
    opensimSimulationJNI.AssemblySolver_setConstraintWeight(swigCPtr, this, weight);
  }

  public SimTKArrayCoordinateReference getCoordinateReferences() {
    return new SimTKArrayCoordinateReference(opensimSimulationJNI.AssemblySolver_getCoordinateReferences(swigCPtr, this), false);
  }

  public void updateCoordinateReference(String coordName, double value, double weight) {
    opensimSimulationJNI.AssemblySolver_updateCoordinateReference__SWIG_0(swigCPtr, this, coordName, value, weight);
  }

  public void updateCoordinateReference(String coordName, double value) {
    opensimSimulationJNI.AssemblySolver_updateCoordinateReference__SWIG_1(swigCPtr, this, coordName, value);
  }

  public void assemble(State s) {
    opensimSimulationJNI.AssemblySolver_assemble(swigCPtr, this, State.getCPtr(s), s);
  }

  public void track(State s) {
    opensimSimulationJNI.AssemblySolver_track(swigCPtr, this, State.getCPtr(s), s);
  }

  public SWIGTYPE_p_SimTK__Assembler getAssembler() {
    return new SWIGTYPE_p_SimTK__Assembler(opensimSimulationJNI.AssemblySolver_getAssembler(swigCPtr, this), false);
  }

}
