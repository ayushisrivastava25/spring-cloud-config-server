package com.ayushi.feign.circuit.breaker.helper.service.impl;

import com.ayushi.feign.circuit.breaker.helper.service.FusionService;

public class FusionServiceImpl implements FusionService {

    public FusionServiceImpl() {
    }

    public Integer getFusionSongsCount() {
        return 4;
    }
}
