package JPallas.TA24.dto;

import JPallas.TA24.dto.Employee.Work;

public class test {

	public static void main(String[] args) {

		Long id = 1L;
		String nombre = "Gumersindo";
		
		String worktype ="PROGRAMMER";
		
		Work work = checkWork(worktype);

		
		
		Employee e1 = new Employee(id, nombre, work);
		
		System.out.println(e1.toString());
		
	}
	
	public static Work checkWork(String worktype) {
		worktype = worktype.toUpperCase();
		if(worktype.equals("PROGRAMMER")) {
			return Work.PROGRAMMER;
		}
		return null;
	}

}
