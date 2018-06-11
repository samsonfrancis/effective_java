package com.sam.effective_java.singleton;

/**
 * This is a singleton class implemented using the static final 'INSTANCE' field
 * This field returns the same object every time
 */
public class Singleton {
    public static final Singleton INSTANCE = new Singleton();

    private int num;
    private String str;

    public void setNum(int num) {
        this.num = num;
    }
    public void setStr(String str) {
        this.str = str;
    }

    private Singleton() {}
    public void display() {
        System.out.println("Num : " + num + " Str:" + str);
    }
}
