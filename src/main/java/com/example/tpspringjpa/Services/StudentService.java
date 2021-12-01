package com.example.tpspringjpa.Services;

import com.example.tpspringjpa.Repository.StudentRepository;
import com.example.tpspringjpa.model.Student;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Optional<Student> getStudentByid(final Integer id){
        return studentRepository.findById(id);
    }

    public Iterable<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    public void deleteStudent (final Integer id){
        studentRepository.deleteById(id);
    }

    public Student saveStudent (Student student){
        studentRepository.save(student);
        return student;
    }

    public void update (Student student, Integer id){
        studentRepository.save(student);
    }
}
