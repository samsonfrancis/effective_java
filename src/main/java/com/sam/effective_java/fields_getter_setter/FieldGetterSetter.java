package com.sam.effective_java.fields_getter_setter;

import lombok.Getter;
import lombok.Setter;

/**
 * Expose fileds of a public class with a getter and setter(if needed) instead of declaring the fields as public
 */
public class FieldGetterSetter {
    //bad practice
    public int a;

    //correct way of doing
    @Getter@Setter
    private int b;


}
