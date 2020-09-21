package com.ayushi.feign.circuit.breaker.service.impl;

import com.ayushi.feign.circuit.breaker.clients.AppliancesClient;
import com.ayushi.feign.circuit.breaker.clients.ClockClient;
import com.ayushi.feign.circuit.breaker.clients.CompassClient;
import com.ayushi.feign.circuit.breaker.dto.SongsCountResponse;
import com.ayushi.feign.circuit.breaker.service.SongsService;

public class SongsServiceImpl implements SongsService {

    private ClockClient clockClient;
    private AppliancesClient appliancesClient;
    private CompassClient compassClient;

    public SongsServiceImpl(ClockClient clockClient, AppliancesClient appliancesClient, CompassClient compassClient) {
        this.clockClient = clockClient;
        this.appliancesClient = appliancesClient;
        this.compassClient = compassClient;
    }

    @Override
    public SongsCountResponse getQuantityByType(String type) {
        return SongsCountResponse.builder().clock(clockClient.getClockCount(type)).appliance(appliancesClient.getApplianceCount()).compass(compassClient.getCompassCount()).build();
    }
}
