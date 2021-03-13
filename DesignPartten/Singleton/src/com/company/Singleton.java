package com.company;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("create a instance of Singleton");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
