package com.example.springschool.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.time.LocalDate;
import java.time.Period;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {
  @Id
  @SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
  private Long id;

  private String name;
  private String email;
  private LocalDate dateOfBirth;

  @Transient
  @Getter(AccessLevel.NONE)
  private Integer age;

  public Student(String name, String email, LocalDate dateOfBirth) {
    this.name = name;
    this.email = email;
    this.dateOfBirth = dateOfBirth;
  }

  public Integer getAge() {
    return Period.between(this.dateOfBirth, LocalDate.now()).getYears();
  }
}
