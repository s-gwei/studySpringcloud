package com.sun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;


//    @GetMapping(value = "/payment/nacos")
//    public String getPayment(@RequestParam Integer id ){
//     return "nacos registry, serverPort: "+serverPort+";"+id;
//    }

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPayment(@PathVariable("id") Integer id ){
        return "nacos registry, serverPort: "+serverPort+";"+id;
    }
}
