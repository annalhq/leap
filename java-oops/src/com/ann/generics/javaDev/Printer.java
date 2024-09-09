package com.ann.generics.javaDev;

// A typical method to print where data types are predefined
//public class Printer {
//        Integer thingToPrint;
//
//    public void IntegerPrinter(Integer thingToPrint){
//        this.thingToPrint = thingToPrint;
//    }
//    public void IntegerPrinter(Integer thingToPrint){
//        this.thingToPrint = thingToPrint;
//    }
//    public void print(){
//        System.out.println(thingToPrint);
//    }
//}

public class Printer <T>{
    T thingToType ;

    public Printer(T thingToType){
        this.thingToType = thingToType;
    }

    public void print(){
        System.out.println(thingToType);
    }
}