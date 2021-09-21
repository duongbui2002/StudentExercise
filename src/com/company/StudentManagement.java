package com.company;

import java.util.ArrayList;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<Student>();

    public static boolean sameGroup(Student s1, Student s2) {
        return s2.getId() == s1.getId();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String studentsByGroup() {
        ArrayList<Boolean> check = new ArrayList<Boolean>();
        String returnString = "";
        for (int i = 0; i < this.students.size(); i++) {
            check.add(true);
        }
        for (int i = 0; i < this.students.size(); i++) {
            if (check.get(i)) {
                returnString += this.students.get(i).getGroup() + '\n';
                for (int j = i; j < this.students.size(); j++) {
                    if (this.students.get(j).getGroup().equals(this.students.get(i).getGroup())) {
                        returnString += this.students.get(j).getInfo() + '\n';
                        check.set(j, false);
                    }
                }
            }
        }
        return returnString;
    }

    public void removeStudent(String id) {
        for (int i = 0; i < this.students.size(); i++) {
            if (id.equals(this.students.get(i).getId())) {
                this.students.remove(i);
            }
        }
    }
}
