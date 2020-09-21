package com.ayushi.feign.circuit.breaker.helper.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "color", url = "${feign.clients.color.baseUri}")
public interface ColorClient {

    @GetMapping("/v1/color/{color}")
    String getColorInfo(@PathVariable("color") String color);
}

