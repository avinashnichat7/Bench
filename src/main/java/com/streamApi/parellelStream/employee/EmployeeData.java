package com.streamApi.parellelStream.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    public static void main(String[] args) {
        List<com.streamApi.stream.Employee> employees = com.streamApi.stream.EmployeeData.employeeDetails();

        long start = 0;
        long end = 0;

        start = System.currentTimeMillis();
        double asDouble = employees.stream()
                .map(x -> x.getSalary())
                .mapToDouble(x -> x).average().getAsDouble();

        end = System.currentTimeMillis();
        System.out.println("Avg salary" + asDouble + "Normal Stream Time ::" + (end - start));


        System.out.println("*************************************************");
        double asDouble1 = employees.parallelStream()
                .map(x -> x.getSalary())
                .mapToDouble(x -> x).average().getAsDouble();
        System.out.println("Avg salary" + asDouble1 + "Normal Parellel Stram Time ::" + (end - start));

    }

    public static List<Employee> employeeData() {
        List<Employee> list = new ArrayList<>();

        for (int i = 1; i < 10; i++) {

            list.add(new Employee(i, "employee", Double.valueOf(100 * 10)));


        }


        return list;
    }
}
