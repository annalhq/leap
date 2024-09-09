package com.ann.abstractClass;

public class Daughter extends Parent {

    @Override
    void career(String name) {
        System.out.println("I am going to be a " + name);
    }

    @Override
    void partner(String herName) {
        System.out.println("His name is " + herName + "and he's pretty");
    }
}
