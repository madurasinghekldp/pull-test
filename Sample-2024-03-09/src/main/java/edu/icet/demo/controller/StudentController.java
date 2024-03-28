package edu.icet.demo.controller;

import edu.icet.demo.Student;
import edu.icet.demo.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public String getStudent(){
        StudentService service = new StudentService();
        Student student = service.getStudent();
        return "Frank";
    }
}
