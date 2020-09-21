package com.ayushi.feign.circuit.breaker.controller;

import com.ayushi.feign.circuit.breaker.dto.SongsCountResponse;
import com.ayushi.feign.circuit.breaker.service.SongsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SongsController {

    private SongsService songsService;

    public SongsController(SongsService songsService) {
        this.songsService = songsService;
    }

    @GetMapping("/v1/quantity")
    public ResponseEntity<SongsCountResponse> getSongsCountByType(@RequestParam("type") String type) {
        return ResponseEntity.ok(songsService.getQuantityByType(type));
    }
}
