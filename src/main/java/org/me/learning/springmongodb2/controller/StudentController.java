package org.me.learning.springmongodb2.controller;


import org.me.learning.springmongodb2.model.Student;
import org.me.learning.springmongodb2.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentbyId(@PathVariable String id) {

        Student student1 = studentRepo.findById(id).orElse(null);
        if (student1 != null) {
            return new  ResponseEntity(student1 , HttpStatus.OK);
        }
        else
            return new  ResponseEntity (HttpStatus.NOT_FOUND);

    }


    //    post
    @PostMapping("/student")
    public ResponseEntity<?>  addStudent(@RequestBody Student student) {
//        try {
//            Student student1 = studentRepo.save(student);
//            return new  ResponseEntity(student , HttpStatus.CREATED);
//        }
//         catch (Exception e) {
//             return new  ResponseEntity( e.getMessage() , HttpStatus.BAD_REQUEST);
//        }
//
        Optional student1 =studentRepo.findByEmail(student.getEmail());
        if (student1.isPresent()) {
            return new ResponseEntity(student.getEmail()+ " email already exist " , HttpStatus.CONFLICT);
        }
        else {
            return new ResponseEntity( studentRepo.save(student) , HttpStatus.CREATED);
        }

    }





}
