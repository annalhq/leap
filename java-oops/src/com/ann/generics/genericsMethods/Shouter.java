package com.ann.generics.genericsMethods;

public class Shouter {

    public static void main(String[] args) {
        shout("John", 22);
    }
    private static <T,V> void shout (T thingToShout, V otherThingToShout){
        System.out.println(thingToShout + "!!!");
        System.out.println(otherThingToShout + "!!!");
    }
}

