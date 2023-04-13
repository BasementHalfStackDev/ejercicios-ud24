package JPallas.TA24.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	public enum Work {
		PROGRAMMER(2500), TESTER(1500), ADMINISTRATOR(1800);

		private int salary;

		Work(int salary) {
			this.salary = salary;
		}

		public int getSalary() {
			return salary;
		}
	}

	// Work enum
	private Work work;
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "work")
	private String workname;
	@Column(name = "salary")
	private int salary;

	// Constructors
	public Employee() {

	}

	public Employee(Long id, String name, Work work) {
		super();
		this.id = id;
		this.name = name;
		this.work = work;
		this.workname = work.name();
		this.salary = work.getSalary();
	}

	// Getters
	public Work getWork() {
		return work;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getWorkname() {
		return workname;
	}

	public int getSalary() {
		return salary;
	}

	// Setters
	public void setWork(Work work) {
		this.work = work;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWorkname(String workname) {
		this.workname = workname;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
