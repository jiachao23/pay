package com.jcohy.pay.common;

import java.util.Map;

/**
 * Created by jiac on 2019/6/11 15:05.
 * ClassName  : PayCallback
 * Description  : 支付回调，转换参数
 * version 1.0
 */
public interface PayCallback<T> {
    /**
     * 执行者
     * @param map 需要转化的map
     * @return 处理过后的类型对象
     */
    T perform(Map<String, Object> map);
}
