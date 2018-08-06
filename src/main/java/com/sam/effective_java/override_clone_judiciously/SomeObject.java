package com.sam.effective_java.override_clone_judiciously;

import lombok.Getter;
import lombok.Setter;

public class SomeObject {
    @Getter@Setter
    String name;

    public SomeObject(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "SomeObject_Name:"+ name;
    }
}
