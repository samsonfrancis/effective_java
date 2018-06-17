package com.sam.effective_java.minimize_accessibility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * This class demonstrates that if a field is declared final it still can expose its object fields to be modified,
 * but only the reference would be the same.
 *
 * Solution: 1) make the field private and return a copy 2) Construct unmodifiable object
 */
public class MinimizeAccessibility {

//---------------------------------------------------------------------------------------------------------
    //implementation 1 - not right
    //potential security hole - the array objects can re assigned
    public static final String[] names = {"Samson","Francis"};
//---------------------------------------------------------------------------------------------------------


//---------------------------------------------------------------------------------------------------------
    //implementation 2 - correct
    //field declared as private not accessible outside of  class
    private static final String[] names2 = {"Samson","Francis"};
    //to overcome the above return unmodiable list
    public static final List<String> names3 = Collections.unmodifiableList(Arrays.asList(names2));
//---------------------------------------------------------------------------------------------------------


    public static void main(String[] args) {

        //implementation 1
        System.out.println("--------------impl 1------------------");
        System.out.println(names[0]);
        System.out.println(names[1]);

        names[0] = "Samson2";
        names[1] = "Francis2";
        System.out.println(names[0]);
        System.out.println(names[1]);

        //implementation 2
        System.out.println("--------------impl 2------------------");
        List<String> elements = MinimizeAccessibility.names3;
        System.out.println(elements);

//        elements.remove(0); //not possible
//        elements.add("AddedElement"); // not possible

    }
}
