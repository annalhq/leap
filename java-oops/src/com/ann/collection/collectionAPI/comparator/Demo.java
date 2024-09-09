package com.ann.collection.collectionAPI.comparator;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {

            public int compare(Integer i, Integer j) {
                if (i%10 > j%10)
                 return 1;
                else
                    return -1;
            }
        };

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(24);
        nums.add(93);
        nums.add(16);

        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
