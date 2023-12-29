package com.example.springschool.config;

import com.example.springschool.model.Student;
import com.example.springschool.repository.StudentRepository;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
  @Bean
  CommandLineRunner command(StudentRepository repository) {
    return args -> {
      var students = List.of(
        new Student("Jesus", "jesusfervid94@gmail.com", LocalDate.of(1994, Month.MAY, 29)),
        new Student("Iliana", "iliana2000iliana@gmail.com", LocalDate.of(2000, Month.JANUARY, 4)),
        new Student("Alejandro", "thewinteriscoming@gmail.com", LocalDate.of(1995, Month.JUNE, 18))
      );
      repository.saveAll(students);
    };
  }
}
