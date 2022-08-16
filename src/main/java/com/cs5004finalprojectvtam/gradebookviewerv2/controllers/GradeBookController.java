package com.cs5004finalprojectvtam.gradebookviewerv2.controllers;

import com.cs5004finalprojectvtam.gradebookviewerv2.repositories.AssignmentRepository;
import com.cs5004finalprojectvtam.gradebookviewerv2.repositories.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GradeBookController {

  private final StudentRepository studentRepository;
  private final AssignmentRepository assignmentRepository;

  public GradeBookController(StudentRepository studentRepository, AssignmentRepository assignmentRepository) {
    this.studentRepository = studentRepository;
    this.assignmentRepository = assignmentRepository;
  }

  @RequestMapping("/gradebook")
  public String getGrades(Model model){
    model.addAttribute("student", studentRepository.findAll());
    model.addAttribute("assignment", assignmentRepository.findAll());

    return "gradebook";
  }

}
