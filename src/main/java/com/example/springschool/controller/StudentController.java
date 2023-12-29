package com.example.springschool.controller;

import com.example.springschool.model.Student;
import com.example.springschool.service.StudentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "api/v1/student")
public class StudentController {

  private final StudentService studentService;

  @GetMapping(path = "all")
  public List<Student> getStudents() {
    return studentService.getStudents();
  }
}
