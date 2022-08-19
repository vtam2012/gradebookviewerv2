package com.cs5004finalprojectvtam.gradebookviewerv2.controllers;

import com.cs5004finalprojectvtam.gradebookviewerv2.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/* Controller which injects the studentRepository */
@Controller
public class StudentController {
  private final StudentRepository studentRepository;

  public StudentController(StudentRepository studentRepository) {
    this.studentRepository = studentRepository;
  }
  /* routes the http request to endpoint /students
  *  website is hosted locally at port 8080
  *  https://localhost:8080/students
  *  displays a list of all students in our H2 in memory database
  *  */
  @RequestMapping("/students")
  public String getStudents(Model model){
    model.addAttribute("student", studentRepository.findAll());
    /* utilize Thymeleaf to display the students.html file located in the resources/templates folder */
    return "students";
  }
}