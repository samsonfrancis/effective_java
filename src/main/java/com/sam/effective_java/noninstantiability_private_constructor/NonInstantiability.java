package com.sam.effective_java.noninstantiability_private_constructor;

/**
 * To ensure noninstantiability with a private constructor
 * By default the constructo has the access of the class, so to make it non instantiable declare
 * the constructor with private access
 */
public class NonInstantiability {
   //supress default constructor for non instantiability
   private NonInstantiability(){}
}
