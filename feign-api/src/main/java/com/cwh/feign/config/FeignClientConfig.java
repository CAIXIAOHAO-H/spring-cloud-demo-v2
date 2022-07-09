package com.cwh.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {

    @Bean
    public Logger.Level feignLogLevel() {
        return Logger.Level.FULL;
    }

    @Bean
    public OrderSentinelFallbackFactory orderSentinelFallbackFactory() {
        return new OrderSentinelFallbackFactory();
    }

}
