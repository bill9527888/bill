package com.jizhifu.model.request;

import java.math.BigDecimal;

/**
 * 下单请求类
 */
public class GoldenReq {
    private String outOrderId;//商户订单号(自行生成，长度不超过 36 位)
    private BigDecimal customerAmountCny; //客户购买金额(CNY)
    private Integer payType;//支付方式：1-银行卡，21- 支付宝转银行卡
    private String payerName;//付款人名称(长度 30 位内)
    private String receiveUrl;//后台通知回调地址
    private String sign;//签名
    private String customerPhone;//付款人手机号

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }

    public BigDecimal getCustomerAmountCny() {
        return customerAmountCny;
    }

    public void setCustomerAmountCny(BigDecimal customerAmountCny) {
        this.customerAmountCny = customerAmountCny;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayerName() {
        return payerName;
    }

    public void setPayerName(String payerName) {
        this.payerName = payerName;
    }

    public String getReceiveUrl() {
        return receiveUrl;
    }

    public void setReceiveUrl(String receiveUrl) {
        this.receiveUrl = receiveUrl;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
