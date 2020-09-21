package com.ayushi.feign.circuit.breaker.helper.service.impl;

import com.ayushi.feign.circuit.breaker.helper.clients.ColorClient;
import com.ayushi.feign.circuit.breaker.helper.service.ColorService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

public class ColorServiceImpl implements ColorService {

    private ColorClient colorClient;

    public ColorServiceImpl(ColorClient colorClient){
        this.colorClient = colorClient;
    }

    @HystrixCommand(fallbackMethod = "getColorInfoFallback", commandKey = "colorKey", threadPoolKey = "colorPool")
    public String getColorInfo(String color) {
        return colorClient.getColorInfo(color);
    }

    public String getColorInfoFallback(String color) {
        return "powerful";
    }
}
