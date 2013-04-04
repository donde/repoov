package ma.moov.core.domaine;

import java.util.ArrayList;
import java.util.List;

public class Site {
	private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public void addEmployee(Employee employee){
		if(employees == null){
			employees = new ArrayList<Employee>();
		}
		employees.add(employee);
	}
}
