package com.example.tpspringjpa.Repository;

import com.example.tpspringjpa.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {
}
