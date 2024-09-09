package com.ann.properties;

public class BoxWeight extends Box {
    double weight;
    public BoxWeight() {
         this.weight = -2;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // called the parent class constructor
        // used to initialize the values in parent class
        this.weight = weight;
    }

    public BoxWeight(BoxPrice other) {
    }
}
