package com.ayushi.feign.circuit.breaker.helper.service.impl;

import com.ayushi.feign.circuit.breaker.helper.enums.Ragas;
import com.ayushi.feign.circuit.breaker.helper.service.ClassicalService;

import java.util.Arrays;

public class ClassicalServiceImpl implements ClassicalService {

    public ClassicalServiceImpl() {}

    public Integer getClassicalSongsCount(String ragaType) {
//        Ragas raga =
//                Arrays.asList(Ragas.values()).stream()
//                        .filter(
//                                ragaDetails ->
//                                        (ragaDetails.getType().equals(ragaType)))
//                        .findFirst()
//                        .orElse(null);
//        return raga.getCount();
        return 10/0;
    }
}