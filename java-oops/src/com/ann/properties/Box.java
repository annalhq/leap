package com.ann.properties;

public class Box {
    double l,h,w;

    Box() {
        this.h = -1;
        this.w = -1;
        this.l = -1;
    }

    // cube
    Box (double side) {
        this.w = side;
        this.l = side;
        this.h = side;
    }

    //cuboid
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    // pass values of old box into the new one
    Box (Box old) {
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void information() {
        System.out.println("running the box");
    }

}
