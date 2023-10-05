package com.lambda.predicates;

import java.util.List;
import java.util.stream.Collectors;

public class MainStudent {

    public static List<Student> detailStudent(String input) {
        List<Student> employee = Database.getEmployee();
        return input.equalsIgnoreCase("tax") ? employee.stream().filter(x -> x.getSalary() > 50000).collect(Collectors.toList()) : employee.stream().filter(x -> x.getSalary() <= 50000).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(MainStudent.detailStudent("tax"));
    }
}
