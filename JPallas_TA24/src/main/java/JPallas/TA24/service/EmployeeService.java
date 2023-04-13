package JPallas.TA24.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JPallas.TA24.dao.EmployeeDAO;
import JPallas.TA24.dto.Employee;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	EmployeeDAO employeeDao;
	
	@Override
	public List<Employee> listEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeDao.findById(id).get();
	}

	@Override
	public List<Employee> listEmployeesByWork(String work) {
		return employeeDao.findEmployeesByWork(work);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDao.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeDao.deleteById(id);		
	}

}
