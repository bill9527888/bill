package com.jizhifu.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.jizhifu.model.request.GoldenQueryBatchReq;
import com.jizhifu.model.request.GoldenQueryReq;
import com.jizhifu.model.response.GoldenQueryResp;
import com.jizhifu.model.response.Response;
import com.jizhifu.util.OkHttpUtils;

import java.util.List;

/**
 * 订单查询接口 -- 批量(下个版本开放)
 */
public class GoldenQueryBatchDemo {

    private static String appKey = "c3246abfcddb46f3a26c845f06b8a293";  //appKey(商户后台设置可以获取到值)
    private static String appSecret = "a62e17090db0e808a6ab3675a41bc06b"; //appSecret 为系统后台安全设置的 appSecret 值
    private static String urlPref = "http://pay-test.cpayxx.com/api/exchange";//测试环境
    //private static String urlPref = "http://api.jipay.io/exchange";//正式环境(备注：请以接口文档的地址为准)

    public static void main(String[] args) throws Exception {
        String url = urlPref + "/api/open/buy/orderInfoBatch";

        GoldenQueryBatchReq goldenQueryBatchReq = new GoldenQueryBatchReq();
        goldenQueryBatchReq.setAppKey(appKey);//appKey(商户后台设置可以获取到值)
        List<String> outOrderIds = goldenQueryBatchReq.getOutOrderIds();
        outOrderIds.add("1565772190798");//商户订单号
        outOrderIds.add("1565772227078");//商户订单号
        outOrderIds.add("1569222813498");//商户订单号

        //发送请求
        String result = OkHttpUtils.post(url, JSON.toJSONString(goldenQueryBatchReq));
        System.out.println("请求结果：" + result);
        Response<List<GoldenQueryResp>> response = JSON.parseObject(result, new TypeReference<Response<List<GoldenQueryResp>>>() {
        });

        System.out.println("response:" + JSON.toJSONString(response));
    }
}
