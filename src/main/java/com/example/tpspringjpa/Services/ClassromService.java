package com.example.tpspringjpa.Services;

import com.example.tpspringjpa.Repository.ClassroomRepository;
import com.example.tpspringjpa.model.Classroom;
import com.example.tpspringjpa.model.Student;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class ClassromService {

    @Autowired
    private ClassroomRepository classroomRepository;

    public Optional<Classroom> getClassroomByid(final Integer id){
        return classroomRepository.findById(id);
    }

    public Iterable<Classroom> getAllClassroom(){
        return classroomRepository.findAll();
    }

    public void deleteClassroom (final Integer id){
        classroomRepository.deleteById(id);
    }

    public Classroom saveClassroom (Classroom classroom){
        classroomRepository.save(classroom);
        return classroom;
    }

    public void update (Classroom classroom, Integer id){
        classroomRepository.save(classroom);
    }
}
