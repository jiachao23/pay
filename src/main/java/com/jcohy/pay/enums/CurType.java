package com.jcohy.pay.enums;

/**
 * Created by jiac on 2019/6/11 15:09.
 * ClassName  : CurType
 * Description  :   基础货币类型
 * version 1.0
 */
public interface CurType {

    /**
     * 获取货币类型
     * @return 货币类型
     */
    String getType();

    /**
     * 货币名称
     * @return 货币名称
     */
    String getName();
}
