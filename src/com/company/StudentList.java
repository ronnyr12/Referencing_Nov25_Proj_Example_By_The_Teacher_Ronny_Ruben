package com.company;

public class StudentList {
    public final int MAX_STUDENTS = 35;
    private Student[] list;
    private int numStudents;

    public StudentList() {
        this.list = new Student[MAX_STUDENTS];
        numStudents = 0;
    }

    public void add(Student st){
        this.list[this.numStudents] = st;
        this.numStudents++;
    }
}
