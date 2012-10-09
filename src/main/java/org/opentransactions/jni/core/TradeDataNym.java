/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.jni.core;

public class TradeDataNym extends Displayable {
  private long swigCPtr;

  protected TradeDataNym(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.TradeDataNym_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TradeDataNym obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_TradeDataNym(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setGui_label(String value) {
    otapiJNI.TradeDataNym_gui_label_set(swigCPtr, this, value);
  }

  public String getGui_label() {
    return otapiJNI.TradeDataNym_gui_label_get(swigCPtr, this);
  }

  public void setTransaction_id(String value) {
    otapiJNI.TradeDataNym_transaction_id_set(swigCPtr, this, value);
  }

  public String getTransaction_id() {
    return otapiJNI.TradeDataNym_transaction_id_get(swigCPtr, this);
  }

  public void setCompleted_count(String value) {
    otapiJNI.TradeDataNym_completed_count_set(swigCPtr, this, value);
  }

  public String getCompleted_count() {
    return otapiJNI.TradeDataNym_completed_count_get(swigCPtr, this);
  }

  public void setDate(String value) {
    otapiJNI.TradeDataNym_date_set(swigCPtr, this, value);
  }

  public String getDate() {
    return otapiJNI.TradeDataNym_date_get(swigCPtr, this);
  }

  public void setPrice(String value) {
    otapiJNI.TradeDataNym_price_set(swigCPtr, this, value);
  }

  public String getPrice() {
    return otapiJNI.TradeDataNym_price_get(swigCPtr, this);
  }

  public void setAmount_sold(String value) {
    otapiJNI.TradeDataNym_amount_sold_set(swigCPtr, this, value);
  }

  public String getAmount_sold() {
    return otapiJNI.TradeDataNym_amount_sold_get(swigCPtr, this);
  }

  public static TradeDataNym ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.TradeDataNym_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new TradeDataNym(cPtr, false);
  }

  public static Storable ot_dynamic_cast_box(TradeDataNym pUnboxed) {
    long cPtr = otapiJNI.TradeDataNym_ot_dynamic_cast_box(TradeDataNym.getCPtr(pUnboxed), pUnboxed);
    return (cPtr == 0) ? null : new Storable(cPtr, false);
  }

}