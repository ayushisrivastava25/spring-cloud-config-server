package com.ayushi.feign.circuit.breaker.helper;

import com.ayushi.feign.circuit.breaker.helper.service.ClassicalService;
import com.ayushi.feign.circuit.breaker.helper.clients.ColorClient;
import com.ayushi.feign.circuit.breaker.helper.service.ColorService;
import com.ayushi.feign.circuit.breaker.helper.service.FolkService;
import com.ayushi.feign.circuit.breaker.helper.service.FusionService;
import com.ayushi.feign.circuit.breaker.helper.service.impl.ClassicalServiceImpl;
import com.ayushi.feign.circuit.breaker.helper.service.impl.ColorServiceImpl;
import com.ayushi.feign.circuit.breaker.helper.service.impl.FolkServiceImpl;
import com.ayushi.feign.circuit.breaker.helper.service.impl.FusionServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {
                "com.ayushi.feign.circuit.breaker.helper.controller",
                "com.ayushi.feign.circuit.breaker.helper.clients"
        })
public class ApiConfiguration {

    @Bean
    public ClassicalService classicalService() {
        return new ClassicalServiceImpl();
    }

    @Bean
    public FolkService folkService() {
        return new FolkServiceImpl();
    }

    @Bean
    public FusionService fusionService() {
        return new FusionServiceImpl();
    }

    @Bean
    public ColorService colorService(ColorClient colorClient) {
        return new ColorServiceImpl(colorClient);
    }
}
