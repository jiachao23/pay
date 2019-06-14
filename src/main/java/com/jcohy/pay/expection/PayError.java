package com.jcohy.pay.expection;

/**
 * Created by jiac on 2019/6/11 15:37.
 * ClassName  : PayError
 * Description  :
 * version 1.0
 */
public interface PayError {

    /**
     * 获取错误码
     *
     * @return 错误码
     */
    String getErrorCode();

    /**
     * 获取错误消息
     *
     * @return 错误消息
     */
    String getErrorMsg();

    /**
     * 获取异常信息
     * @return 异常信息
     */
    String getString();

}
