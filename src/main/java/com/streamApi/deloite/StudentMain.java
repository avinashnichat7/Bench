package com.streamApi.deloite;

import com.streamApi.parellelStream.employee.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StudentMain {
    static List<Student> studentDetails = StudentData.employeeData();


    public static void main(String[] args) {
//        sortEmployyeByName();
//        sortdByNameAndSalary();
//        groupByDept();
//        countByDept();
//        maxSalaryByEachDept();
//        nameByEachDept();
        maxsalaryBYOneDept();

    }


    public static void sortEmployyeByName() {
        studentDetails.stream()
                .sorted(Comparator.comparing(Student::getName))
                .forEach(x -> System.out.println(x.getName()));

        studentDetails.stream()
                .sorted(Comparator.comparing(Student::getName).reversed())
                .forEach(x -> System.out.println("desc order employee name : " + x));
    }

    public static void sortdByNameAndSalary() {
        studentDetails.stream()
                .sorted(Comparator.comparing(Student::getName).thenComparing(Student::getSalary))
                .forEach(x -> System.out.println("Name :" + x.getName() + " Salary:" + x.getSalary()));
    }

    public static void groupByDept() {
        Map<String, List<Student>> groupByDept = studentDetails.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.toList()));
        groupByDept.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void countByDept() {

        Map<String, Long> collect = studentDetails.stream().collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        collect.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void maxSalaryByEachDept() {
        Map<String, Optional<Student>> deptByMaxSalary = studentDetails.stream()
                .collect(Collectors.groupingBy(Student::getDept,
                        Collectors.maxBy(Comparator.comparing(Student::getDept))));

        deptByMaxSalary.entrySet()
                .forEach((k -> System.out.println(k.getKey() + ": " + k.getValue().get())));
    }

    public static void nameByEachDept() {

        Map<String, List<String>> collect = studentDetails.stream().collect(Collectors.groupingBy(Student::getDept,
                Collectors.mapping(Student::getName, Collectors.toList())));

        collect.forEach((x, v) -> System.out.println(x + " " + v));
    }


    public static void maxsalaryBYOneDept() {

        Student java = studentDetails.stream()
                .filter(x -> x.getDept()
                        .equalsIgnoreCase("Java"))
                .sorted(Comparator.comparing(Student::getDept).reversed())
                .findFirst().get();

        System.out.println(java);
    }
}
