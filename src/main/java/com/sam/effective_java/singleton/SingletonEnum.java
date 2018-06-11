package com.sam.effective_java.singleton;

public enum  SingletonEnum {
    INSTANCE;

    int num;
    String str;

    public void setNum(int num) {
        this.num = num;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public void display() {
        System.out.println("Num : " + num + " Str:" + str);
    }
}
