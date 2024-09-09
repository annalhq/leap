package com.ann.comparableDemo;

public class Main {
    public static void main(String[] args) {
        Student alan = new Student(12, 87.3F);
        Student richard = new Student(13, 99.5F);

        if (alan.compareTo(richard) < 0 ){
            System.out.println("he has more marks than him");
        }
    }


}
