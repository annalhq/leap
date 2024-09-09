package com.ann.lambdaExp.CWJ;

public class Main {
    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.print();
    }

    static void printThing(Printable thing){
        thing.print();
    }
}
