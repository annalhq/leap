package com.ann.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Shouter {

    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);
    }

   // we want to print all the object types contained in out list stored in myList
    private static void printList(List<?> myList){
        System.out.println();
    }
}

