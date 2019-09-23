package com.jizhifu.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.jizhifu.model.request.AgentPayReq;
import com.jizhifu.model.response.Response;
import com.jizhifu.util.MD5Utils;
import com.jizhifu.util.OkHttpUtils;
import com.jizhifu.util.RandomGeneratorUtils;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 代付下单demo
 */
public class AgentPayDemo {
    private static String appKey = "c3246abfcddb46f3a26c845f06b8a293";  //appKey(商户后台设置可以获取到值)
    private static String appSecret = "a62e17090db0e808a6ab3675a41bc06b"; //appSecret 为系统后台安全设置的 appSecret 值
    private static String urlPref = "http://pay-test.cpayxx.com/api/exchange";//测试环境
    //private static String urlPref = "：http://api.jipay.io/exchange/";//正式环境

    public static void main(String[] args) throws Exception {
        String url = urlPref + "/api/open/agentPay/orderCreate/" + appKey;

        AgentPayReq agentPayReq = new AgentPayReq();
        agentPayReq.setOutOrderId(new Date().getTime() + "");//商户订单号(长度不超过36 位)
        agentPayReq.setPayAmount(new BigDecimal("1000"));//代付金(CNY)
        agentPayReq.setPayType(1);//支付方式：1-银行卡，21- 支付宝转银行卡
        agentPayReq.setPayeeName("小明");//收款人名称(长度 30 位内)
        agentPayReq.setPayeeAccount("623269325269589564");//收款人账号
        agentPayReq.setAccountBankName("平安银行");//收款银行
        agentPayReq.setBranchBankName("港青街支行");//收款银行支行
        agentPayReq.setReceiveUrl("www.baidu.com");//后台通知回调地址
        agentPayReq.setTimestamp(new Date().getTime());//当前时间戳
        agentPayReq.setNoncestr(RandomGeneratorUtils.generateRandomStr(10));//随机字符串

        //获取签名
        String signUnencrypted = agentPayReq.getPayeeName() + agentPayReq.getPayeeAccount() + agentPayReq.getPayAmount()
                +  agentPayReq.getReceiveUrl() + agentPayReq.getNoncestr() + agentPayReq.getTimestamp() + "MD5" + appSecret;
        System.out.println("未加密的签名：" + signUnencrypted);

        //签名进行MD5加密(加密后的值为32位小写的字符串)
        String sign = MD5Utils.hexdigest(signUnencrypted);
        System.out.println("加密后的签名：" + sign);
        agentPayReq.setSign(sign);//签名

        //发送请求
        String result = OkHttpUtils.post(url, JSON.toJSONString(agentPayReq));
        System.out.println("请求结果：" + result);
        Response<String> response = JSON.parseObject(result, new TypeReference<Response<String>>() {
        });

        System.out.println("response:" + JSON.toJSONString(response));
    }
}
