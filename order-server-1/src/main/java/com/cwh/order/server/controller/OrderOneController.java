package com.cwh.order.server.controller;

import com.cwh.order.server.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
@RefreshScope
public class OrderOneController {

    @Autowired
    private OrderService orderService;

//    @Value("${test.name}")
    private String name;

//    @Value("${test.common}")
    private String common;

    @GetMapping("/getOrder")
    public String getOrder() {
//        double i = 1/0;
        System.out.println("---------OrderServer-1------------");
        return "this is order server";
    }

    @GetMapping("/updateOrder")
    public String updateOrder() {
        System.out.println("---------OrderServer-1-updateOrder------------");
        return "this is order server";
    }

    @GetMapping("/deleteOrder/{orderId}")
    public String deleteOrder(@PathVariable("orderId") Long orderId) {
        orderService.deleteOrder(orderId);
        return "this is order server";
    }

    @GetMapping("/getRemoteConfig")
    public void getRemoteConfig() {
        System.out.println(name);
        System.out.println(common);
    }

}
