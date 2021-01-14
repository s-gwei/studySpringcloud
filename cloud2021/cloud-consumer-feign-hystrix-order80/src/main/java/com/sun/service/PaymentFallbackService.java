package com.sun.service;

import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2020-02-20 18:22
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{


    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }


    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
