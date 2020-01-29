/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class ArrayObjPtr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public ArrayObjPtr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(ArrayObjPtr obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        opensimCommonJNI.delete_ArrayObjPtr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayObjPtr(OpenSimObject aDefaultValue, int aSize, int aCapacity) {
    this(opensimCommonJNI.new_ArrayObjPtr__SWIG_0(OpenSimObject.getCPtr(aDefaultValue), aDefaultValue, aSize, aCapacity), true);
  }

  public ArrayObjPtr(OpenSimObject aDefaultValue, int aSize) {
    this(opensimCommonJNI.new_ArrayObjPtr__SWIG_1(OpenSimObject.getCPtr(aDefaultValue), aDefaultValue, aSize), true);
  }

  public ArrayObjPtr(OpenSimObject aDefaultValue) {
    this(opensimCommonJNI.new_ArrayObjPtr__SWIG_2(OpenSimObject.getCPtr(aDefaultValue), aDefaultValue), true);
  }

  public ArrayObjPtr() {
    this(opensimCommonJNI.new_ArrayObjPtr__SWIG_3(), true);
  }

  public ArrayObjPtr(ArrayObjPtr aArray) {
    this(opensimCommonJNI.new_ArrayObjPtr__SWIG_4(ArrayObjPtr.getCPtr(aArray), aArray), true);
  }

  public boolean arrayEquals(ArrayObjPtr aArray) {
    return opensimCommonJNI.ArrayObjPtr_arrayEquals(swigCPtr, this, ArrayObjPtr.getCPtr(aArray), aArray);
  }

  public void trim() {
    opensimCommonJNI.ArrayObjPtr_trim(swigCPtr, this);
  }

  public boolean setSize(int aSize) {
    return opensimCommonJNI.ArrayObjPtr_setSize(swigCPtr, this, aSize);
  }

  public int getSize() {
    return opensimCommonJNI.ArrayObjPtr_getSize(swigCPtr, this);
  }

  public int size() {
    return opensimCommonJNI.ArrayObjPtr_size(swigCPtr, this);
  }

  public int append(OpenSimObject aValue) {
    return opensimCommonJNI.ArrayObjPtr_append__SWIG_0(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue);
  }

  public int append(ArrayObjPtr aArray) {
    return opensimCommonJNI.ArrayObjPtr_append__SWIG_1(swigCPtr, this, ArrayObjPtr.getCPtr(aArray), aArray);
  }

  public int insert(int aIndex, OpenSimObject aValue) {
    return opensimCommonJNI.ArrayObjPtr_insert(swigCPtr, this, aIndex, OpenSimObject.getCPtr(aValue), aValue);
  }

  public int remove(int aIndex) {
    return opensimCommonJNI.ArrayObjPtr_remove(swigCPtr, this, aIndex);
  }

  public void set(int aIndex, OpenSimObject aValue) {
    opensimCommonJNI.ArrayObjPtr_set(swigCPtr, this, aIndex, OpenSimObject.getCPtr(aValue), aValue);
  }

  public OpenSimObject get(int aIndex) {
    long cPtr = opensimCommonJNI.ArrayObjPtr_get(swigCPtr, this, aIndex);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public OpenSimObject getitem(int index) {
    long cPtr = opensimCommonJNI.ArrayObjPtr_getitem(swigCPtr, this, index);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public void setitem(int index, OpenSimObject val) {
    opensimCommonJNI.ArrayObjPtr_setitem(swigCPtr, this, index, OpenSimObject.getCPtr(val), val);
  }

  public OpenSimObject getLast() {
    long cPtr = opensimCommonJNI.ArrayObjPtr_getLast(swigCPtr, this);
    return (cPtr == 0) ? null : new OpenSimObject(cPtr, false);
  }

  public int findIndex(OpenSimObject aValue) {
    return opensimCommonJNI.ArrayObjPtr_findIndex(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue);
  }

  public int rfindIndex(OpenSimObject aValue) {
    return opensimCommonJNI.ArrayObjPtr_rfindIndex(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue);
  }

  public int searchBinary(OpenSimObject aValue, boolean aFindFirst, int aLo, int aHi) {
    return opensimCommonJNI.ArrayObjPtr_searchBinary__SWIG_0(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue, aFindFirst, aLo, aHi);
  }

  public int searchBinary(OpenSimObject aValue, boolean aFindFirst, int aLo) {
    return opensimCommonJNI.ArrayObjPtr_searchBinary__SWIG_1(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue, aFindFirst, aLo);
  }

  public int searchBinary(OpenSimObject aValue, boolean aFindFirst) {
    return opensimCommonJNI.ArrayObjPtr_searchBinary__SWIG_2(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue, aFindFirst);
  }

  public int searchBinary(OpenSimObject aValue) {
    return opensimCommonJNI.ArrayObjPtr_searchBinary__SWIG_3(swigCPtr, this, OpenSimObject.getCPtr(aValue), aValue);
  }

}
