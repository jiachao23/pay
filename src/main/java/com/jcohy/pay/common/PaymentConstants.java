package com.jcohy.pay.common;

/**
 * Created by jiac on 2019/6/11 14:08.
 * ClassName  : PaymentConstants
 * Description  :   支付常量
 * version 1.0
 */
public interface PaymentConstants {
    /**
     * 获取支付类型
     * @return 交易类型
     */
    String getType();

    /**
     * 获取支付接口
     * @return 接口
     */
    String getMethod();
}
