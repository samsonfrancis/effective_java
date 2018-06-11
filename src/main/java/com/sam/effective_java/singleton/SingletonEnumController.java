package com.sam.effective_java.singleton;

public class SingletonEnumController {
    public static void main(String[] args) {
        SingletonEnum s = SingletonEnum.INSTANCE;
        s.display();

        s.setNum(10);
        s.setStr("A");
        s.display();

        SingletonEnum s2 = SingletonEnum.INSTANCE;
        s2.display();
    }
}
