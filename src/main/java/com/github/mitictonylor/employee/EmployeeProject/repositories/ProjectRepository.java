package com.github.mitictonylor.employee.EmployeeProject.repositories;

import com.github.mitictonylor.employee.EmployeeProject.modules.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
