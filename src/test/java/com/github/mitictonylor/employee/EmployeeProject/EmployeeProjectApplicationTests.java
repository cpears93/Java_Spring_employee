package com.github.mitictonylor.employee.EmployeeProject;

import com.github.mitictonylor.employee.EmployeeProject.modules.Department;
import com.github.mitictonylor.employee.EmployeeProject.modules.Employee;
import com.github.mitictonylor.employee.EmployeeProject.modules.Project;
import com.github.mitictonylor.employee.EmployeeProject.repositories.DepartmentRepository;
import com.github.mitictonylor.employee.EmployeeProject.repositories.EmployeeRepository;
import com.github.mitictonylor.employee.EmployeeProject.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeProjectApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private ProjectRepository projectRepository;

	@Test
	void canCreateAndSaveAnEmployeeWithADepartmentAndAProject() {
		Department department = new Department("Tech");
		departmentRepository.save(department);
		Project project = new Project("ManyToMany",1);
		projectRepository.save(project);
		Employee employee = new Employee("Christopher", "Pearson",1,department);
		Employee employee1 = new Employee("Antonio", "Lorusso",2, department);
		Employee employee2 = new Employee("William", "Neeson",3, department);
		employee.addProject(project);
		employee1.addProject(project);
		employee2.addProject(project);
		employeeRepository.save(employee);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
	}
}
