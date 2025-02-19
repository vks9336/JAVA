package com.OOPS_in_JAVA.Generics.Comparable;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int rollNo, float marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff;
        diff = (int)(this.marks - o.marks);
        return diff;
    }

    @Override
    public String toString() {
        return "[" + rollNo + ", " + marks + ']';
    }
}
