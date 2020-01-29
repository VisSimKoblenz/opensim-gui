/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opensim.modeling;

public class PropertyString extends AbstractProperty {
  private transient long swigCPtr;

  public PropertyString(long cPtr, boolean cMemoryOwn) {
    super(opensimCommonJNI.PropertyString_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(PropertyString obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AbstractProperty clone() {
    long cPtr = opensimCommonJNI.PropertyString_clone(swigCPtr, this);
    return (cPtr == 0) ? null : new PropertyString(cPtr, true);
  }

  public String getTypeName() {
    return opensimCommonJNI.PropertyString_getTypeName(swigCPtr, this);
  }

  public void setValue(int i, String value) {
    opensimCommonJNI.PropertyString_setValue__SWIG_0(swigCPtr, this, i, value);
  }

  public void setValue(String value) {
    opensimCommonJNI.PropertyString_setValue__SWIG_1(swigCPtr, this, value);
  }

  public String getValue(int index) {
    return opensimCommonJNI.PropertyString_getValue__SWIG_0(swigCPtr, this, index);
  }

  public String getValue() {
    return opensimCommonJNI.PropertyString_getValue__SWIG_1(swigCPtr, this);
  }

  public SWIGTYPE_p_std__string updValue(int index) {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.PropertyString_updValue__SWIG_0(swigCPtr, this, index), false);
  }

  public SWIGTYPE_p_std__string updValue() {
    return new SWIGTYPE_p_std__string(opensimCommonJNI.PropertyString_updValue__SWIG_1(swigCPtr, this), false);
  }

  public int appendValue(String value) {
    return opensimCommonJNI.PropertyString_appendValue(swigCPtr, this, value);
  }

  public int adoptAndAppendValue(SWIGTYPE_p_std__string value) {
    return opensimCommonJNI.PropertyString_adoptAndAppendValue(swigCPtr, this, SWIGTYPE_p_std__string.getCPtr(value));
  }

  public int findIndex(String value) {
    return opensimCommonJNI.PropertyString_findIndex(swigCPtr, this, value);
  }

  public int findIndexForName(SWIGTYPE_p_SimTK__String name) {
    return opensimCommonJNI.PropertyString_findIndexForName(swigCPtr, this, SWIGTYPE_p_SimTK__String.getCPtr(name));
  }

  public static boolean isA(AbstractProperty prop) {
    return opensimCommonJNI.PropertyString_isA(AbstractProperty.getCPtr(prop), prop);
  }

  public static PropertyString getAs(AbstractProperty prop) {
    return new PropertyString(opensimCommonJNI.PropertyString_getAs(AbstractProperty.getCPtr(prop), prop), false);
  }

  public static PropertyString updAs(AbstractProperty prop) {
    return new PropertyString(opensimCommonJNI.PropertyString_updAs(AbstractProperty.getCPtr(prop), prop), false);
  }

}
