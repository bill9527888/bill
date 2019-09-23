package com.jizhifu.model.response;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单查询响应类
 */
public class GoldenQueryResp {
    private String orderId; //平台订单号
    private String outOrderId; //商户订单号
    private String payerName; //付款人名称
    private Integer payType; //支付方式：1-银行卡，21-支付宝转银行卡
    private BigDecimal customerAmount; //客户购买金额(USDT)
    private BigDecimal customerAmountCny; //客户购买金额(CNY)
    private BigDecimal platformRate; //平台 USDT 兑 CNY 汇率
    private Date transferTime; //付款时间
    private Date confirmTime; //收款确认时间
    private Integer status; //订单状态：1 用户已付款，2待用户付款，4 已确认收款，5 未收到款，6 已过期
    private Integer objectionStatus; //申诉状态：1 申诉中，2 关闭申诉(订单正常)，3 客服介入中
    private String receiveUrl; //通知回调地址
    private String mcardName; //收款人名称
    private String mcardNo; //收款人账号
    private Date createTime; //订单创建时间
    private Date updateTime; //订单最近更新时间

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

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public BigDecimal getCustomerAmount() {
        return customerAmount;
    }

    public void setCustomerAmount(BigDecimal customerAmount) {
        this.customerAmount = customerAmount;
    }

    public BigDecimal getCustomerAmountCny() {
        return customerAmountCny;
    }

    public void setCustomerAmountCny(BigDecimal customerAmountCny) {
        this.customerAmountCny = customerAmountCny;
    }

    public BigDecimal getPlatformRate() {
        return platformRate;
    }

    public void setPlatformRate(BigDecimal platformRate) {
        this.platformRate = platformRate;
    }

    public Date getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(Date transferTime) {
        this.transferTime = transferTime;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getObjectionStatus() {
        return objectionStatus;
    }

    public void setObjectionStatus(Integer objectionStatus) {
        this.objectionStatus = objectionStatus;
    }

    public String getReceiveUrl() {
        return receiveUrl;
    }

    public void setReceiveUrl(String receiveUrl) {
        this.receiveUrl = receiveUrl;
    }

    public String getMcardName() {
        return mcardName;
    }

    public void setMcardName(String mcardName) {
        this.mcardName = mcardName;
    }

    public String getMcardNo() {
        return mcardNo;
    }

    public void setMcardNo(String mcardNo) {
        this.mcardNo = mcardNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
