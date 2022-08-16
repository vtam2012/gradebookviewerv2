package com.cs5004finalprojectvtam.gradebookviewerv2.bootstrap;

import com.cs5004finalprojectvtam.gradebookviewerv2.domain.Assignment;
import com.cs5004finalprojectvtam.gradebookviewerv2.domain.Student;
import com.cs5004finalprojectvtam.gradebookviewerv2.repositories.AssignmentRepository;
import com.cs5004finalprojectvtam.gradebookviewerv2.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
  private final StudentRepository studentRepository;
  private final AssignmentRepository assignmentRepository;

  public BootStrapData(StudentRepository studentRepository, AssignmentRepository assignmentRepository) {
    this.studentRepository = studentRepository;
    this.assignmentRepository = assignmentRepository;
  }

  @Override
  public void run(String... args) throws Exception {
      System.out.println("Started in Bootstrap");

      Student vincent = new Student("Vincent", "Tam");
      Assignment homework1VT = new com.cs5004finalprojectvtam.gradebookviewerv2.domain.Assignment("homework1", 90, "A-", vincent);
      vincent.getAssignments().add(homework1VT);

      studentRepository.save(vincent);
      assignmentRepository.save(homework1VT);

      Student mark = new Student("Mark", "Miller");
      Assignment homework1MM = new com.cs5004finalprojectvtam.gradebookviewerv2.domain.Assignment("homework1", 98, "A+", mark);
      mark.getAssignments().add(homework1MM);

      studentRepository.save(mark);
      assignmentRepository.save(homework1MM);

      System.out.println("Number of Assignments: " + assignmentRepository.count());
  }
}
