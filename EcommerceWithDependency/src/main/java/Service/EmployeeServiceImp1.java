package Service;
import Model.Employee;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import Model.Employee;
@Service
public class EmployeeServiceImp1 implements EmployeeService {
	private Set<Employee> employees=new HashSet<Employee>();
	
	@Override
	public void add(Employee employee) {
		employees.add(employee);
	}
	@Override
	public Set<Employee> employees(){
		return employees;
	}
}
