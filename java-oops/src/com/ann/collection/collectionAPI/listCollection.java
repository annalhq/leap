package com.ann.collection.collectionAPI;

import java.util.ArrayList;
import java.util.List;

public class listCollection {
    public static void main(String[] args) {

//        Collection <Integer> nums = new ArrayList<Integer>();
//
//        nums.add(24);
//        nums.add(3);
//        nums.add(16);
//
//        System.out.println(nums);

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(24);
        nums.add(3);
        nums.add(16);

//        System.out.println(nums);
        int some = nums.get(2);
        System.out.println(some);
    }

}
