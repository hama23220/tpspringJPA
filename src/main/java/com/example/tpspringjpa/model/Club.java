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
@Table(name = "Club")
public class Club {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "ref")
    private String ref;

    @Column(name = "Creationdate")
    private String creationdate;

    @ManyToMany
    private List<Student> students;

    public Club(String ref, String creationdate) {
        this.ref = ref;
        this.creationdate = creationdate;
    }
}
