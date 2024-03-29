package com.crio.learningNavigator.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subject_table")
public class Subject {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "subjectList", fetch = FetchType.LAZY)
    @JsonBackReference
    List<Student> studentList = new ArrayList<>();
}
