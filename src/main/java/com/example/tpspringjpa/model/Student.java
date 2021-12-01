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
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nsc")
    private String nsc;

    @Column(name = "email")
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    private Classroom classroom;

    @ManyToMany
    private List<Club> clubs;

    public Student(String nsc, String email) {
        this.nsc = nsc;
        this.email = email;
    }

    public Student(String nsc, String email, Classroom classroom) {
        this.nsc = nsc;
        this.email = email;
        this.classroom = classroom;
    }
}
