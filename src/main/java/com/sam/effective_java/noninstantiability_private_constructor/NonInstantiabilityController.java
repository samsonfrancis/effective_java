package com.sam.effective_java.noninstantiability_private_constructor;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * This class tries to instantiate a object of NonInstantiability class but fails due to private constructor
 */
public class NonInstantiabilityController {
    public static void main(String[] args) {
        NonInstantiability nonInstantiability = null;
        //nonInstantiability = new NonInstantiability();// not possible
    }
}
