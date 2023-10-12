package com.streamApi.parellelStream;

public class Student {

    private int id;
    private String studentName;
    private Integer studentScore;

    public Student(int id, String studentName, int studentScore) {
        this.id = id;
        this.studentName = studentName;
        this.studentScore = studentScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentScore='" + studentScore + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(int studentScore) {
        this.studentScore = studentScore;
    }

}
