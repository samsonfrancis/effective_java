package com.sam.effective_java.obsolete_references;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * This class demonstrates the obsolete referenced objects that are not removed by the garbage collector,
 * which may result in out of memory error.
 * To avoid this thos objects should be set to null if they are not needed anymore
 */
public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack(){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e){
        ensureCapacity();
        elements[size++] = e;
    }

/*
    //this method does not derefereance the obsolete objects - can run into out of memory error
    public Object pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        return elements[--size];
    }
*/

    //this method derefereance the obsolete objects by setting it to null
    public Object pop(){
        if(size == 0){
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null; //eliminate obsolete reference
        return result;
    }

    /**
     * Ensure space for at least one more element, roughly doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity(){
        if(elements.length == size){
            elements = Arrays.copyOf(elements,2 * size + 1);
        }
    }
}
