package com.jizhifu.model.request;

/**
 * 订单查询请求类
 */
public class GoldenQueryReq {
    private String appKey; //appKey(商户后台设置可以获取到值)
    private String orderId; //商户订单号

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
