package org.me.learning.springmongodb2.controller;


import org.me.learning.springmongodb2.model.Student;
import org.me.learning.springmongodb2.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
//    get
    @GetMapping("/student")
    public List<Student> getStudents() {
        return studentRepo.findAll();
    }





}
