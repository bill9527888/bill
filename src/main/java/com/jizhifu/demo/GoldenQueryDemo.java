package com.jizhifu.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.jizhifu.model.request.GoldenQueryReq;
import com.jizhifu.model.response.GoldenQueryResp;
import com.jizhifu.model.response.Response;
import com.jizhifu.util.OkHttpUtils;

import java.util.List;

/**
 * 订单查询接口
 */
public class GoldenQueryDemo {

    private static String appKey = "c3246abfcddb46f3a26c845f06b8a293";  //appKey(商户后台设置可以获取到值)
    private static String appSecret = "a62e17090db0e808a6ab3675a41bc06b"; //appSecret 为系统后台安全设置的 appSecret 值
    private static String urlPref = "http://pay-test.cpayxx.com/api/exchange";//测试环境
    //private static String urlPref = "http://api.jipay.io/exchange";//正式环境(备注：请以接口文档的地址为准)

    public static void main(String[] args) throws Exception {
        String url = urlPref + "/api/open/buy/orderInfo";

        GoldenQueryReq goldenQueryReq = new GoldenQueryReq();
        goldenQueryReq.setAppKey(appKey);//appKey(商户后台设置可以获取到值)
        goldenQueryReq.setOrderId("1569228245719");//商户订单号

        //发送请求
        String result = OkHttpUtils.post(url, JSON.toJSONString(goldenQueryReq));
        System.out.println("请求结果：" + result);
        Response<List<GoldenQueryResp>> response = JSON.parseObject(result, new TypeReference<Response<List<GoldenQueryResp>>>() {
        });

        System.out.println("response:" + JSON.toJSONString(response));
    }
}
