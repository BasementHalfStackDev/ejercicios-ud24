package JPallas.TA24.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import JPallas.TA24.service.EmployeeService;
import JPallas.TA24.dto.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> listEmployees() {
		return employeeService.listEmployees();
	}

	@GetMapping("/employees/work/{work}")
	public List<Employee> listEmployeesByWork(@PathVariable(name = "work") String work) {
		return employeeService.listEmployeesByWork(work);
	}

	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	@GetMapping("/employees/{id}")
	public Employee employeeByID(@PathVariable(name = "id") Long id) {

		Employee employeebyId = new Employee();

		employeebyId = employeeService.getEmployeeById(id);

		return employeebyId;

	}

	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable(name = "id") Long id, @RequestBody Employee employee) {
		Employee selectedEmployee = new Employee();
		Employee updatedEmployee = new Employee();

		selectedEmployee = employeeService.getEmployeeById(id);
		selectedEmployee.setName(employee.getName());
		selectedEmployee.setWork(employee.getWork());

		updatedEmployee = employeeService.updateEmployee(selectedEmployee);

		return updatedEmployee;

	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable(name = "id") Long id) {
		employeeService.deleteEmployee(id);
	}

}
