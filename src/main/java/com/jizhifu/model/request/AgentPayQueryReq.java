package com.jizhifu.model.request;

/**
 * 代付订单查询请求类
 */
public class AgentPayQueryReq {
    private String appKey; //appKey(商户后台设置可以获取到值)
    private String outOrderId; //商户订单号

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getOutOrderId() {
        return outOrderId;
    }

    public void setOutOrderId(String outOrderId) {
        this.outOrderId = outOrderId;
    }
}
