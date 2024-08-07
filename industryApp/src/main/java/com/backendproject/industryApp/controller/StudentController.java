package com.backendproject.industryApp.controller;

import com.backendproject.industryApp.entity.Students;
import com.backendproject.industryApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudents")
    public Students addStudents(@RequestBody Students students){
        return studentService.addStudent(students);



    }


    @GetMapping("/getStudents")
    public List<Students> getAllStudents(){
        return studentService.getAllStudents();

    }

    @PostMapping("/updateStudents")
    public Students updateStudents(@RequestBody Students students){
        return studentService.updateStudents(students);
    }
}
