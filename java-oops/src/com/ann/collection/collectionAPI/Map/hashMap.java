package com.ann.collection.collectionAPI.Map;

import java.util.HashMap;
import java.util.Map;

public class hashMap {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();

        students.put("Alan", 42);
        students.put("Robert", 12);
        students.put("Emma", 52);
        students.put("John", 18);

        System.out.println(students);
    }

}
