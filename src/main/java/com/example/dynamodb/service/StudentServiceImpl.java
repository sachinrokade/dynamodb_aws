package com.example.dynamodb.service;

import com.example.dynamodb.exception.DataNotFoundException;
import com.example.dynamodb.repository.StudentRepository;
import com.example.dynamodb.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired(required=true)
    private  StudentRepository repository;


    @Override
    public Student create(Student student) {

        return repository.save(student);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Student update(Student student, String id) {

        Optional<Student> studentOptional = repository.findById(id);
        if (studentOptional.isPresent()) {
            studentOptional.get().setFirstName(student.getFirstName());
            studentOptional.get().setLastName(student.getLastName());

            return repository.save(studentOptional.get());
        }
        throw new DataNotFoundException("Employee Id not found");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Optional<Student> getById(String id) {
        return repository.findById(id);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Student> getAll() {
        return (List<Student>) repository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void delete(String id) {
      Student s=  repository.findById(id).orElseThrow(()->new DataNotFoundException("Recode no found"));
      repository.deleteById(s.getId());
    }
}