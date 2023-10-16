package com.stream.practice;

public class Patient {

	private String name;
	private String disease;
	private int age;
	private int billPay;
	
	public Patient() {
		
	}
	
	public Patient(String name, String disease, int age, int billPay) {
		super();
		this.name = name;
		this.disease = disease;
		this.age = age;
		this.billPay = billPay;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", disease=" + disease + ", age=" + age + ", billPay=" + billPay + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getdisease() {
		return disease;
	}
	public void setdisease(String disease) {
		this.disease = disease;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getBillPay() {
		return billPay;
	}
	public void setBillPay(int billPay) {
		this.billPay = billPay;
	}
	
	
}
