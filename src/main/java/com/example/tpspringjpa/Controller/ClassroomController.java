package com.example.tpspringjpa.Controller;

import com.example.tpspringjpa.Services.ClassromService;
import com.example.tpspringjpa.model.Classroom;
import com.example.tpspringjpa.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="/classroom")
public class ClassroomController {

    @Autowired
    private ClassromService classromService;

    @GetMapping("/all")
    private Iterable<Classroom> getAllClassroom()
    {
        return classromService.getAllClassroom();
    }

    @GetMapping("/find/{id}")
    private Optional<Classroom> getClassroomByid(@PathVariable("id") int id)
    {
        return classromService.getClassroomByid(id);
    }

    @PostMapping("/add")
    private int saveClassroom(@RequestBody Classroom classroom)
    {
        classromService.saveClassroom(classroom);
        return classroom.getId();
    }

    @DeleteMapping("/delete/{id}")
    private void deleteClassroom(@PathVariable("id") Integer id){
        classromService.deleteClassroom(id);
    }

}
