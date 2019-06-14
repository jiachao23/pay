package com.jcohy.pay.alipay;


import com.jcohy.pay.common.BasePaymentConfig;

/**
 * Created by jiac on 2019/6/11 13:34.
 * ClassName  : AliPaymentConfig
 * Description  :
 * version 1.0
 */
public class AliPaymentConfig extends BasePaymentConfig {


    /**
     * 商户应用id
     */
    private String appid;
    /**
     * 商户签约拿到的pid,partner_id的简称，合作伙伴身份等同于 partner
     */
    private String pid;

    /**
     * 商户收款账号
     */
    private String seller;


    public void setAppid(String appid) {
        this.appid = appid;
    }

    @Override
    public String getAppid() {
        return appid;
    }


    @Override
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    @Override
    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }
}
