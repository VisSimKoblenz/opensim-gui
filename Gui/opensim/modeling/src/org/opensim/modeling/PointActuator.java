/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PointActuator extends ScalarActuator {
  private transient long swigCPtr;

  public PointActuator(long cPtr, boolean cMemoryOwn) {
    super(opensimActuatorsAnalysesToolsJNI.PointActuator_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PointActuator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimActuatorsAnalysesToolsJNI.delete_PointActuator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public static PointActuator safeDownCast(OpenSimObject obj) {
    long cPtr = opensimActuatorsAnalysesToolsJNI.PointActuator_safeDownCast(OpenSimObject.getCPtr(obj), obj);
    return (cPtr == 0) ? null : new PointActuator(cPtr, false);
  }

  public void assign(OpenSimObject aObject) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_assign(swigCPtr, this, OpenSimObject.getCPtr(aObject), aObject);
  }

  public static String getClassName() {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_getClassName();
  }

  public OpenSimObject clone() {
    long cPtr = opensimActuatorsAnalysesToolsJNI.PointActuator_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PointActuator(cPtr, true);
  }

  public String getConcreteClassName() {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_getConcreteClassName(swigCPtr, this);
  }

  public void copyProperty_body(PointActuator source) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_copyProperty_body(swigCPtr, this, PointActuator.getCPtr(source), source);
  }

  public String get_body(int i) {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_get_body__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_std__string upd_body(int i) {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.PointActuator_upd_body__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_body(int i, String value) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_set_body__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_body(String value) {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_append_body(swigCPtr, this, value);
  }

  public void constructProperty_body() {
    opensimActuatorsAnalysesToolsJNI.PointActuator_constructProperty_body__SWIG_0(swigCPtr, this);
  }

  public void constructProperty_body(String initValue) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_constructProperty_body__SWIG_1(swigCPtr, this, initValue);
  }

  public String get_body() {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_get_body__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string upd_body() {
    return new SWIGTYPE_p_std__string(opensimActuatorsAnalysesToolsJNI.PointActuator_upd_body__SWIG_1(swigCPtr, this), false);
  }

  public void set_body(String value) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_set_body__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_point(PointActuator source) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_copyProperty_point(swigCPtr, this, PointActuator.getCPtr(source), source);
  }

  public Vec3 get_point(int i) {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointActuator_get_point__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_point(int i) {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointActuator_upd_point__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_point(int i, Vec3 value) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_set_point__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_point(Vec3 value) {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_append_point(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_point(Vec3 initValue) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_constructProperty_point(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_point() {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointActuator_get_point__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_point() {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointActuator_upd_point__SWIG_1(swigCPtr, this), false);
  }

  public void set_point(Vec3 value) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_set_point__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_point_is_global(PointActuator source) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_copyProperty_point_is_global(swigCPtr, this, PointActuator.getCPtr(source), source);
  }

  public boolean get_point_is_global(int i) {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_get_point_is_global__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_point_is_global(int i) {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.PointActuator_upd_point_is_global__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_point_is_global(int i, boolean value) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_set_point_is_global__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_point_is_global(boolean value) {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_append_point_is_global(swigCPtr, this, value);
  }

  public void constructProperty_point_is_global(boolean initValue) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_constructProperty_point_is_global(swigCPtr, this, initValue);
  }

  public boolean get_point_is_global() {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_get_point_is_global__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_point_is_global() {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.PointActuator_upd_point_is_global__SWIG_1(swigCPtr, this), false);
  }

  public void set_point_is_global(boolean value) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_set_point_is_global__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_direction(PointActuator source) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_copyProperty_direction(swigCPtr, this, PointActuator.getCPtr(source), source);
  }

  public Vec3 get_direction(int i) {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointActuator_get_direction__SWIG_0(swigCPtr, this, i), false);
  }

  public Vec3 upd_direction(int i) {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointActuator_upd_direction__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_direction(int i, Vec3 value) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_set_direction__SWIG_0(swigCPtr, this, i, Vec3.getCPtr(value), value);
  }

  public int append_direction(Vec3 value) {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_append_direction(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void constructProperty_direction(Vec3 initValue) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_constructProperty_direction(swigCPtr, this, Vec3.getCPtr(initValue), initValue);
  }

  public Vec3 get_direction() {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointActuator_get_direction__SWIG_1(swigCPtr, this), false);
  }

  public Vec3 upd_direction() {
    return new Vec3(opensimActuatorsAnalysesToolsJNI.PointActuator_upd_direction__SWIG_1(swigCPtr, this), false);
  }

  public void set_direction(Vec3 value) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_set_direction__SWIG_1(swigCPtr, this, Vec3.getCPtr(value), value);
  }

  public void copyProperty_force_is_global(PointActuator source) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_copyProperty_force_is_global(swigCPtr, this, PointActuator.getCPtr(source), source);
  }

  public boolean get_force_is_global(int i) {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_get_force_is_global__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_bool upd_force_is_global(int i) {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.PointActuator_upd_force_is_global__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_force_is_global(int i, boolean value) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_set_force_is_global__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_force_is_global(boolean value) {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_append_force_is_global(swigCPtr, this, value);
  }

  public void constructProperty_force_is_global(boolean initValue) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_constructProperty_force_is_global(swigCPtr, this, initValue);
  }

  public boolean get_force_is_global() {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_get_force_is_global__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_bool upd_force_is_global() {
    return new SWIGTYPE_p_bool(opensimActuatorsAnalysesToolsJNI.PointActuator_upd_force_is_global__SWIG_1(swigCPtr, this), false);
  }

  public void set_force_is_global(boolean value) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_set_force_is_global__SWIG_1(swigCPtr, this, value);
  }

  public void copyProperty_optimal_force(PointActuator source) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_copyProperty_optimal_force(swigCPtr, this, PointActuator.getCPtr(source), source);
  }

  public double get_optimal_force(int i) {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_get_optimal_force__SWIG_0(swigCPtr, this, i);
  }

  public SWIGTYPE_p_double upd_optimal_force(int i) {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.PointActuator_upd_optimal_force__SWIG_0(swigCPtr, this, i), false);
  }

  public void set_optimal_force(int i, double value) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_set_optimal_force__SWIG_0(swigCPtr, this, i, value);
  }

  public int append_optimal_force(double value) {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_append_optimal_force(swigCPtr, this, value);
  }

  public void constructProperty_optimal_force(double initValue) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_constructProperty_optimal_force(swigCPtr, this, initValue);
  }

  public double get_optimal_force() {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_get_optimal_force__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_double upd_optimal_force() {
    return new SWIGTYPE_p_double(opensimActuatorsAnalysesToolsJNI.PointActuator_upd_optimal_force__SWIG_1(swigCPtr, this), false);
  }

  public void set_optimal_force(double value) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_set_optimal_force__SWIG_1(swigCPtr, this, value);
  }

  public PointActuator(String bodyName) {
    this(opensimActuatorsAnalysesToolsJNI.new_PointActuator__SWIG_0(bodyName), true);
  }

  public PointActuator() {
    this(opensimActuatorsAnalysesToolsJNI.new_PointActuator__SWIG_1(), true);
  }

  public void setOptimalForce(double aOptimalForce) {
    opensimActuatorsAnalysesToolsJNI.PointActuator_setOptimalForce(swigCPtr, this, aOptimalForce);
  }

  public double getOptimalForce() {
    return opensimActuatorsAnalysesToolsJNI.PointActuator_getOptimalForce(swigCPtr, this);
  }

}
