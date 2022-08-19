package com.cs5004finalprojectvtam.gradebookviewerv2.repositories;

import com.cs5004finalprojectvtam.gradebookviewerv2.domain.Assignment;
import org.springframework.data.repository.CrudRepository;

/* Assignment Repository which extends built in CrudRepository from Spring framework
 * allows the usage of CRUD operations in Java without writing SQL
 */
public interface AssignmentRepository extends CrudRepository<Assignment, Long> {
}
