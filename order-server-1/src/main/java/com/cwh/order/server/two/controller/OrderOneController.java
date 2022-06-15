package com.cwh.order.server.two.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderOneController {

    @GetMapping("/getOrder")
    public String getOrder() {
        System.out.println("---------OrderServer-1------------");
        return "this is order server";
    }

}
