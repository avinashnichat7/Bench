package com.streamApi.deloite;

public class Student {
    private int id;
    private String name;
    private String bloodGroup;
    private String city;
    private int age;
    private int salary;
    private String dept;

    public Student(int id, String name, String bloodGroup, String city, int age, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.city = city;
        this.age = age;
        this.salary = salary;
    }

    public Student(int id, String name, String bloodGroup, String city, int age, int salary, String dept) {
        super();
        this.id = id;
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.city = city;
        this.age = age;
        this.salary = salary;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", bloodGroup=" + bloodGroup + ", city=" + city + ", age=" + age + ", salary=" + salary + "]";
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }


}
