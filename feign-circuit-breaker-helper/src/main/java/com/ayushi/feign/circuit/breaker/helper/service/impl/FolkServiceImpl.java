package com.ayushi.feign.circuit.breaker.helper.service.impl;

import com.ayushi.feign.circuit.breaker.helper.service.FolkService;

public class FolkServiceImpl implements FolkService {

    public FolkServiceImpl() {
    }

    public Integer getFolkSongsCount() {
        return 5;
    }
}
