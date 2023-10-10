package com.streamApi.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeMain {
	static List<Employee> employeeDetails = EmployeeData.employeeDetails();


public static void groupByDept(){
	System.err.println("************groupbyCount**********");
	Map<String, Long> groupByDept = employeeDetails.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
	groupByDept.forEach((dept, count)->System.out.println(dept + ": "+ count));
}

public static void deptByNameEmployee() {
	
	Map<String, List<String>> deptByNameEmployee = 
			employeeDetails.stream().
			collect(Collectors.groupingBy(Employee::getDept, 
					Collectors.mapping(Employee::getName, Collectors.toList())));

deptByNameEmployee.forEach((dept, name)->System.out.println(dept + ":"+ name));
}

public static void deptByEmployeeDetails() {
	
	Map<String, List<Employee>> deptByEmployeeDetails = 
			employeeDetails.
			stream().
			collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));

		deptByEmployeeDetails.entrySet().forEach(s->System.out.println(s));
}

public static void maxSalarybyEachDept() {
	
	 Map<String, Optional<Employee>> maxSalarybyEachDept = employeeDetails.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparing(Employee::getName))));

	maxSalarybyEachDept.entrySet().forEach(s->System.out.println(s.getKey()+":"+s.getValue().get()));
}
public static void secondHighSalaryBy1Dept() {

	Employee employee = employeeDetails.stream()
	.filter(e->e.getDept().equalsIgnoreCase("java"))
	.sorted((o1, o2) ->o2.getSalary()-o1.getSalary() )
	.skip(1)
	.limit(1)
	.findAny()
	.get();
	System.out.println(employee);
	
}
//maptoInt(Employee:valueOf)
	public static void main(String[] args) {
//	groupByDept();	
//	deptByNameEmployee();
	//deptByEmployeeDetails();
	//maxSalarybyEachDept();
		//secondHighSalaryBy1Dept();
		avgSalaryOfEachDept();
	}
	
public static void avgSalaryOfEachDept() {
	Map<String, Double> avgSalaryOfEachDept = employeeDetails.stream().
	collect(Collectors.groupingBy
			(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));

	
	avgSalaryOfEachDept.entrySet().
	forEach(s->System.out.println(s.getKey() + ":"+ s.getValue()));

}
	


}