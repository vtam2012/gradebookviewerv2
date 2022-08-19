package com.cs5004finalprojectvtam.gradebookviewerv2.repositories;

import com.cs5004finalprojectvtam.gradebookviewerv2.domain.Student;
import org.springframework.data.repository.CrudRepository;

/* Student Repository which extends built in CrudRepository from Spring framework
 * allows the usage of CRUD operations in Java without writing SQL
 */
public interface StudentRepository extends CrudRepository<Student, Long> {
}
