package com.github.mitictonylor.employee.EmployeeProject.repositories;

import com.github.mitictonylor.employee.EmployeeProject.modules.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
