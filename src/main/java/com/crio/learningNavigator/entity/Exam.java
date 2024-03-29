package com.crio.learningNavigator.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "exam_table")
public class Exam  {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "subject_id")
    private Long subject_id;

    @ManyToMany(mappedBy = "examList", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<Student> studentList = new ArrayList<>();
}
