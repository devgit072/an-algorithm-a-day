package com.devrajs.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>{

    int age;
    String name;

    public int compareTo(Student student)
    {
        return this.age - student.age;
    }

    public static void main(String[] args) {
        Student student1=null;
        Student student2=null;
        Collections.sort(Arrays.asList(student1,student2));
        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age - o2.age;
            }
        };
        Collections.sort(Arrays.asList(student1,student2), studentComparator);
    }
}
