package com.sam.effective_java.singleton;

import java.io.Serializable;

/**
 * This is a singleton class. This does a lazy creation and initialization of the object, unlike the others where object
 * is created initially.
 */
public class SingletonLazyObjectCreation implements Serializable {
    private static SingletonLazyObjectCreation INSTANCE = null;
    private SingletonLazyObjectCreation() {}

    public synchronized static SingletonLazyObjectCreation getInstance() {
        if(INSTANCE == null){
            synchronized(SingletonLazyObjectCreation.class) {
                    INSTANCE = new SingletonLazyObjectCreation();
            }
        }
        return INSTANCE;
    }
}
