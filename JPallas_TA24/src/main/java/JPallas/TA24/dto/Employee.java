package JPallas.TA24.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "employee")
public class Employee {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "work")
	private String work;
	@Column(name = "salary")
	private double salary;

	// Constructors
	public Employee() {

	}

	public Employee(Long id, String name, String work) {
		super();
		this.id = id;
		this.name = name;
		this.work = work;
		this.salary = getSalaryxWork(work);
	}

	// Getters
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getWork() {
		return work;
	}

	public double getSalary() {
		return salary;
	}

	// Setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Enum for worktypes and salaries
	public enum Work {
		PROGRAMMER(2000.00), TESTER(1500.00), ADMINISTRATOR(1800.00);

		// Salary attribute
		private double salary;

		// Adds constructor with salary
		Work(double salary) {
			this.salary = salary;
		}

		public double getSalary() {
			return this.salary;
		}
	}

	// Get salary by Work
	public double getSalaryxWork(String work) {
		Work[] available_Works = Work.values();

		for (Work works : available_Works) {
			if (works.name().equalsIgnoreCase(work)) {
				return works.getSalary();
			}
		}
		return 0;
	}
}
