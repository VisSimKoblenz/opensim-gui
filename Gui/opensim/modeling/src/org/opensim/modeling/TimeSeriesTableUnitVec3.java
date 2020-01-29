/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class TimeSeriesTableUnitVec3 extends DataTableUnitVec3 {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected TimeSeriesTableUnitVec3(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.TimeSeriesTableUnitVec3_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TimeSeriesTableUnitVec3 obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        opensimCommonJNI.delete_TimeSeriesTableUnitVec3(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public TimeSeriesTableUnitVec3() {
    this(opensimCommonJNI.new_TimeSeriesTableUnitVec3__SWIG_0(), true);
  }

  public TimeSeriesTableUnitVec3(TimeSeriesTableUnitVec3 arg0) {
    this(opensimCommonJNI.new_TimeSeriesTableUnitVec3__SWIG_1(TimeSeriesTableUnitVec3.getCPtr(arg0), arg0), true);
  }

  public TimeSeriesTableUnitVec3(StdVectorDouble indVec, SWIGTYPE_p_SimTK__Matrix_T_SimTK__UnitVecT_double_1_t_t depData, StdVectorString labels) {
    this(opensimCommonJNI.new_TimeSeriesTableUnitVec3__SWIG_2(StdVectorDouble.getCPtr(indVec), indVec, SWIGTYPE_p_SimTK__Matrix_T_SimTK__UnitVecT_double_1_t_t.getCPtr(depData), StdVectorString.getCPtr(labels), labels), true);
  }

  public TimeSeriesTableUnitVec3(StdVectorDouble indVec) {
    this(opensimCommonJNI.new_TimeSeriesTableUnitVec3__SWIG_3(StdVectorDouble.getCPtr(indVec), indVec), true);
  }

  public TimeSeriesTableUnitVec3(DataTableUnitVec3 datatable) {
    this(opensimCommonJNI.new_TimeSeriesTableUnitVec3__SWIG_4(DataTableUnitVec3.getCPtr(datatable), datatable), true);
  }

  public TimeSeriesTableUnitVec3(String filename) {
    this(opensimCommonJNI.new_TimeSeriesTableUnitVec3__SWIG_5(filename), true);
  }

  public TimeSeriesTableUnitVec3(String filename, String tablename) {
    this(opensimCommonJNI.new_TimeSeriesTableUnitVec3__SWIG_6(filename, tablename), true);
  }

  public long getNearestRowIndexForTime(double time, boolean restrictToTimeRange) {
    return opensimCommonJNI.TimeSeriesTableUnitVec3_getNearestRowIndexForTime__SWIG_0(swigCPtr, this, time, restrictToTimeRange);
  }

  public long getNearestRowIndexForTime(double time) {
    return opensimCommonJNI.TimeSeriesTableUnitVec3_getNearestRowIndexForTime__SWIG_1(swigCPtr, this, time);
  }

  public long getRowIndexAfterTime(double time) {
    return opensimCommonJNI.TimeSeriesTableUnitVec3_getRowIndexAfterTime(swigCPtr, this, time);
  }

  public long getRowIndexBeforeTime(double time) {
    return opensimCommonJNI.TimeSeriesTableUnitVec3_getRowIndexBeforeTime(swigCPtr, this, time);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t getNearestRow(double time, boolean restrictToTimeRange) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.TimeSeriesTableUnitVec3_getNearestRow__SWIG_0(swigCPtr, this, time, restrictToTimeRange), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t getNearestRow(double time) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.TimeSeriesTableUnitVec3_getNearestRow__SWIG_1(swigCPtr, this, time), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t updNearestRow(double time, boolean restrictToTimeRange) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.TimeSeriesTableUnitVec3_updNearestRow__SWIG_0(swigCPtr, this, time, restrictToTimeRange), true);
  }

  public SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t updNearestRow(double time) {
    return new SWIGTYPE_p_SimTK__RowVectorView_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.TimeSeriesTableUnitVec3_updNearestRow__SWIG_1(swigCPtr, this, time), true);
  }

  public SWIGTYPE_p_SimTK__RowVector_T_SimTK__UnitVecT_double_1_t_t averageRow(double beginTime, double endTime) {
    return new SWIGTYPE_p_SimTK__RowVector_T_SimTK__UnitVecT_double_1_t_t(opensimCommonJNI.TimeSeriesTableUnitVec3_averageRow(swigCPtr, this, beginTime, endTime), true);
  }

  public void trim(double newStartTime, double newFinalTime) {
    opensimCommonJNI.TimeSeriesTableUnitVec3_trim(swigCPtr, this, newStartTime, newFinalTime);
  }

  public void trimFrom(double newStartTime) {
    opensimCommonJNI.TimeSeriesTableUnitVec3_trimFrom(swigCPtr, this, newStartTime);
  }

  public void trimTo(double newFinalTime) {
    opensimCommonJNI.TimeSeriesTableUnitVec3_trimTo(swigCPtr, this, newFinalTime);
  }

  public TimeSeriesTableUnitVec3 clone() {
    long cPtr = opensimCommonJNI.TimeSeriesTableUnitVec3_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new TimeSeriesTableUnitVec3(cPtr, true);
  }

  public TimeSeriesTable flatten() {
    return new TimeSeriesTable(opensimCommonJNI.TimeSeriesTableUnitVec3_flatten__SWIG_0(swigCPtr, this), true);
  }

  public TimeSeriesTable flatten(StdVectorString suffixes) {
    return new TimeSeriesTable(opensimCommonJNI.TimeSeriesTableUnitVec3_flatten__SWIG_1(swigCPtr, this, StdVectorString.getCPtr(suffixes), suffixes), true);
  }

}
