package com.streamApi.deloite;

import java.util.Arrays;
import java.util.List;

public class StudentData {

    public static List<Student> employeeData() {

        return Arrays.asList(
                new Student(1, "David", "B+", "Nagpur", 26, 60000, "Java"),
                (new Student(2, "Ramesh", "o+", "ngp", 26, 6000, "DevOps")),
                (new Student(2, "Chetan", "b+", "goa", 26, 2000, "JS")),
                (new Student(4, "Kailas", "A+", "pune", 26, 1400, "Java")));


    }
}
