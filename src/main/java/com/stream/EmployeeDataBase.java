package com.stream;

import java.util.Arrays;
import java.util.List;

public class EmployeeDataBase {

	public static List<Employee>getAll(){
		
	return	Arrays.asList(
				new Employee(1, "raju", 23, "raju@gmail.com", "JAVA"),
				new Employee(2, "dipak", 25, "dipak@gmail.com", "Python"),
				new Employee(3, "mohan", 25, "mohan@gmail.com", "C++"),
				new Employee(7, "Pooja", 22, "pooja@gmail.com", "HR"),
				new Employee(4, "Rutuja", 19, "rutu@gmail.com", "JAVA"),
				new Employee(6, "nitya", 28, "nitya@gmail.com", "Python"),
				new Employee(5, "nikita", 24, "niki@gmail.com", "HR")
				);
		
	}
}
