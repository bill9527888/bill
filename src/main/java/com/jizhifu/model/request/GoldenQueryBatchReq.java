package com.jizhifu.model.request;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单查询请求类
 */
public class GoldenQueryBatchReq {
    private String appKey; //appKey(商户后台设置可以获取到值)
    private List<String> outOrderIds = new ArrayList<>(); //商户订单号，多个

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public List<String> getOutOrderIds() {
        return outOrderIds;
    }

    public void setOutOrderIds(List<String> outOrderIds) {
        this.outOrderIds = outOrderIds;
    }
}
