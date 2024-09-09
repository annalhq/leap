package com.ann.interfaces;

public class Car implements Brake, Engine, Media {
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("hii");

    }

    @Override
    public void stop() {

    }



}
