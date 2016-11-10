/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.itqy8.ctp;

public class CThostFtdcExchangeQuoteField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcExchangeQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeQuoteField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        ctpJNI.delete_CThostFtdcExchangeQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAskPrice(double value) {
    ctpJNI.CThostFtdcExchangeQuoteField_AskPrice_set(swigCPtr, this, value);
  }

  public double getAskPrice() {
    return ctpJNI.CThostFtdcExchangeQuoteField_AskPrice_get(swigCPtr, this);
  }

  public void setBidPrice(double value) {
    ctpJNI.CThostFtdcExchangeQuoteField_BidPrice_set(swigCPtr, this, value);
  }

  public double getBidPrice() {
    return ctpJNI.CThostFtdcExchangeQuoteField_BidPrice_get(swigCPtr, this);
  }

  public void setAskVolume(int value) {
    ctpJNI.CThostFtdcExchangeQuoteField_AskVolume_set(swigCPtr, this, value);
  }

  public int getAskVolume() {
    return ctpJNI.CThostFtdcExchangeQuoteField_AskVolume_get(swigCPtr, this);
  }

  public void setBidVolume(int value) {
    ctpJNI.CThostFtdcExchangeQuoteField_BidVolume_set(swigCPtr, this, value);
  }

  public int getBidVolume() {
    return ctpJNI.CThostFtdcExchangeQuoteField_BidVolume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    ctpJNI.CThostFtdcExchangeQuoteField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return ctpJNI.CThostFtdcExchangeQuoteField_BusinessUnit_get(swigCPtr, this);
  }

  public void setAskOffsetFlag(char value) {
    ctpJNI.CThostFtdcExchangeQuoteField_AskOffsetFlag_set(swigCPtr, this, value);
  }

  public char getAskOffsetFlag() {
    return ctpJNI.CThostFtdcExchangeQuoteField_AskOffsetFlag_get(swigCPtr, this);
  }

  public void setBidOffsetFlag(char value) {
    ctpJNI.CThostFtdcExchangeQuoteField_BidOffsetFlag_set(swigCPtr, this, value);
  }

  public char getBidOffsetFlag() {
    return ctpJNI.CThostFtdcExchangeQuoteField_BidOffsetFlag_get(swigCPtr, this);
  }

  public void setAskHedgeFlag(char value) {
    ctpJNI.CThostFtdcExchangeQuoteField_AskHedgeFlag_set(swigCPtr, this, value);
  }

  public char getAskHedgeFlag() {
    return ctpJNI.CThostFtdcExchangeQuoteField_AskHedgeFlag_get(swigCPtr, this);
  }

  public void setBidHedgeFlag(char value) {
    ctpJNI.CThostFtdcExchangeQuoteField_BidHedgeFlag_set(swigCPtr, this, value);
  }

  public char getBidHedgeFlag() {
    return ctpJNI.CThostFtdcExchangeQuoteField_BidHedgeFlag_get(swigCPtr, this);
  }

  public void setQuoteLocalID(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_QuoteLocalID_set(swigCPtr, this, value);
  }

  public String getQuoteLocalID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_QuoteLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    ctpJNI.CThostFtdcExchangeQuoteField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_InstallID_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    ctpJNI.CThostFtdcExchangeQuoteField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return ctpJNI.CThostFtdcExchangeQuoteField_NotifySequence_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    ctpJNI.CThostFtdcExchangeQuoteField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return ctpJNI.CThostFtdcExchangeQuoteField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return ctpJNI.CThostFtdcExchangeQuoteField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    ctpJNI.CThostFtdcExchangeQuoteField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_SettlementID_get(swigCPtr, this);
  }

  public void setQuoteSysID(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_QuoteSysID_set(swigCPtr, this, value);
  }

  public String getQuoteSysID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_QuoteSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return ctpJNI.CThostFtdcExchangeQuoteField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return ctpJNI.CThostFtdcExchangeQuoteField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return ctpJNI.CThostFtdcExchangeQuoteField_CancelTime_get(swigCPtr, this);
  }

  public void setQuoteStatus(char value) {
    ctpJNI.CThostFtdcExchangeQuoteField_QuoteStatus_set(swigCPtr, this, value);
  }

  public char getQuoteStatus() {
    return ctpJNI.CThostFtdcExchangeQuoteField_QuoteStatus_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    ctpJNI.CThostFtdcExchangeQuoteField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return ctpJNI.CThostFtdcExchangeQuoteField_SequenceNo_get(swigCPtr, this);
  }

  public void setAskOrderSysID(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_AskOrderSysID_set(swigCPtr, this, value);
  }

  public String getAskOrderSysID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_AskOrderSysID_get(swigCPtr, this);
  }

  public void setBidOrderSysID(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_BidOrderSysID_set(swigCPtr, this, value);
  }

  public String getBidOrderSysID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_BidOrderSysID_get(swigCPtr, this);
  }

  public void setForQuoteSysID(String value) {
    ctpJNI.CThostFtdcExchangeQuoteField_ForQuoteSysID_set(swigCPtr, this, value);
  }

  public String getForQuoteSysID() {
    return ctpJNI.CThostFtdcExchangeQuoteField_ForQuoteSysID_get(swigCPtr, this);
  }

  public CThostFtdcExchangeQuoteField() {
    this(ctpJNI.new_CThostFtdcExchangeQuoteField(), true);
  }

}