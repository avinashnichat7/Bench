package com;

import com.streamApi.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Java8Application {
    public static void main(String[] args) {
        Employee employee = new Employee();

//        List<com.stream.streamApi.Employee> employees = Arrays.asList(new Employee(1, "Avinash", 1000),
//                new Employee(3, "Manish", 2000));
//
//        List<Employee> list = employees.stream().sorted(Comparator.comparingInt(Employee::getSalary)).collect(Collectors.toList());
//        System.out.println(list);
//
//        List<Employee> employeeList = employees.stream().sorted((s1, s2) -> s2.getSalary() - s1.getSalary()).collect(Collectors.toList());
//        System.out.println(employeeList);

        System.err.println("********************************************************************");

        SpringApplication.run(Java8Application.class, args);



    }
}
