package com.jcohy.pay.expection;


/**
 * Created by jiac on 2019/6/11 15:36.
 * ClassName  : PayErrorException
 * Description  :
 * version 1.0
 */
public class PayErrorException extends RuntimeException {

    private PayError error;

    public PayErrorException(PayError error) {
        super(error.getString());
        this.error = error;
    }


    public PayError getPayError() {
        return error;
    }
}
