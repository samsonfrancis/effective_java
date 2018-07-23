package com.sam.effective_java.check_parameters_for_validity;

import java.math.BigInteger;

/**
 * This class explains the validity checks that are required for a method.
 * A required expections/exemptions of a method have to explicity mentioned at the method comment
 * Think about the restrictions on the method parameters and document them and enforce them with explicit checks at the
 * beginning of the method body.
 */
public class CheckMethodParametersForValidity {
    /**
     * Returns a BigInteger whose value is (this mod m). This method differs from the remainder as it always returns a
     * non-negative BigInteger.
     *
     * @param b the modulus which must be positive
     * @return this mod b
     * @throws ArithmeticException if b is less than 1
     */
    public BigInteger mod(BigInteger b){
        if(b == null){
            throw new NumberFormatException("Null value received inside mod.");
        }

        if (b.signum() <= 0) {
            throw new ArithmeticException("BigInteger: modulus not positive");
        } else {
            return b.mod(b);
        }
    }
}
