package com.jcohy.pay.respository;/**
 * Copyright: Copyright (c) 2019 Asiainfo-Linkage
 *
 * @Description: TODO 请添加该类的功能描述
 * @version: v1.0.0
 * @author: jiac
 * @date: 2019/6/14 17:29
 * <p>
 * Modification History:
 * Date         Author          Version            Description
 * ----------------------------------------------------------------------------------*
 * 2019/6/14      jiac           v1.0.0               修改原因
 */

import javax.persistence.Entity;
import java.util.Date;

/**
 *
 * Copyright: Copyright (c) 2019 Asiainfo-Linkage
 *
 * @Description: TODO 请添加该类的功能描述
 *
 * @version: v1.0.0
 * @author: jiac
 * @date: 2019/6/14 17:29 
 *
 * Modification History:
 * Date         Author          Version            Description
 *----------------------------------------------------------------------------------*
 * 2019/6/14      jiac           v1.0.0               修改原因
 */
@Entity(name = "pay")
public class Pay {
    private Integer id;
    /**
     * 支付类型
     */
    private Long typeId;
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 第三方平台支付id
     */
    private String platformorderId;
    /**
     * 价格 以分为单位
     */
    private Long price;
    /**
     * 支付来源
     */
    private String source;
    /**
     * 支付状态 0 待支付、1支付成功 、2支付失败
     */
    private Integer state;
    /**
     * 支付报文
     */
    private String payMessage;

    /**
     * 用户userId
     */
    private String userId;
    private Date created;
    private Date updated;


}
