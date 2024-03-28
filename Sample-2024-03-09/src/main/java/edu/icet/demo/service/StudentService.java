package edu.icet.demo.service;

import edu.icet.demo.Student;

public class StudentService {

    public Student getStudent() {
        Student std = new Student();
        std.setName("Frank");
        std.setAge("30");

        Student std2 = new Student("Frank","30");
        return std;
    }
}
