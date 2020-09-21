package com.ayushi.feign.circuit.breaker.clients;

import com.ayushi.feign.circuit.breaker.controller.ClockController;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;

public interface ClockFallback extends ClockClient {

    @Component
    public static class ClockClientFallback implements ClockController {

        @Override
        public String greeting(@PathVariable("username") String username) {
            return "Hello User!";
        }
    }
}