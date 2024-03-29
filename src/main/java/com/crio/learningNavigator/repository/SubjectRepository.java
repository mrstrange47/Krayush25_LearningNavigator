package com.crio.learningNavigator.repository;

import com.crio.learningNavigator.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
