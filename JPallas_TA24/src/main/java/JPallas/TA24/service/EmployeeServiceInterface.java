package JPallas.TA24.service;

import java.util.List;

import JPallas.TA24.dto.Employee;
public interface EmployeeServiceInterface {
	
	public List<Employee> listEmployees();
	
	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(Long id);
	
	public List<Employee> listEmployeesByWork(String work);
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(Long id);

}
