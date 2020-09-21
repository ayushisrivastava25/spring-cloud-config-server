package com.ayushi.feign.circuit.breaker.helper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;

@EnableFeignClients(basePackages = "com.ayushi")
@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@EnableHystrixDashboard
@EnableCircuitBreaker
@Import({ApiConfiguration.class})
public class FeignCircuitBreakerHelper {

    public static void main(String[] args) {
        SpringApplication.run(FeignCircuitBreakerHelper.class, args);
    }

    @Bean
    public HttpTraceRepository httpTraceRepository()
    {
        return new InMemoryHttpTraceRepository();
    }
}
