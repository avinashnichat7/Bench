package com.streamApi.stream;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {

	public static List<Employee> employeeDetails() {

		return Arrays.asList
				(new Employee(1, "Avinash", "b+", "ngp", 26, 5000, "Java"),
				(new Employee(2, "Ramesh", "o+", "ngp", 26, 6000, "DevOps")),
				(new Employee(2, "Chetan", "b+", "goa", 26, 2000, "JS")),
				(new Employee(4, "Kailas", "A+", "pune", 26, 1400, "Java")));
	}
}
