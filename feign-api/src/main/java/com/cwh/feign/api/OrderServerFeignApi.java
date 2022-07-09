package com.cwh.feign.api;

import com.cwh.feign.config.OrderSentinelFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "orderServer", fallbackFactory = OrderSentinelFallbackFactory.class)
public interface OrderServerFeignApi {

    @GetMapping("/order/getOrder")
    String getOrder();

}
