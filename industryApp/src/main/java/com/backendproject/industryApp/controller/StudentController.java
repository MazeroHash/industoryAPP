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
    @CrossOrigin(origins = "http://localhost:3000")
    public Students addStudents(@RequestBody Students students){
        return studentService.addStudent(students);



    }


    @GetMapping("/getStudents")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Students> getAllStudents(){
        return studentService.getAllStudents();

    }

    @PostMapping("/updateStudents")
    @CrossOrigin(origins = "http://localhost:3000")
    public Students updateStudents(@RequestBody Students students){
        return studentService.updateStudents(students);
    }


    @GetMapping("/deleteStudent/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public  Boolean deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }
}
