package com.cs5004finalprojectvtam.gradebookviewerv2.controllers;

import com.cs5004finalprojectvtam.gradebookviewerv2.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
  private final StudentRepository studentRepository;

  public StudentController(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }

  @RequestMapping("/students")
  public String getStudents(Model model){
    model.addAttribute("student", studentRepository.findAll());

    return "students";
  }
}