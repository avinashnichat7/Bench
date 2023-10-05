package com.lambda.lambdaexpression;

import com.lambda.predicates.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent {
    public static List<Student> getStudentInfo() {
        StudentDao dao = new StudentDao();

        List<Student> students = dao.getStudents();

        Collections.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        return students;
    }

    public static List<Student> descStudentSalary() {

        StudentDao studentDao = new StudentDao();

        List<Student> students = studentDao.getStudents();

        Collections.sort(students, (s1, s2) -> s1.getSalary() - s2.getSalary());

        Collections.sort(students, (s1, s2) -> s2.getAge()-s1.getAge());
        return students;
    }

    public static void main(String[] args) {

        System.out.println(getStudentInfo());


        System.out.println(descStudentSalary());
    }


}


