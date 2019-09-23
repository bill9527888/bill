package com.jizhifu.model.response;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 代付订单查询响应类
 */
public class AgentPayQueryResp {
    private String adOrderId; //代付订单号
    private String orderId; //平台订单号
    private String outOrderId; //商户订单号
    private String payerName; //付款人名称
    private Integer payType; //支付方式：1-银行卡
    private BigDecimal adAmount; //代付金额(USDT)
    private BigDecimal adAmountCny; //代付购买金额(CNY)
    private BigDecimal adDiscountsAmount; //折扣金额(USDT)
    private BigDecimal adDiscountsCny; //折扣金额(CNY)
    private BigDecimal adDiscountsRate; //折扣费率
    private Integer adOrderStatus; //代付订单发布状态：1-已发布，2-已关闭
    private BigDecimal clientAmount; //客户收款金额(USDT)
    private BigDecimal clientAmountCny; //客户收款金额(CNY)
    private BigDecimal poundage; //手续费金额(USDT)
    private Integer status; //订单状态：2 待转账，3 已完成，4 已过期，6 关闭订单，10 承兑商入金冻结资金已解冻，11 已确认转账
    private Integer objectionStatus; //申诉状态：1 申诉中，2 关闭申诉(订单正常)，3 客服介入中
    private String mUserName; //承兑商名称
    private String payeeRealName; //收款人名称
    private String payeeNo; //收款人账号
    private String payeeBankType; //收款银行名称
    private String payeeBankBranch; //收款银行支行
    private Date transferTime; //付款时间
    private Date confirmTime; //收款确认时间
    private Date createTime; //订单创建时间

    public String getAdOrderId() {
        return adOrderId;
    }

    public void setAdOrderId(String adOrderId) {
        this.adOrderId = adOrderId;
    }

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

    public BigDecimal getAdAmount() {
        return adAmount;
    }

    public void setAdAmount(BigDecimal adAmount) {
        this.adAmount = adAmount;
    }

    public BigDecimal getAdAmountCny() {
        return adAmountCny;
    }

    public void setAdAmountCny(BigDecimal adAmountCny) {
        this.adAmountCny = adAmountCny;
    }

    public BigDecimal getAdDiscountsAmount() {
        return adDiscountsAmount;
    }

    public void setAdDiscountsAmount(BigDecimal adDiscountsAmount) {
        this.adDiscountsAmount = adDiscountsAmount;
    }

    public BigDecimal getAdDiscountsCny() {
        return adDiscountsCny;
    }

    public void setAdDiscountsCny(BigDecimal adDiscountsCny) {
        this.adDiscountsCny = adDiscountsCny;
    }

    public BigDecimal getAdDiscountsRate() {
        return adDiscountsRate;
    }

    public void setAdDiscountsRate(BigDecimal adDiscountsRate) {
        this.adDiscountsRate = adDiscountsRate;
    }

    public Integer getAdOrderStatus() {
        return adOrderStatus;
    }

    public void setAdOrderStatus(Integer adOrderStatus) {
        this.adOrderStatus = adOrderStatus;
    }

    public BigDecimal getClientAmount() {
        return clientAmount;
    }

    public void setClientAmount(BigDecimal clientAmount) {
        this.clientAmount = clientAmount;
    }

    public BigDecimal getClientAmountCny() {
        return clientAmountCny;
    }

    public void setClientAmountCny(BigDecimal clientAmountCny) {
        this.clientAmountCny = clientAmountCny;
    }

    public BigDecimal getPoundage() {
        return poundage;
    }

    public void setPoundage(BigDecimal poundage) {
        this.poundage = poundage;
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

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getPayeeRealName() {
        return payeeRealName;
    }

    public void setPayeeRealName(String payeeRealName) {
        this.payeeRealName = payeeRealName;
    }

    public String getPayeeNo() {
        return payeeNo;
    }

    public void setPayeeNo(String payeeNo) {
        this.payeeNo = payeeNo;
    }

    public String getPayeeBankType() {
        return payeeBankType;
    }

    public void setPayeeBankType(String payeeBankType) {
        this.payeeBankType = payeeBankType;
    }

    public String getPayeeBankBranch() {
        return payeeBankBranch;
    }

    public void setPayeeBankBranch(String payeeBankBranch) {
        this.payeeBankBranch = payeeBankBranch;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
