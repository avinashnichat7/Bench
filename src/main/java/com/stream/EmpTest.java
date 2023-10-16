package com.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpTest {
	
	public static void main(String[] args) {
		//hrDepartmentEmployeesName();
	//	ageOfEmployeeGraterThan25();
			partionBy();
		//	getByAge();
		//	groupingBy();
		//	getEmployeeByDept();
			
		//	maxAgeOfEachDept();
			
		//	getAvgAgeOfEachDept();
		//	getNameOfAllEmployeeWithDipt();
			//hrDepartmentEmployeesName() ;
		}

	static List<Employee>  employees = EmployeeDataBase.getAll();
	
	public static void hrDepartmentEmployeesName() {
		//List<Employee> employees = EmployeeDataBase.getAll();
		
		 Map<String, List<Employee>> map = employees.stream()
		//.filter(e->e.getDepartment().equalsIgnoreCase("Hr"))
		//.map(e->e.getName())
		.collect(Collectors.groupingBy(Employee::getDepartment));
	
		 map.forEach((k,v)->{
					  String string = v.stream()
					 .map(e->e.getName()).findAny().get();
					 System.out.println(string);
					
		});
	}
	
	public static void ageOfEmployeeGraterThan25() {
		
		Employee list = 
				employees.stream()
				.filter(e->e.getAge() >24)
				.findFirst().get();
		
		System.out.println("employees "+list);
		
	}
	
	public static void partionBy() {
		
		Map<Boolean, List<Employee>> collect = employees.stream()
		.collect(Collectors
				.partitioningBy(e->e.getAge()>22,
				     Collectors.toList()));
	
	System.out.println(collect);
	}
	
	public static void getByAge() {
		
		Map<String, Double> avgAgeOfEmployees = employees
		.stream()
		.filter(e->e.getDepartment().equalsIgnoreCase("java"))
		.collect(Collectors
				.groupingBy(Employee::getDepartment,
						Collectors.averagingDouble(Employee::getAge)));
		
		System.out.println(avgAgeOfEmployees);
		
//		 Employee employee = employees.stream()
//		.filter(er->er.getAge()>22).findFirst().get();
//		System.out.println(employee);
	}
	
	
	public static void groupingBy() {
		Map<String, List<Employee>> collect = employees.stream()
		.collect(Collectors
				.groupingBy(e->e.getDepartment(),
						Collectors.toList()));
	
		System.out.println(collect);
	}
	public static void getEmployeeByDept() {
		 List<Employee> list = employees.stream()
		.filter(e->e.getDepartment().equalsIgnoreCase("Python")|| e.getDepartment().equalsIgnoreCase("Hr"))
		.collect(Collectors.toList());
     	System.out.println(list);
	}
	
	public static void getAvgAgeOfEachDept() {
		
		Map<String, Double> avgAge = employees.stream()
		.collect(Collectors
				.groupingBy(Employee::getDepartment,
						Collectors.averagingDouble(Employee::getAge)));
		
		System.out.println(avgAge);
	}
	
	public static void getNameOfAllEmployeeWithDipt() {
		Map<String, List<String>> names = employees.stream()
		.collect(Collectors
				.groupingBy(Employee::getDepartment,
						Collectors .mapping(Employee::getName, Collectors.toList())));
	System.out.println(names);
	}
	
	
	
	
	private static void maxAgeOfEachDept() {

		Map<String, Employee> maxAge = employees.stream()
		.collect(Collectors.groupingBy(e->e.getDepartment(),
				Collectors
				.collectingAndThen(Collectors
						.maxBy(Comparator.comparingInt(Employee::getAge)), 
						Optional::get)));
		
	//	System.out.println(maxAge);
		
		
		
		Map<String, Optional<Employee>> map = employees.stream()
		.collect(Collectors
				.groupingBy(e->e.getDepartment(),Collectors
						.maxBy(Comparator.comparing(Employee::getAge))));
		
		map.forEach((e,v)->{
			System.out.println(e+":"+v.get());
		
			
		});
		
		
	}

}
