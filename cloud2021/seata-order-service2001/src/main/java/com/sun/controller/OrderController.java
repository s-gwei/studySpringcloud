package com.sun.controller;

import com.sun.domin.CommonResult;
import com.sun.domin.Order;
import com.sun.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RestController
public class OrderController {
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create( Order order)
    {
        http://localhost:2001/order/create?userid=1&producrid=1&counr=10&money=100
        order.setCount(100);
        order.setMoney(new BigDecimal(100));
        order.setUserId(1l);
        order.setProductId(1l);
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}
