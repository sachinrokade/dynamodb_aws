package com.example.dynamodb.repository;

import com.example.dynamodb.domain.Student;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@EnableScan
@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}
