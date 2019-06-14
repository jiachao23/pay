package com.jcohy.pay.alipay;



import com.jcohy.pay.bean.PayMessage;
import com.jcohy.pay.bean.PayOrder;
import com.jcohy.pay.bean.RefundOrder;
import com.jcohy.pay.bean.TransferOrder;
import com.jcohy.pay.common.*;

import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Map;

/**
 * Created by jiac on 2019/6/11 14:31.
 * ClassName  : AliPaymentService
 * Description  :   支付宝支付
 * version 1.0
 */
public class AliPaymentService implements PaymentService {


    /**
     * 支付配置
     */
    private PaymentConfig paymentConfig;


    @Override
    public void setPaymentConfig(PaymentConfig paymentConfig) {
         this.paymentConfig = paymentConfig;;
    }

    @Override
    public PaymentConfig getPaymentConfig() {
        return this.paymentConfig;
    }

    @Override
    public boolean verify(Map<String, Object> params) {
        return false;
    }

    @Override
    public boolean signVerify(Map<String, Object> params, String sign) {
        return false;
    }

    @Override
    public boolean verifySource(String id) {
        return false;
    }

    @Override
    public Map<String, Object> orderInfo(PayOrder order) {
        return null;
    }

    @Override
    public String toPay(PayOrder order) {
        return null;
    }

    @Override
    public String createSign(String content, String characterEncoding) {
        return null;
    }

    @Override
    public String createSign(Map<String, Object> content, String characterEncoding) {
        return null;
    }

    @Override
    public Map<String, Object> getParameter2Map(Map<String, String[]> parameterMap, InputStream is) {
        return null;
    }

    @Override
    public PayResultMessage getPayOutMessage(String code, String message) {
        return null;
    }

    @Override
    public PayResultMessage successPayOutMessage(PayMessage payMessage) {
        return null;
    }

    @Override
    public BufferedImage genQrPay(PayOrder order) {
        return null;
    }

    @Override
    public Map<String, Object> microPay(PayOrder order) {
        return null;
    }

    @Override
    public Map<String, Object> query(String tradeNo, String outTradeNo) {
        return null;
    }

    @Override
    public <T> T query(String tradeNo, String outTradeNo, PayCallback<T> callback) {
        return null;
    }

    @Override
    public Map<String, Object> close(String tradeNo, String outTradeNo) {
        return null;
    }

    @Override
    public <T> T close(String tradeNo, String outTradeNo, PayCallback<T> callback) {
        return null;
    }

    @Override
    public Map<String, Object> cancel(String tradeNo, String outTradeNo) {
        return null;
    }

    @Override
    public <T> T cancel(String tradeNo, String outTradeNo, PayCallback<T> callback) {
        return null;
    }

    @Override
    public Map<String, Object> refund(String tradeNo, String outTradeNo, BigDecimal refundAmount, BigDecimal totalAmount) {
        return null;
    }

    @Override
    public <T> T refund(String tradeNo, String outTradeNo, BigDecimal refundAmount, BigDecimal totalAmount, PayCallback<T> callback) {
        return null;
    }

    @Override
    public Map<String, Object> refund(RefundOrder refundOrder) {
        return null;
    }

    @Override
    public <T> T refund(RefundOrder refundOrder, PayCallback<T> callback) {
        return null;
    }

    @Override
    public Map<String, Object> refundquery(String tradeNo, String outTradeNo) {
        return null;
    }

    @Override
    public <T> T refundquery(String tradeNo, String outTradeNo, PayCallback<T> callback) {
        return null;
    }

    @Override
    public Map<String, Object> refundquery(RefundOrder refundOrder) {
        return null;
    }

    @Override
    public <T> T refundquery(RefundOrder refundOrder, PayCallback<T> callback) {
        return null;
    }

    @Override
    public Map<String, Object> downloadbill(Date billDate, String billType) {
        return null;
    }

    @Override
    public <T> T downloadbill(Date billDate, String billType, PayCallback<T> callback) {
        return null;
    }

    @Override
    public Map<String, Object> secondaryInterface(Object tradeNoOrBillDate, String outTradeNoBillType, TransactionType transactionType) {
        return null;
    }

    @Override
    public <T> T secondaryInterface(Object tradeNoOrBillDate, String outTradeNoBillType, TransactionType transactionType, PayCallback<T> callback) {
        return null;
    }

    @Override
    public Map<String, Object> transfer(TransferOrder order) {
        return null;
    }

    @Override
    public <T> T transfer(TransferOrder order, PayCallback<T> callback) {
        return null;
    }

    @Override
    public Map<String, Object> transferQuery(String outNo, String tradeNo) {
        return null;
    }

    @Override
    public <T> T transferQuery(String outNo, String tradeNo, PayCallback<T> callback) {
        return null;
    }

    @Override
    public PayResultMessage payBack(Map<String, String[]> parameterMap, InputStream is) {
        return null;
    }

    @Override
    public String getReqUrl(TransactionType transactionType) {
        return null;
    }
}
