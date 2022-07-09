package com.cwh.order.server.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @SentinelResource(value = "deleteOrder")
    public void deleteOrder(Long orderId) {
        System.out.println("---------OrderServer-1-deleteOrder------------");
    }

}
