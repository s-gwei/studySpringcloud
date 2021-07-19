package com.sun.controller;


import com.sun.entity.CommonResult;
import com.sun.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * @auther zzyy
 * @create 2020-02-18 17:23
 */
@RestController
@Slf4j
public class OrderController {
//    public static final String PAYMENT_URL = "http://localhost:8001/PaymentController";


    public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE/";

    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {

//        return restTemplate.postForEntity(PAYMENT_URL + "PaymentController/payment/create", requestEntity,CommonResult.class).getBody();
        return restTemplate.postForObject(PAYMENT_URL + "PaymentController/payment/create", payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "PaymentController/payment/get/" + id, CommonResult.class);
    }

    @GetMapping("/consumer/payment/getPaymentList")
    public CommonResult<Payment> getPayment() {
        return restTemplate.getForObject(PAYMENT_URL + "PaymentController/payment/getPaymentList", CommonResult.class);
    }

    @GetMapping("/consumer/payment/getForEntity")
    public CommonResult<Payment> getPayment2() {
        ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL + "PaymentController/payment/getPaymentList", CommonResult.class);

        if (entity.getStatusCode().is2xxSuccessful()) {
            return entity.getBody();
        } else {
            return new CommonResult<>(444, "操作失败");
        }
    }

    // ====================> zipkin+sleuth
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin() {
        String result = restTemplate.getForObject(PAYMENT_URL + "PaymentController/payment/zipkin/", String.class);
        return result;
    }
}
