package com.crio.learningNavigator.controller;

import com.crio.learningNavigator.entity.Exam;
import com.crio.learningNavigator.entity.Student;
import com.crio.learningNavigator.exception.ExamNotFoundException;
import com.crio.learningNavigator.exception.StudentNotFoundException;
import com.crio.learningNavigator.repository.ExamRepository;
import com.crio.learningNavigator.repository.StudentRepository;
import com.crio.learningNavigator.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class ExamController {
    @Autowired
    ExamService examService;

    @Autowired
    ExamRepository examRepository;

    @Autowired
    StudentRepository studentRepository;

//  Post /exam/{examId}
    @PostMapping("/{examId}")
    public ResponseEntity<Object> getUserById(@PathVariable Long examId, @RequestBody Student student){
        Exam exam = null;
        Student std = null;
        try{
            exam = examService.findById(examId);
        }
        catch (ExamNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }

        try{
            std = studentRepository.findById(student.getId())
                .orElseThrow(() -> new StudentNotFoundException("Student not found"));
        }
        catch (StudentNotFoundException e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }

        List<Student> studentList = exam.getStudentList();
        studentList.add(student);
        exam.setStudentList(studentList);
        examRepository.save(exam);
        return ResponseEntity.ok(exam);
    }
}