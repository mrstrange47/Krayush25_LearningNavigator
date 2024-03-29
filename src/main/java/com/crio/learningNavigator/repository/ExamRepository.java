package com.crio.learningNavigator.repository;

import com.crio.learningNavigator.entity.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam, Long> {
}
