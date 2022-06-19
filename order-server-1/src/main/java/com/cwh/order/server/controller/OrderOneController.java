package com.cwh.order.server.controller;

import com.cwh.order.server.config.RemoteConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
@RefreshScope
public class OrderOneController {

    @Autowired
    private RemoteConfig remoteConfig;

    @Value("${test.name}")
    private String name;

    @Value("${test.common}")
    private String common;

    @GetMapping("/getOrder")
    public String getOrder() {
        System.out.println("---------OrderServer-1------------");
        return "this is order server";
    }

    @GetMapping("/getRemoteConfig")
    public void getRemoteConfig() {
        System.out.println(name);
        System.out.println(common);
    }

}
