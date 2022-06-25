package com.cwh.user.server.controller;

import com.cwh.feign.api.OrderServerFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user/feign")
public class UserFeignController {

    @Autowired
    private OrderServerFeignApi orderServerFeignApi;

    @GetMapping("getUser")
    public String getUser(HttpServletRequest request) {
        //调用订单服务
        String order = orderServerFeignApi.getOrder();
        System.out.println(order);
        return "this is user server";
    }

}
