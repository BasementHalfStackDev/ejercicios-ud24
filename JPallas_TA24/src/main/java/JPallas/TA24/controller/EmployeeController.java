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

	@GetMapping("/employees/work/{workname}")
	public List<Employee> listEmployeesByWork(@PathVariable(name = "workname") String workname) {
		return employeeService.listEmployeesByWork(workname);
	}

	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		Employee newEmployee = new Employee(employee.getId(), employee.getName(), employee.getWork());
		return employeeService.saveEmployee(newEmployee);
	}

	@GetMapping("/employees/{id}")
	public Employee employeeByID(@PathVariable(name = "id") Long id) {

		Employee employeebyId = new Employee();

		employeebyId = employeeService.getEmployeeById(id);

		return employeebyId;

	}

	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable(name = "id") Long id, @RequestBody Employee employee) {
		Employee selectedEmployee = new Employee(id, employee.getName(), employee.getWork());
		Employee updatedEmployee = new Employee();

		updatedEmployee = employeeService.updateEmployee(selectedEmployee);

		return updatedEmployee;

	}

	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable(name = "id") Long id) {
		employeeService.deleteEmployee(id);
	}

}
