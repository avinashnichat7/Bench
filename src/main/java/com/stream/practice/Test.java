package com.stream.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	static List<Patient> all = getAll();

	public static List<Patient> getAll() {

		return Arrays.asList(new Patient("kumar", "corona", 40, 23000), new Patient("dipu", "feaver", 20, 230),
				new Patient("ram", "corona", 30, 27000), new Patient("rutu", "HIV", 18, 450000),
				new Patient("pooja", "cancer", 21, 120000));
	}

	public static void getPatientNameFromDesies() {

		System.err.println("Name of Patient Sufring from diseas");
		Map<String, List<String>> names = all.stream().collect(
				Collectors.groupingBy(e -> e.getdisease(), Collectors.mapping(Patient::getName, Collectors.toList())));
		System.out.println(names);

	}

	public static void getBillOfHivPatient() {

		List<Integer> billofhivpatient = all.stream().filter(e -> e.getdisease().equalsIgnoreCase("HIV"))
				.map(r -> r.getBillPay()).collect(Collectors.toList());

		System.out.println(billofhivpatient);

	}


	public static void main(String[] args) {

		getPatientNameFromDesies();
		getBillOfHivPatient();

	}
}
