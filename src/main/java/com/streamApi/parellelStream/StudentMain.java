package com.streamApi.parellelStream;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();


        students.add(new Student(1, "Avinash", 80));
        students.add(new Student(1, "Manish", 40));
        students.add(new Student(1, "Suresh", 70));
        students.add(new Student(1, "Rahul", 20));
        students.add(new Student(1, "Aman", 50));
        students.add(new Student(1, "Chaman", 90));

//        long streamTime = System.currentTimeMillis();
//        System.out.println("using stream =" + streamTime);
//
//        students.stream()
//                .filter(x -> x.getStudentScore() >= 80)
//                .limit(3)
//                .forEach(x -> System.out.println(x.getStudentName() + "=" + x.getStudentScore()))

        System.out.println("Using parele Stream");

        long l = System.currentTimeMillis();
        System.out.println("using parelel stream =" + l);

        students.parallelStream()
                .filter(x -> x.getStudentScore() >= 80)
                .limit(3)
                .forEach(x -> System.out.println(x.getStudentName() + "=" + x.getStudentScore()));
        System.out.println("using parelel method it is same as parelleStream");

//        students.stream().parallel()
//                .filter(x -> x.getStudentScore() >= 80)
//                .limit(3)
//                .forEach(x -> System.out.println(x.getStudentName() + "=" + x.getStudentScore()));


    }

}
