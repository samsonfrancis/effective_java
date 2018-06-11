package com.sam.effective_java.singleton;

public class Singleton2Controller {
    public static void main(String[] args) {
//        Singleton2 s = new Singleton2(); // not possible as singleton2 prevents it
        Singleton2 singleton2 = Singleton2.getInstance();
        singleton2.display();

        singleton2.setNum(100);
        singleton2.setStr("Hello");
        singleton2.display();

        Singleton2 singleton22 = Singleton2.getInstance();
        singleton22.display();

        //print the address of the objects
        System.out.println(singleton2);
        System.out.println(singleton22);
    }
}
