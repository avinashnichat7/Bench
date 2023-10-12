package com;

import com.streamApi.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Java8Application {
    public static void main(String[] args) {
        Employee employee = new Employee();

//        List<com.stream.streamApi.Student> employees = Arrays.asList(new Student(1, "Avinash", 1000),
//                new Student(3, "Manish", 2000));
//
//        List<Student> list = employees.stream().sorted(Comparator.comparingInt(Student::getSalary)).collect(Collectors.toList());
//        System.out.println(list);
//
//        List<Student> employeeList = employees.stream().sorted((s1, s2) -> s2.getSalary() - s1.getSalary()).collect(Collectors.toList());
//        System.out.println(employeeList);

        System.err.println("********************************************************************");

        SpringApplication.run(Java8Application.class, args);



    }
}
