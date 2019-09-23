package com.jizhifu.model.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 下单响应类
 */
public class GoldenResp{

    private String orderId; //平台订单号
    private String outOrderId;  //商户订单号
    private BigDecimal customerAmount;  //客户购买金额(USDT)
    private BigDecimal exchangeCustomerAmount;  //商户收款金额(USDT)
    private BigDecimal customerAmountCny;   //客户购买金额(CNY)
    private String payerName;   //付款人名称
    private String mUserName;   //承兑商名称
    private Integer mCardType;   //支付方式：1-银行卡，21-支付宝转银行卡
    private String mCardName;   //支付宝名称
    private String mCardNo; //承兑商银行卡号
    private String mCardUrl;    //承兑商二维码
    private String arouseAlipayUrl; //承兑商二维码跳转
    private Integer validTime;   //支付方式对应过期时间
    private Integer forRest; //剩余时间
    private String payPageUrl;  //订单支付页面 url(html5 页面)
    private String mBankType;   //承兑商银行卡银行
    private String mBankName;   //承兑商银行卡开户行

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public BigDecimal getCustomerAmount() {
        return customerAmount;
    }

    public void setCustomerAmount(BigDecimal customerAmount) {
        this.customerAmount = customerAmount;
    }

    public BigDecimal getExchangeCustomerAmount() {
        return exchangeCustomerAmount;
    }

    public void setExchangeCustomerAmount(BigDecimal exchangeCustomerAmount) {
        this.exchangeCustomerAmount = exchangeCustomerAmount;
    }

    public BigDecimal getCustomerAmountCny() {
        return customerAmountCny;
    }

    public void setCustomerAmountCny(BigDecimal customerAmountCny) {
        this.customerAmountCny = customerAmountCny;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public Integer getmCardType() {
        return mCardType;
    }

    public void setmCardType(Integer mCardType) {
        this.mCardType = mCardType;
    }

    public String getmCardName() {
        return mCardName;
    }

    public void setmCardName(String mCardName) {
        this.mCardName = mCardName;
    }

    public String getmCardNo() {
        return mCardNo;
    }

    public void setmCardNo(String mCardNo) {
        this.mCardNo = mCardNo;
    }

    public String getmCardUrl() {
        return mCardUrl;
    }

    public void setmCardUrl(String mCardUrl) {
        this.mCardUrl = mCardUrl;
    }

    public String getArouseAlipayUrl() {
        return arouseAlipayUrl;
    }

    public void setArouseAlipayUrl(String arouseAlipayUrl) {
        this.arouseAlipayUrl = arouseAlipayUrl;
    }

    public Integer getValidTime() {
        return validTime;
    }

    public void setValidTime(Integer validTime) {
        this.validTime = validTime;
    }

    public Integer getForRest() {
        return forRest;
    }

    public void setForRest(Integer forRest) {
        this.forRest = forRest;
    }

    public String getPayPageUrl() {
        return payPageUrl;
    }

    public void setPayPageUrl(String payPageUrl) {
        this.payPageUrl = payPageUrl;
    }

    public String getmBankType() {
        return mBankType;
    }

    public void setmBankType(String mBankType) {
        this.mBankType = mBankType;
    }

    public String getmBankName() {
        return mBankName;
    }

    public void setmBankName(String mBankName) {
        this.mBankName = mBankName;
    }
}
