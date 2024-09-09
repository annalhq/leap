package com.ann.collection.collectionAPI.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
    int age;
    String name;

    public  Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Student [age =" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that) {

        if(this.age > that.age)
            return 1;
        else
            return -1;
    }
}
public class realOne {
    public static void main(String[] args) {


//        Comparator<Student> com = new Comparator<Student>() {
//
//            public int compare(Student i, Student j) {
//                if(i.age > j.age)
//                    return 1;
//                else
//                    return -1;
//            }
//        };

        //using lambda expressions and ternary operator

        Comparator<Student> com = (Student i, Student j) -> {
                return i.age > j.age?1:-1;
        };
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "alan"));
        studs.add(new Student(26, "richard"));
        studs.add(new Student(31, "william"));
        studs.add(new Student(24, "qin"));

        Collections.sort(studs, com);
        for (Student s : studs)
            System.out.println(s);

    }
}
