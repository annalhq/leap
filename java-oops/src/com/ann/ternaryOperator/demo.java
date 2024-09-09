package com.ann.ternaryOperator;

import java.util.Scanner;
public class demo {
    public static void main(String[] args) {

        int num;
        String result;

        System.out.println("enter the number");
        Scanner iscan = new Scanner(System.in);
        num = iscan.nextInt();

//        if(num%2 == 0)
//            result = "even";
//        else
//            result = "odd";

        //using ternary operator ? ifTrueResult : ifFalseResult
        result = num%2==0 ? "even" : "odd" ;

        System.out.println(result);
    }
}
