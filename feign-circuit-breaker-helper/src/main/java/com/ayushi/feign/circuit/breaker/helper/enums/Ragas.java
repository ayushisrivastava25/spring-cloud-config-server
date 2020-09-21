package com.ayushi.feign.circuit.breaker.helper.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Ragas {

    DARBARI(3, "darbari"),
    YAMAN(2, "yaman"),
    BHAIRAVI(5, "bhairavi");

    private int count;
    private String type;
}
