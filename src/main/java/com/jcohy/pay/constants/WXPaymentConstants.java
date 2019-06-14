package com.jcohy.pay.constants;


import com.jcohy.pay.common.PaymentConstants;

/**
 * Created by jiac on 2019/6/11 11:55.
 * ClassName  : WXPaymentConstants
 * Description  :
 * version 1.0
 */
public enum WXPaymentConstants implements PaymentConstants {
    /**
     *
     */
    WX_QUERY_ORDER("https://api.mch.weixin.qq.com/pay/orderquery"),
    WX_QUERY_REFUND("https://api.mch.weixin.qq.com/pay/refundquery"),
    WX_CLOSE_ORDER("https://api.mch.weixin.qq.com/pay/closeorder"),
    WX_APPLY_REFUND("https://api.mch.weixin.qq.com/secapi/pay/refund");


    private String method;

    private WXPaymentConstants(String method) {
        this.method = method;
    }


    @Override
    public String getType() {
        return this.name();
    }

    @Override
    public String getMethod() {
        return this.method;
    }
}
