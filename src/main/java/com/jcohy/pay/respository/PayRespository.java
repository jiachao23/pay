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

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jiac on 2019/6/14 17:29.
 * ClassName  : PayRespository
 * Description  :
 * version 1.0
 */
public interface PayRespository extends JpaRepository<Pay,Integer> {
}
