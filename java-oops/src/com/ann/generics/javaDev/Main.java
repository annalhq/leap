package com.ann.generics.javaDev;

public class Main {

    public static void main(String[] args) {
        Printer <Integer> iPrinter = new Printer<>(24);
        Printer <String> sPrinter = new Printer<>("Alan");

        iPrinter.print();
        sPrinter.print();
    }

}
