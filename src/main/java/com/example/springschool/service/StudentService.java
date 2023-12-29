package com.example.springschool.service;

import com.example.springschool.model.Student;
import com.example.springschool.repository.StudentRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

  private final StudentRepository studentRepository;

  public List<Student> getStudents() {
    return studentRepository.findAll();
  }
}
