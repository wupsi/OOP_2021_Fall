package com.oopsourse.week3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student("KazBritTU", 3.78f, 3);
        Student.showTotalNumberOfStudents();
        s2.getId();
    }

}

class Student{
    static String university = "KBTU";
    private static int total;
    int id;
    float gpa;
    int course;

    Student(String u, float g, int c){
        total++;
        university = u;
        gpa = g;
        course = c;
        generateID();
    }
    Student(){
        total++;
        generateID();
    }

    void showGPA(){
        System.out.println(gpa);
    }

    void showUniversity(){
        System.out.println(university);
    }

    void showCourse(){
        System.out.println(course);
    }

    public static void showTotalNumberOfStudents(){
        System.out.println(total);
    }
    void generateID(){
        this.id = 100 * total + 10 * (total - 1) + total * (total - 1);
    }
    public void getId(){
        System.out.println(this.id);
    }

    // TASK-1: Add at least one more instance data field;

    // TASK-2: Add at least one more instance method;

    // TASK-3: Create a method showTotalNumberOfStudents();

    // TASK-4: Generate IDs automatically.
}