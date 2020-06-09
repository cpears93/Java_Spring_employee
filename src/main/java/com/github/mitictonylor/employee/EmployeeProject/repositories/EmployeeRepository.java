package com.github.mitictonylor.employee.EmployeeProject.repositories;

import com.github.mitictonylor.employee.EmployeeProject.modules.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
