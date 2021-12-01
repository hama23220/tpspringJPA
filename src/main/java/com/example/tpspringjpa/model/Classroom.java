package com.example.tpspringjpa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Classroom")
public class Classroom {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "classroom")
    private List<Student> students;

    public Classroom(String name) {
        this.name = name;
    }
}
