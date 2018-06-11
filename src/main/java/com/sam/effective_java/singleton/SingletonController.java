package com.sam.effective_java.singleton;

public class SingletonController {
    public static void main(String[] args) {
//        Singleton singleton = new Singleton(); // not possible as singleton prevents it
        Singleton singleton = Singleton.INSTANCE;
        singleton.display();

        singleton.setNum(100);
        singleton.setStr("Hello");
        singleton.display();

        Singleton singleton2 = Singleton.INSTANCE;
        singleton2.display();

        //print the address of the objects
        System.out.println(singleton);
        System.out.println(singleton2);
    }
}
