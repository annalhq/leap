package com.ann.abstractClass;

public class Son extends Parent {

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }

    @Override
    void partner(String herName) {
        System.out.println("Her name is " + herName + "and she's pretty");
    }
}
