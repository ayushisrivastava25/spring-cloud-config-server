package com.ayushi.feign.circuit.breaker.helper.controller;

import com.ayushi.feign.circuit.breaker.helper.service.ClassicalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassicalController {

    private ClassicalService classicalService;

    public ClassicalController(ClassicalService classicalService) {
        this.classicalService = classicalService;
    }

    @GetMapping("/v1/classical/{ragaType}")
    public ResponseEntity<Integer> getClassicalSongsCount(@PathVariable("ragaType") String ragaType) {
        return ResponseEntity.ok(classicalService.getClassicalSongsCount(ragaType));
    }
}
