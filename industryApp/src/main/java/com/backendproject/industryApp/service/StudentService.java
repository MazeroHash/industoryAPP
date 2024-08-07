package com.backendproject.industryApp.service;

import com.backendproject.industryApp.entity.Students;
import com.backendproject.industryApp.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
   private StudentRepo studentRepo;

    public Students addStudent(Students student){
        return  studentRepo.save(student);
    }

    public List<Students> getAllStudents() {
        return studentRepo.findAll();
    }

    public Students updateStudents(Students updatedStudent) {
        Optional<Students> student1=studentRepo.findById(Students.getId());
        Students student=student1.get();
        student.setAge(updatedStudent.getAge());
        student.setDept(updatedStudent.getDept());

        student.setName(updatedStudent.getName());

        return studentRepo.save(student);
    }
}
