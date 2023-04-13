package JPallas.TA24.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import JPallas.TA24.dto.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {
	
	public List<Employee> findEmployeesByWork(String work);

}
