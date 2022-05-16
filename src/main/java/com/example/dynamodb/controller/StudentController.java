package com.example.dynamodb.controller;


import com.example.dynamodb.domain.Student;
import com.example.dynamodb.exception.DataNotFoundException;
import com.example.dynamodb.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private  StudentServiceImpl studentService;


    @GetMapping("/")
    public List<Student> all() {
        studentService.create(new Student("101","1ABC","PQR"));
        studentService.create(new Student("102","2ABC","PQR"));
        studentService.create(new Student("103","3ABC","PQR"));
        return studentService.getAll();

    }

    @PostMapping("/add")
    public Student save(@RequestBody Student student) {
        return studentService.create(student);
    }

    @PutMapping(value = "/update/{id}")
    public Student update(@PathVariable("id") String id, @RequestBody Student student) {
        return studentService.update(student, id);
    }

    @GetMapping("/getById/{id}")
    public Student getStudentById(@PathVariable(value = "id") String id) {
        return studentService.getById(id).orElseThrow(() -> new DataNotFoundException("not found"));
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable(value = "id") String id) {

        studentService.delete(id);
    }

}
