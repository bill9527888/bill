package com.jizhifu.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.jizhifu.model.request.GoldenReq;
import com.jizhifu.model.response.GoldenResp;
import com.jizhifu.model.response.Response;
import com.jizhifu.util.MD5Utils;
import com.jizhifu.util.OkHttpUtils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 下单demo
 */
public class GoldenDemo {

    private static String appKey = "c3246abfcddb46f3a26c845f06b8a293";  //appKey(商户后台设置可以获取到值)
    private static String appSecret = "a62e17090db0e808a6ab3675a41bc06b"; //appSecret 为系统后台安全设置的 appSecret 值
    private static String urlPref = "http://pay-test.cpayxx.com/api/exchange";//测试环境
    //private static String urlPref = "http://jipay.wallrong.cn/exchange/";//正式环境(备注：请以接口文档的地址为准)

    public static void main(String[] args) throws Exception {

        String url = urlPref + "/api/open/golden/" + appKey;

        GoldenReq goldenReq = new GoldenReq();
        goldenReq.setOutOrderId(new Date().getTime() + ""); //商户订单号
        goldenReq.setCustomerAmountCny(new BigDecimal("100")); //金额
        goldenReq.setPayType(1);//支付方式：1-银行卡，21- 支付宝转银行卡
        goldenReq.setPayerName("小明");//付款人名称(长度 30 位内)
        goldenReq.setReceiveUrl("www.baidu.com");//后台通知回调地址，订单成功后会向这个地址回调

        //获取签名
        String signUnencrypted = goldenReq.getOutOrderId() + goldenReq.getReceiveUrl() + goldenReq.getCustomerAmountCny()
                + "MD5" + appSecret;
        System.out.println("未加密的签名：" + signUnencrypted);

        //签名进行MD5加密(加密后的值为32位小写的字符串)
        String sign = MD5Utils.hexdigest(signUnencrypted);
        System.out.println("加密后的签名：" + sign);
        goldenReq.setSign(sign);//签名

        //发送请求
        String result = OkHttpUtils.post(url, JSON.toJSONString(goldenReq));
        System.out.println("请求结果：" + result);
        Response<GoldenResp> response = JSON.parseObject(result, new TypeReference<Response<GoldenResp>>() {
        });

        System.out.println("response:" + JSON.toJSONString(response));
    }
}
