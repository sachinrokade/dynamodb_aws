package com.example.dynamodb.service;


import com.example.dynamodb.domain.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {


    Student create(Student employee);

    Student update(Student employee, String id);

    Optional<Student> getById(String id);

    List<Student> getAll();

    void delete(String id);

}