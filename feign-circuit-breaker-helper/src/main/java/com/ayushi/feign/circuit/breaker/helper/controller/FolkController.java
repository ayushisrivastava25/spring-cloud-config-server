package com.ayushi.feign.circuit.breaker.helper.controller;

import com.ayushi.feign.circuit.breaker.helper.service.FolkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FolkController {

    private FolkService folkService;

    public FolkController(FolkService folkService) {
        this.folkService = folkService;
    }

    @GetMapping("/v1/folk")
    public ResponseEntity<Integer> getFolkSongsCount() {
        return ResponseEntity.ok(folkService.getFolkSongsCount());
    }
}
