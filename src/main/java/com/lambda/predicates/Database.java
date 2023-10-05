package com.lambda.predicates;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<Student> getEmployee() {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Avinash", 21, 60000, 3));
        students.add(new Student("Manish", 30, 768493087, 2));
        students.add(new Student("Suresh", 20, 44444, 4));
        return students;
    }
}
