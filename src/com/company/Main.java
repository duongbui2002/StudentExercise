package com.company;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Duong","20020193","K65CD","20020193@vnu.edu.vn");
        Student s2 = new Student("Hoang","20020183","K65CD","20020293@vnu.edu.vn");
        Student s3 = new Student("Long","20020093","K65CB","20020194@vnu.edu.vn");
        Student s4 = new Student("Tam","20020193","K65CB","20020193@vnu.edu.vn");
        Student s5 = new Student("Lien","20020193","K65CD","20020193@vnu.edu.vn");
        StudentManagement listStudent = new StudentManagement();
        listStudent.addStudent(s1);
        listStudent.addStudent(s2);
        listStudent.addStudent(s3);
        listStudent.addStudent(s4);
        listStudent.addStudent(s5);
        System.out.println(listStudent.studentsByGroup());
        listStudent.removeStudent("20020183");
        System.out.println("----------------------");
        System.out.println(listStudent.studentsByGroup());

    }
}
