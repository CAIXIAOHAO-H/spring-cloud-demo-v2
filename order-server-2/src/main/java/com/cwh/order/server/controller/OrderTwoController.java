package com.cwh.order.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
@RefreshScope
public class OrderTwoController {

//    @Value("${test.common}")
    private String common;

    @GetMapping("/getOrder")
    public String getOrder() {
        System.out.println("---------OrderServer-2------------");
        return "this is order server";
    }

    @GetMapping("/getRemoteConfig")
    public void getRemoteConfig() {
        System.out.println(common);
    }

}
