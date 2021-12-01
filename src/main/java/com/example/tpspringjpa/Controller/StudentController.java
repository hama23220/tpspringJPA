package com.example.tpspringjpa.Controller;

import com.example.tpspringjpa.Services.StudentService;
import com.example.tpspringjpa.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/all")
    private Iterable<Student> getAllStudent()
    {
        return studentService.getAllStudent();
    }

    @GetMapping("/find/{id}")
    private Optional<Student> getStudentByid(@PathVariable("id") int id)
    {
        return studentService.getStudentByid(id);
    }

    @PostMapping("/add")
    private int saveStudent(@RequestBody Student student)
    {
        studentService.saveStudent(student);
        return student.getId();
    }

    @DeleteMapping("/delete/{id}")
    private void deleteStudent(@PathVariable("id") Integer id){
        studentService.deleteStudent(id);
    }
}
