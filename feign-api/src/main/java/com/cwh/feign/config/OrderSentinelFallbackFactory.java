package com.cwh.feign.config;

import com.cwh.feign.api.OrderServerFeignApi;
import feign.hystrix.FallbackFactory;

public class OrderSentinelFallbackFactory implements FallbackFactory<OrderServerFeignApi> {

    @Override
    public OrderServerFeignApi create(Throwable throwable) {
        return new OrderServerFeignApi() {
            @Override
            public String getOrder() {
                return "兜底异常";
            }
        };
    }

}
