package com.crio.learningNavigator.repository;

import com.crio.learningNavigator.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
