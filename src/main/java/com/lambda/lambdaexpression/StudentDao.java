package com.lambda.lambdaexpression;

import com.lambda.predicates.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {


    public List<Student> getStudents() {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Avinash", 21, 60000, 3));
        students.add(new Student("Manish", 30, 768493087, 2));
        students.add(new Student("Suresh", 20, 44444, 4));


        return students;

    }
}
