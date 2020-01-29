/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class MuscleIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public MuscleIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(MuscleIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimSimulationJNI.delete_MuscleIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean equals(MuscleIterator other) {
    return opensimSimulationJNI.MuscleIterator_equals(swigCPtr, this, MuscleIterator.getCPtr(other), other);
  }

  public Muscle __ref__() {
    return new Muscle(opensimSimulationJNI.MuscleIterator___ref__(swigCPtr, this), false);
  }

  public Muscle deref() {
    return new Muscle(opensimSimulationJNI.MuscleIterator_deref(swigCPtr, this), false);
  }

  public Muscle __deref__() {
    long cPtr = opensimSimulationJNI.MuscleIterator___deref__(swigCPtr, this);
    return (cPtr == 0) ? null : new Muscle(cPtr, false);
  }

  public MuscleIterator next() {
    return new MuscleIterator(opensimSimulationJNI.MuscleIterator_next(swigCPtr, this), false);
  }

  public OpenSimObject clone() {
    long cPtr = opensimSimulationJNI.MuscleIterator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new Muscle(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimSimulationJNI.MuscleIterator_getConcreteClassName(swigCPtr, this);
  }

  public double get_max_isometric_force(int i) {
    return opensimSimulationJNI.MuscleIterator_get_max_isometric_force__SWIG_0(swigCPtr, this, i);
  }

  public double get_max_isometric_force() {
    return opensimSimulationJNI.MuscleIterator_get_max_isometric_force__SWIG_1(swigCPtr, this);
  }

  public double get_optimal_fiber_length(int i) {
    return opensimSimulationJNI.MuscleIterator_get_optimal_fiber_length__SWIG_0(swigCPtr, this, i);
  }

  public double get_optimal_fiber_length() {
    return opensimSimulationJNI.MuscleIterator_get_optimal_fiber_length__SWIG_1(swigCPtr, this);
  }

  public double get_tendon_slack_length(int i) {
    return opensimSimulationJNI.MuscleIterator_get_tendon_slack_length__SWIG_0(swigCPtr, this, i);
  }

  public double get_tendon_slack_length() {
    return opensimSimulationJNI.MuscleIterator_get_tendon_slack_length__SWIG_1(swigCPtr, this);
  }

  public double get_pennation_angle_at_optimal(int i) {
    return opensimSimulationJNI.MuscleIterator_get_pennation_angle_at_optimal__SWIG_0(swigCPtr, this, i);
  }

  public double get_pennation_angle_at_optimal() {
    return opensimSimulationJNI.MuscleIterator_get_pennation_angle_at_optimal__SWIG_1(swigCPtr, this);
  }

  public double get_max_contraction_velocity(int i) {
    return opensimSimulationJNI.MuscleIterator_get_max_contraction_velocity__SWIG_0(swigCPtr, this, i);
  }

  public double get_max_contraction_velocity() {
    return opensimSimulationJNI.MuscleIterator_get_max_contraction_velocity__SWIG_1(swigCPtr, this);
  }

  public boolean get_ignore_tendon_compliance(int i) {
    return opensimSimulationJNI.MuscleIterator_get_ignore_tendon_compliance__SWIG_0(swigCPtr, this, i);
  }

  public boolean get_ignore_tendon_compliance() {
    return opensimSimulationJNI.MuscleIterator_get_ignore_tendon_compliance__SWIG_1(swigCPtr, this);
  }

  public boolean get_ignore_activation_dynamics(int i) {
    return opensimSimulationJNI.MuscleIterator_get_ignore_activation_dynamics__SWIG_0(swigCPtr, this, i);
  }

  public boolean get_ignore_activation_dynamics() {
    return opensimSimulationJNI.MuscleIterator_get_ignore_activation_dynamics__SWIG_1(swigCPtr, this);
  }

  public boolean get_has_output_excitation() {
    return opensimSimulationJNI.MuscleIterator__has_output_excitation_get(swigCPtr, this);
  }

  public boolean get_has_output_activation() {
    return opensimSimulationJNI.MuscleIterator__has_output_activation_get(swigCPtr, this);
  }

  public boolean get_has_output_fiber_length() {
    return opensimSimulationJNI.MuscleIterator__has_output_fiber_length_get(swigCPtr, this);
  }

  public boolean get_has_output_pennation_angle() {
    return opensimSimulationJNI.MuscleIterator__has_output_pennation_angle_get(swigCPtr, this);
  }

  public boolean get_has_output_cos_pennation_angle() {
    return opensimSimulationJNI.MuscleIterator__has_output_cos_pennation_angle_get(swigCPtr, this);
  }

  public boolean get_has_output_tendon_length() {
    return opensimSimulationJNI.MuscleIterator__has_output_tendon_length_get(swigCPtr, this);
  }

  public boolean get_has_output_normalized_fiber_length() {
    return opensimSimulationJNI.MuscleIterator__has_output_normalized_fiber_length_get(swigCPtr, this);
  }

  public boolean get_has_output_fiber_length_along_tendon() {
    return opensimSimulationJNI.MuscleIterator__has_output_fiber_length_along_tendon_get(swigCPtr, this);
  }

  public boolean get_has_output_tendon_strain() {
    return opensimSimulationJNI.MuscleIterator__has_output_tendon_strain_get(swigCPtr, this);
  }

  public boolean get_has_output_passive_force_multiplier() {
    return opensimSimulationJNI.MuscleIterator__has_output_passive_force_multiplier_get(swigCPtr, this);
  }

  public boolean get_has_output_active_force_length_multiplier() {
    return opensimSimulationJNI.MuscleIterator__has_output_active_force_length_multiplier_get(swigCPtr, this);
  }

  public boolean get_has_output_fiber_velocity() {
    return opensimSimulationJNI.MuscleIterator__has_output_fiber_velocity_get(swigCPtr, this);
  }

  public boolean get_has_output_normalized_fiber_velocity() {
    return opensimSimulationJNI.MuscleIterator__has_output_normalized_fiber_velocity_get(swigCPtr, this);
  }

  public boolean get_has_output_fiber_velocity_along_tendon() {
    return opensimSimulationJNI.MuscleIterator__has_output_fiber_velocity_along_tendon_get(swigCPtr, this);
  }

  public boolean get_has_output_tendon_velocity() {
    return opensimSimulationJNI.MuscleIterator__has_output_tendon_velocity_get(swigCPtr, this);
  }

  public boolean get_has_output_force_velocity_multiplier() {
    return opensimSimulationJNI.MuscleIterator__has_output_force_velocity_multiplier_get(swigCPtr, this);
  }

  public boolean get_has_output_pennation_angular_velocity() {
    return opensimSimulationJNI.MuscleIterator__has_output_pennation_angular_velocity_get(swigCPtr, this);
  }

  public boolean get_has_output_fiber_force() {
    return opensimSimulationJNI.MuscleIterator__has_output_fiber_force_get(swigCPtr, this);
  }

  public boolean get_has_output_fiber_force_along_tendon() {
    return opensimSimulationJNI.MuscleIterator__has_output_fiber_force_along_tendon_get(swigCPtr, this);
  }

  public boolean get_has_output_active_fiber_force() {
    return opensimSimulationJNI.MuscleIterator__has_output_active_fiber_force_get(swigCPtr, this);
  }

  public boolean get_has_output_passive_fiber_force() {
    return opensimSimulationJNI.MuscleIterator__has_output_passive_fiber_force_get(swigCPtr, this);
  }

  public boolean get_has_output_active_fiber_force_along_tendon() {
    return opensimSimulationJNI.MuscleIterator__has_output_active_fiber_force_along_tendon_get(swigCPtr, this);
  }

  public boolean get_has_output_passive_fiber_force_along_tendon() {
    return opensimSimulationJNI.MuscleIterator__has_output_passive_fiber_force_along_tendon_get(swigCPtr, this);
  }

  public boolean get_has_output_tendon_force() {
    return opensimSimulationJNI.MuscleIterator__has_output_tendon_force_get(swigCPtr, this);
  }

  public boolean get_has_output_fiber_stiffness() {
    return opensimSimulationJNI.MuscleIterator__has_output_fiber_stiffness_get(swigCPtr, this);
  }

  public boolean get_has_output_fiber_stiffness_along_tendon() {
    return opensimSimulationJNI.MuscleIterator__has_output_fiber_stiffness_along_tendon_get(swigCPtr, this);
  }

  public boolean get_has_output_tendon_stiffness() {
    return opensimSimulationJNI.MuscleIterator__has_output_tendon_stiffness_get(swigCPtr, this);
  }

  public boolean get_has_output_muscle_stiffness() {
    return opensimSimulationJNI.MuscleIterator__has_output_muscle_stiffness_get(swigCPtr, this);
  }

  public boolean get_has_output_fiber_active_power() {
    return opensimSimulationJNI.MuscleIterator__has_output_fiber_active_power_get(swigCPtr, this);
  }

  public boolean get_has_output_fiber_passive_power() {
    return opensimSimulationJNI.MuscleIterator__has_output_fiber_passive_power_get(swigCPtr, this);
  }

  public boolean get_has_output_tendon_power() {
    return opensimSimulationJNI.MuscleIterator__has_output_tendon_power_get(swigCPtr, this);
  }

  public boolean get_has_output_muscle_power() {
    return opensimSimulationJNI.MuscleIterator__has_output_muscle_power_get(swigCPtr, this);
  }

  public double getMaxIsometricForce() {
    return opensimSimulationJNI.MuscleIterator_getMaxIsometricForce(swigCPtr, this);
  }

  public double getOptimalFiberLength() {
    return opensimSimulationJNI.MuscleIterator_getOptimalFiberLength(swigCPtr, this);
  }

  public double getTendonSlackLength() {
    return opensimSimulationJNI.MuscleIterator_getTendonSlackLength(swigCPtr, this);
  }

  public double getPennationAngleAtOptimalFiberLength() {
    return opensimSimulationJNI.MuscleIterator_getPennationAngleAtOptimalFiberLength(swigCPtr, this);
  }

  public double getMaxContractionVelocity() {
    return opensimSimulationJNI.MuscleIterator_getMaxContractionVelocity(swigCPtr, this);
  }

  public boolean getIgnoreTendonCompliance(State s) {
    return opensimSimulationJNI.MuscleIterator_getIgnoreTendonCompliance(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setIgnoreTendonCompliance(State s, boolean ignore) {
    opensimSimulationJNI.MuscleIterator_setIgnoreTendonCompliance(swigCPtr, this, State.getCPtr(s), s, ignore);
  }

  public boolean getIgnoreActivationDynamics(State s) {
    return opensimSimulationJNI.MuscleIterator_getIgnoreActivationDynamics(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setIgnoreActivationDynamics(State s, boolean ignore) {
    opensimSimulationJNI.MuscleIterator_setIgnoreActivationDynamics(swigCPtr, this, State.getCPtr(s), s, ignore);
  }

  public double getActivation(State s) {
    return opensimSimulationJNI.MuscleIterator_getActivation(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberLength(State s) {
    return opensimSimulationJNI.MuscleIterator_getFiberLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPennationAngle(State s) {
    return opensimSimulationJNI.MuscleIterator_getPennationAngle(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getCosPennationAngle(State s) {
    return opensimSimulationJNI.MuscleIterator_getCosPennationAngle(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonLength(State s) {
    return opensimSimulationJNI.MuscleIterator_getTendonLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getNormalizedFiberLength(State s) {
    return opensimSimulationJNI.MuscleIterator_getNormalizedFiberLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberLengthAlongTendon(State s) {
    return opensimSimulationJNI.MuscleIterator_getFiberLengthAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonStrain(State s) {
    return opensimSimulationJNI.MuscleIterator_getTendonStrain(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberPotentialEnergy(State s) {
    return opensimSimulationJNI.MuscleIterator_getFiberPotentialEnergy(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonPotentialEnergy(State s) {
    return opensimSimulationJNI.MuscleIterator_getTendonPotentialEnergy(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getMusclePotentialEnergy(State s) {
    return opensimSimulationJNI.MuscleIterator_getMusclePotentialEnergy(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPassiveForceMultiplier(State s) {
    return opensimSimulationJNI.MuscleIterator_getPassiveForceMultiplier(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getActiveForceLengthMultiplier(State s) {
    return opensimSimulationJNI.MuscleIterator_getActiveForceLengthMultiplier(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberVelocity(State s) {
    return opensimSimulationJNI.MuscleIterator_getFiberVelocity(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getNormalizedFiberVelocity(State s) {
    return opensimSimulationJNI.MuscleIterator_getNormalizedFiberVelocity(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberVelocityAlongTendon(State s) {
    return opensimSimulationJNI.MuscleIterator_getFiberVelocityAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPennationAngularVelocity(State s) {
    return opensimSimulationJNI.MuscleIterator_getPennationAngularVelocity(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonVelocity(State s) {
    return opensimSimulationJNI.MuscleIterator_getTendonVelocity(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getForceVelocityMultiplier(State s) {
    return opensimSimulationJNI.MuscleIterator_getForceVelocityMultiplier(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberForce(State s) {
    return opensimSimulationJNI.MuscleIterator_getFiberForce(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberForceAlongTendon(State s) {
    return opensimSimulationJNI.MuscleIterator_getFiberForceAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getActiveFiberForce(State s) {
    return opensimSimulationJNI.MuscleIterator_getActiveFiberForce(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPassiveFiberForce(State s) {
    return opensimSimulationJNI.MuscleIterator_getPassiveFiberForce(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getActiveFiberForceAlongTendon(State s) {
    return opensimSimulationJNI.MuscleIterator_getActiveFiberForceAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPassiveFiberForceAlongTendon(State s) {
    return opensimSimulationJNI.MuscleIterator_getPassiveFiberForceAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonForce(State s) {
    return opensimSimulationJNI.MuscleIterator_getTendonForce(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberStiffness(State s) {
    return opensimSimulationJNI.MuscleIterator_getFiberStiffness(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberStiffnessAlongTendon(State s) {
    return opensimSimulationJNI.MuscleIterator_getFiberStiffnessAlongTendon(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonStiffness(State s) {
    return opensimSimulationJNI.MuscleIterator_getTendonStiffness(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getMuscleStiffness(State s) {
    return opensimSimulationJNI.MuscleIterator_getMuscleStiffness(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberActivePower(State s) {
    return opensimSimulationJNI.MuscleIterator_getFiberActivePower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getFiberPassivePower(State s) {
    return opensimSimulationJNI.MuscleIterator_getFiberPassivePower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getTendonPower(State s) {
    return opensimSimulationJNI.MuscleIterator_getTendonPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getMusclePower(State s) {
    return opensimSimulationJNI.MuscleIterator_getMusclePower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getStress(State s) {
    return opensimSimulationJNI.MuscleIterator_getStress(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setExcitation(State s, double excitation) {
    opensimSimulationJNI.MuscleIterator_setExcitation(swigCPtr, this, State.getCPtr(s), s, excitation);
  }

  public double getExcitation(State s) {
    return opensimSimulationJNI.MuscleIterator_getExcitation(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setActivation(State s, double activation) {
    opensimSimulationJNI.MuscleIterator_setActivation(swigCPtr, this, State.getCPtr(s), s, activation);
  }

  public double computeActuation(State s) {
    return opensimSimulationJNI.MuscleIterator_computeActuation(swigCPtr, this, State.getCPtr(s), s);
  }

  public void computeEquilibrium(State s) {
    opensimSimulationJNI.MuscleIterator_computeEquilibrium(swigCPtr, this, State.getCPtr(s), s);
  }

  public double calcInextensibleTendonActiveFiberForce(State s, double aActivation) {
    return opensimSimulationJNI.MuscleIterator_calcInextensibleTendonActiveFiberForce(swigCPtr, this, State.getCPtr(s), s, aActivation);
  }

  public GeometryPath get_GeometryPath(int i) {
    return new GeometryPath(opensimSimulationJNI.MuscleIterator_get_GeometryPath__SWIG_0(swigCPtr, this, i), false);
  }

  public GeometryPath get_GeometryPath() {
    return new GeometryPath(opensimSimulationJNI.MuscleIterator_get_GeometryPath__SWIG_1(swigCPtr, this), false);
  }

  public double get_optimal_force(int i) {
    return opensimSimulationJNI.MuscleIterator_get_optimal_force__SWIG_0(swigCPtr, this, i);
  }

  public double get_optimal_force() {
    return opensimSimulationJNI.MuscleIterator_get_optimal_force__SWIG_1(swigCPtr, this);
  }

  public boolean get_has_output_tension() {
    return opensimSimulationJNI.MuscleIterator__has_output_tension_get(swigCPtr, this);
  }

  public GeometryPath getGeometryPath() {
    return new GeometryPath(opensimSimulationJNI.MuscleIterator_getGeometryPath(swigCPtr, this), false);
  }

  public boolean hasGeometryPath() {
    return opensimSimulationJNI.MuscleIterator_hasGeometryPath(swigCPtr, this);
  }

  public double getOptimalForce() {
    return opensimSimulationJNI.MuscleIterator_getOptimalForce(swigCPtr, this);
  }

  public double getLength(State s) {
    return opensimSimulationJNI.MuscleIterator_getLength(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getLengtheningSpeed(State s) {
    return opensimSimulationJNI.MuscleIterator_getLengtheningSpeed(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getPower(State s) {
    return opensimSimulationJNI.MuscleIterator_getPower(swigCPtr, this, State.getCPtr(s), s);
  }

  public double computeMomentArm(State s, Coordinate aCoord) {
    return opensimSimulationJNI.MuscleIterator_computeMomentArm(swigCPtr, this, State.getCPtr(s), s, Coordinate.getCPtr(aCoord), aCoord);
  }

  public double get_min_control(int i) {
    return opensimSimulationJNI.MuscleIterator_get_min_control__SWIG_0(swigCPtr, this, i);
  }

  public double get_min_control() {
    return opensimSimulationJNI.MuscleIterator_get_min_control__SWIG_1(swigCPtr, this);
  }

  public double get_max_control(int i) {
    return opensimSimulationJNI.MuscleIterator_get_max_control__SWIG_0(swigCPtr, this, i);
  }

  public double get_max_control() {
    return opensimSimulationJNI.MuscleIterator_get_max_control__SWIG_1(swigCPtr, this);
  }

  public boolean get_has_output_actuation() {
    return opensimSimulationJNI.MuscleIterator__has_output_actuation_get(swigCPtr, this);
  }

  public boolean get_has_output_speed() {
    return opensimSimulationJNI.MuscleIterator__has_output_speed_get(swigCPtr, this);
  }

  public double getControl(State s) {
    return opensimSimulationJNI.MuscleIterator_getControl(swigCPtr, this, State.getCPtr(s), s);
  }

  public int numControls() {
    return opensimSimulationJNI.MuscleIterator_numControls(swigCPtr, this);
  }

  public void setActuation(State s, double aActuation) {
    opensimSimulationJNI.MuscleIterator_setActuation(swigCPtr, this, State.getCPtr(s), s, aActuation);
  }

  public double getActuation(State s) {
    return opensimSimulationJNI.MuscleIterator_getActuation(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setSpeed(State s, double aspeed) {
    opensimSimulationJNI.MuscleIterator_setSpeed(swigCPtr, this, State.getCPtr(s), s, aspeed);
  }

  public double getSpeed(State s) {
    return opensimSimulationJNI.MuscleIterator_getSpeed(swigCPtr, this, State.getCPtr(s), s);
  }

  public double getMinControl() {
    return opensimSimulationJNI.MuscleIterator_getMinControl(swigCPtr, this);
  }

  public double getMaxControl() {
    return opensimSimulationJNI.MuscleIterator_getMaxControl(swigCPtr, this);
  }

  public void overrideActuation(State s, boolean flag) {
    opensimSimulationJNI.MuscleIterator_overrideActuation(swigCPtr, this, State.getCPtr(s), s, flag);
  }

  public boolean isActuationOverridden(State s) {
    return opensimSimulationJNI.MuscleIterator_isActuationOverridden(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setOverrideActuation(State s, double value) {
    opensimSimulationJNI.MuscleIterator_setOverrideActuation(swigCPtr, this, State.getCPtr(s), s, value);
  }

  public double getOverrideActuation(State s) {
    return opensimSimulationJNI.MuscleIterator_getOverrideActuation(swigCPtr, this, State.getCPtr(s), s);
  }

  public void getControls(Vector modelControls, Vector actuatorControls) {
    opensimSimulationJNI.MuscleIterator_getControls(swigCPtr, this, Vector.getCPtr(modelControls), modelControls, Vector.getCPtr(actuatorControls), actuatorControls);
  }

  public void setControls(Vector actuatorControls, Vector modelControls) {
    opensimSimulationJNI.MuscleIterator_setControls(swigCPtr, this, Vector.getCPtr(actuatorControls), actuatorControls, Vector.getCPtr(modelControls), modelControls);
  }

  public void addInControls(Vector actuatorControls, Vector modelControls) {
    opensimSimulationJNI.MuscleIterator_addInControls(swigCPtr, this, Vector.getCPtr(actuatorControls), actuatorControls, Vector.getCPtr(modelControls), modelControls);
  }

  public boolean get_appliesForce(int i) {
    return opensimSimulationJNI.MuscleIterator_get_appliesForce__SWIG_0(swigCPtr, this, i);
  }

  public boolean get_appliesForce() {
    return opensimSimulationJNI.MuscleIterator_get_appliesForce__SWIG_1(swigCPtr, this);
  }

  public boolean get_has_output_potential_energy() {
    return opensimSimulationJNI.MuscleIterator__has_output_potential_energy_get(swigCPtr, this);
  }

  public boolean shouldBeParallelized() {
    return opensimSimulationJNI.MuscleIterator_shouldBeParallelized(swigCPtr, this);
  }

  public boolean appliesForce(State s) {
    return opensimSimulationJNI.MuscleIterator_appliesForce(swigCPtr, this, State.getCPtr(s), s);
  }

  public void setAppliesForce(State s, boolean applyForce) {
    opensimSimulationJNI.MuscleIterator_setAppliesForce(swigCPtr, this, State.getCPtr(s), s, applyForce);
  }

  public Model getModel() {
    return new Model(opensimSimulationJNI.MuscleIterator_getModel(swigCPtr, this), false);
  }

  public boolean hasModel() {
    return opensimSimulationJNI.MuscleIterator_hasModel(swigCPtr, this);
  }

  public void addToSystem(SWIGTYPE_p_SimTK__MultibodySystem system) {
    opensimSimulationJNI.MuscleIterator_addToSystem(swigCPtr, this, SWIGTYPE_p_SimTK__MultibodySystem.getCPtr(system));
  }

  public void initStateFromProperties(State state) {
    opensimSimulationJNI.MuscleIterator_initStateFromProperties(swigCPtr, this, State.getCPtr(state), state);
  }

  public void generateDecorations(boolean fixed, ModelDisplayHints hints, State state, ArrayDecorativeGeometry appendToThis) {
    opensimSimulationJNI.MuscleIterator_generateDecorations(swigCPtr, this, fixed, ModelDisplayHints.getCPtr(hints), hints, State.getCPtr(state), state, ArrayDecorativeGeometry.getCPtr(appendToThis), appendToThis);
  }

  public SWIGTYPE_p_SimTK__MultibodySystem getSystem() {
    return new SWIGTYPE_p_SimTK__MultibodySystem(opensimSimulationJNI.MuscleIterator_getSystem(swigCPtr, this), false);
  }

  public boolean hasSystem() {
    return opensimSimulationJNI.MuscleIterator_hasSystem(swigCPtr, this);
  }

  public boolean isComponentInOwnershipTree(Component component) {
    return opensimSimulationJNI.MuscleIterator_isComponentInOwnershipTree(swigCPtr, this, Component.getCPtr(component), component);
  }

  public String getAbsolutePathString() {
    return opensimSimulationJNI.MuscleIterator_getAbsolutePathString(swigCPtr, this);
  }

  public ComponentPath getAbsolutePath() {
    return new ComponentPath(opensimSimulationJNI.MuscleIterator_getAbsolutePath(swigCPtr, this), true);
  }

  public String getRelativePathString(Component wrt) {
    return opensimSimulationJNI.MuscleIterator_getRelativePathString(swigCPtr, this, Component.getCPtr(wrt), wrt);
  }

  public ComponentPath getRelativePath(Component wrt) {
    return new ComponentPath(opensimSimulationJNI.MuscleIterator_getRelativePath(swigCPtr, this, Component.getCPtr(wrt), wrt), true);
  }

  public boolean hasComponent(String pathname) {
    return opensimSimulationJNI.MuscleIterator_hasComponent(swigCPtr, this, pathname);
  }

  public Component getComponent(String pathname) {
    return new Component(opensimSimulationJNI.MuscleIterator_getComponent(swigCPtr, this, pathname), false);
  }

  public long printComponentsMatching(String substring) {
    return opensimSimulationJNI.MuscleIterator_printComponentsMatching(swigCPtr, this, substring);
  }

  public int getNumStateVariables() {
    return opensimSimulationJNI.MuscleIterator_getNumStateVariables(swigCPtr, this);
  }

  public ArrayStr getStateVariableNames() {
    return new ArrayStr(opensimSimulationJNI.MuscleIterator_getStateVariableNames(swigCPtr, this), true);
  }

  public int getNumSockets() {
    return opensimSimulationJNI.MuscleIterator_getNumSockets(swigCPtr, this);
  }

  public OpenSimObject getConnectee(String name) {
    return new OpenSimObject(opensimSimulationJNI.MuscleIterator_getConnectee(swigCPtr, this, name), false);
  }

  public AbstractSocket getSocket(String name) {
    return new AbstractSocket(opensimSimulationJNI.MuscleIterator_getSocket(swigCPtr, this, name), false);
  }

  public int getNumInputs() {
    return opensimSimulationJNI.MuscleIterator_getNumInputs(swigCPtr, this);
  }

  public int getNumOutputs() {
    return opensimSimulationJNI.MuscleIterator_getNumOutputs(swigCPtr, this);
  }

  public StdVectorString getInputNames() {
    return new StdVectorString(opensimSimulationJNI.MuscleIterator_getInputNames(swigCPtr, this), true);
  }

  public StdVectorString getOutputNames() {
    return new StdVectorString(opensimSimulationJNI.MuscleIterator_getOutputNames(swigCPtr, this), true);
  }

  public AbstractInput getInput(String name) {
    return new AbstractInput(opensimSimulationJNI.MuscleIterator_getInput(swigCPtr, this, name), false);
  }

  public AbstractOutput getOutput(String name) {
    return new AbstractOutput(opensimSimulationJNI.MuscleIterator_getOutput(swigCPtr, this, name), false);
  }

  public int getModelingOption(State state, String name) {
    return opensimSimulationJNI.MuscleIterator_getModelingOption(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setModelingOption(State state, String name, int flag) {
    opensimSimulationJNI.MuscleIterator_setModelingOption(swigCPtr, this, State.getCPtr(state), state, name, flag);
  }

  public double getStateVariableValue(State state, String name) {
    return opensimSimulationJNI.MuscleIterator_getStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setStateVariableValue(State state, String name, double value) {
    opensimSimulationJNI.MuscleIterator_setStateVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public Vector getStateVariableValues(State state) {
    return new Vector(opensimSimulationJNI.MuscleIterator_getStateVariableValues(swigCPtr, this, State.getCPtr(state), state), true);
  }

  public void setStateVariableValues(State state, Vector values) {
    opensimSimulationJNI.MuscleIterator_setStateVariableValues(swigCPtr, this, State.getCPtr(state), state, Vector.getCPtr(values), values);
  }

  public double getStateVariableDerivativeValue(State state, String name) {
    return opensimSimulationJNI.MuscleIterator_getStateVariableDerivativeValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public double getDiscreteVariableValue(State state, String name) {
    return opensimSimulationJNI.MuscleIterator_getDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void setDiscreteVariableValue(State state, String name, double value) {
    opensimSimulationJNI.MuscleIterator_setDiscreteVariableValue(swigCPtr, this, State.getCPtr(state), state, name, value);
  }

  public void markCacheVariableValid(State state, String name) {
    opensimSimulationJNI.MuscleIterator_markCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void markCacheVariableInvalid(State state, String name) {
    opensimSimulationJNI.MuscleIterator_markCacheVariableInvalid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public boolean isCacheVariableValid(State state, String name) {
    return opensimSimulationJNI.MuscleIterator_isCacheVariableValid(swigCPtr, this, State.getCPtr(state), state, name);
  }

  public void printSubcomponentInfo() {
    opensimSimulationJNI.MuscleIterator_printSubcomponentInfo(swigCPtr, this);
  }

  public void printSocketInfo() {
    opensimSimulationJNI.MuscleIterator_printSocketInfo(swigCPtr, this);
  }

  public void printInputInfo() {
    opensimSimulationJNI.MuscleIterator_printInputInfo(swigCPtr, this);
  }

  public void printOutputInfo(boolean includeDescendants) {
    opensimSimulationJNI.MuscleIterator_printOutputInfo__SWIG_0(swigCPtr, this, includeDescendants);
  }

  public void printOutputInfo() {
    opensimSimulationJNI.MuscleIterator_printOutputInfo__SWIG_1(swigCPtr, this);
  }

  public Component getOwner() {
    return new Component(opensimSimulationJNI.MuscleIterator_getOwner(swigCPtr, this), false);
  }

  public boolean hasOwner() {
    return opensimSimulationJNI.MuscleIterator_hasOwner(swigCPtr, this);
  }

  public Component getRoot() {
    return new Component(opensimSimulationJNI.MuscleIterator_getRoot(swigCPtr, this), false);
  }

  public Component findComponent(ComponentPath pathToFind) {
    long cPtr = opensimSimulationJNI.MuscleIterator_findComponent__SWIG_2(swigCPtr, this, ComponentPath.getCPtr(pathToFind), pathToFind);
    return (cPtr == 0) ? null : new Component(cPtr, false);
  }

  public Component findComponent(String pathToFind) {
    long cPtr = opensimSimulationJNI.MuscleIterator_findComponent__SWIG_3(swigCPtr, this, pathToFind);
    return (cPtr == 0) ? null : new Component(cPtr, false);
  }

  public ComponentsList getComponentsList() {
    return new ComponentsList(opensimSimulationJNI.MuscleIterator_getComponentsList(swigCPtr, this), true);
  }

  public boolean isEqualTo(OpenSimObject aObject) {
    return opensimSimulationJNI.MuscleIterator_isEqualTo(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public String getName() {
    return opensimSimulationJNI.MuscleIterator_getName(swigCPtr, this);
  }

  public String getDescription() {
    return opensimSimulationJNI.MuscleIterator_getDescription(swigCPtr, this);
  }

  public String getAuthors() {
    return opensimSimulationJNI.MuscleIterator_getAuthors(swigCPtr, this);
  }

  public String getReferences() {
    return opensimSimulationJNI.MuscleIterator_getReferences(swigCPtr, this);
  }

  public int getNumProperties() {
    return opensimSimulationJNI.MuscleIterator_getNumProperties(swigCPtr, this);
  }

  public AbstractProperty getPropertyByIndex(int propertyIndex) {
    return new AbstractProperty(opensimSimulationJNI.MuscleIterator_getPropertyByIndex(swigCPtr, this, propertyIndex), false);
  }

  public boolean hasProperty(String name) {
    return opensimSimulationJNI.MuscleIterator_hasProperty(swigCPtr, this, name);
  }

  public AbstractProperty getPropertyByName(String name) {
    return new AbstractProperty(opensimSimulationJNI.MuscleIterator_getPropertyByName(swigCPtr, this, name), false);
  }

  public boolean isObjectUpToDateWithProperties() {
    return opensimSimulationJNI.MuscleIterator_isObjectUpToDateWithProperties(swigCPtr, this);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent, AbstractProperty prop) {
    opensimSimulationJNI.MuscleIterator_updateXMLNode__SWIG_0(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent), AbstractProperty.getCPtr(prop), prop);
  }

  public void updateXMLNode(SWIGTYPE_p_SimTK__Xml__Element parent) {
    opensimSimulationJNI.MuscleIterator_updateXMLNode__SWIG_1(swigCPtr, this, SWIGTYPE_p_SimTK__Xml__Element.getCPtr(parent));
  }

  public boolean getInlined() {
    return opensimSimulationJNI.MuscleIterator_getInlined(swigCPtr, this);
  }

  public String getDocumentFileName() {
    return opensimSimulationJNI.MuscleIterator_getDocumentFileName(swigCPtr, this);
  }

  public int getDocumentFileVersion() {
    return opensimSimulationJNI.MuscleIterator_getDocumentFileVersion(swigCPtr, this);
  }

  public boolean print(String fileName) {
    return opensimSimulationJNI.MuscleIterator_print(swigCPtr, this, fileName);
  }

  public String dump() {
    return opensimSimulationJNI.MuscleIterator_dump(swigCPtr, this);
  }

  public boolean isA(String type) {
    return opensimSimulationJNI.MuscleIterator_isA(swigCPtr, this, type);
  }

  public String toString() {
    return opensimSimulationJNI.MuscleIterator_toString(swigCPtr, this);
  }

}
