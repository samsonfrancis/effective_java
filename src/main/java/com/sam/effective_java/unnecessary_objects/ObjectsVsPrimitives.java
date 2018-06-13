package com.sam.effective_java.unnecessary_objects;

/**
 * The following programs execution time differs based on the object and primitive type of sum
 * In the following if we declare sum as Long - every time sum +=i conerts i to Long object and sums.
 * This creation of object elapses lot of time compared to the primitive type long.
 */
public class ObjectsVsPrimitives {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k++) {
//            Long sum = 0L; //execution time of 3min:12sec
            long sum = 0L; //execution time of 11sec
            for (long i = 0; i < Integer.MAX_VALUE; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
