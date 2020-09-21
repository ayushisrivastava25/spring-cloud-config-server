package com.ayushi.feign.circuit.breaker.service;

import com.ayushi.feign.circuit.breaker.dto.SongsCountResponse;

public interface SongsService {

    SongsCountResponse getQuantityByType(String type);
}
