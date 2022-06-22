package com.cwh.feign.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "orderServer")
public interface OrderServerFeignApi {

    @GetMapping("/order/getOrder")
    String getOrder();

}
