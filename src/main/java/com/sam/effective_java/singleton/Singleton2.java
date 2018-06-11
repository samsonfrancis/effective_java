package com.sam.effective_java.singleton;

/**
 * This is a singleton class which provides the one and only object through the getInstance method
 */
public class Singleton2 {
    private int num;
    private String str;
    private static Singleton2 INSTANCE = new Singleton2();

    private Singleton2() {}

    public void setNum(int num) {
        this.num = num;
    }
    public void setStr(String str) {
        this.str = str;
    }

    public static Singleton2 getInstance(){
        return INSTANCE;
    }

    public void display() {
        System.out.println("Num : " + num + " Str:" + str);
    }
}
