package com.cwh.user.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("getUser")
    public String getUser() {
        //调用订单服务
        String orderServerUrl = "http://orderServer/order/getOrder";
        String orderResult = restTemplate.getForObject(orderServerUrl, String.class);
        System.out.println(orderResult);
        return "this is user server";
    }

}
