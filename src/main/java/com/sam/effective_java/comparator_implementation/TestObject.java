package com.sam.effective_java.comparator_implementation;

import lombok.Getter;
import lombok.Setter;

public class TestObject {
    @Getter@Setter
    private final  int b;
    @Getter@Setter
    private final  int a;

    public TestObject(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
