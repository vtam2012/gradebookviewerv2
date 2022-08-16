package com.cs5004finalprojectvtam.gradebookviewerv2.repositories;

import com.cs5004finalprojectvtam.gradebookviewerv2.domain.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
