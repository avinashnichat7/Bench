package com.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainEmployee {
    public static void main(String[] args) {


        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Avinash", 1000));
        employees.add(new Employee(1, "Avinash", 3000));
        employees.add(new Employee(1, "Avinash", 2000));


        List<Employee> sortingSalary = employees.stream()
                .sorted((s1, s2) -> s1.getSalary() - s2.getSalary())
                .collect(Collectors.toList());

        System.out.println("Ascending Order=" + sortingSalary);

        List<Employee> descendingOrder = employees.stream().sorted((s1, s2) -> s2.getSalary() - s1.getSalary()).collect(Collectors.toList());

        Map<String, List<Employee>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getName));

        System.out.println("Descending =" + descendingOrder);

        List<Employee> collect = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());

        System.out.println("sort by salary: " + collect);

        List<Employee> sortByNameAndSalary = employees
                .stream()
                .sorted(Comparator.comparing(Employee::getName)
                        .thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
                .collect(Collectors.toList());

        System.out.println(sortByNameAndSalary);
    }
}
