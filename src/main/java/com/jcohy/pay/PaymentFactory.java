package com.jcohy.pay;

import com.jcohy.pay.common.PaymentConfig;
import com.jcohy.pay.common.PaymentService;

/**
 * Copyright: Copyright (c) 2019 Asiainfo-Linkage
 *
 * @Description: TODO 请添加该类的功能描述
 * @version: v1.0.0
 * @author: jiac
 * @date: 2019/6/14 17:55
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ----------------------------------------------------------------------------------*
 * 2019/6/14      jiac           v1.0.0               修改原因
 */


public interface PaymentFactory {
    PaymentService getInstance(PaymentConfig paymentConfig);
}
