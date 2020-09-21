package com.ayushi.feign.circuit.breaker.helper.controller;

import com.ayushi.feign.circuit.breaker.helper.service.FusionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FusionController {

    private FusionService fusionService;

    public FusionController(FusionService fusionService) {
        this.fusionService = fusionService;
    }

    @GetMapping("/v1/fusion")
    public ResponseEntity<Integer> getFusionSongsCount() {
        return ResponseEntity.ok(fusionService.getFusionSongsCount());
    }
}
