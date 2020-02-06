package com.example.demo.serviceIMPL;

import java.util.HashMap;

import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@Component
public class EmployeeServiceIMPL implements EmployeeService {

	private HashMap<Integer, Employee> myEmployees;

	public HashMap<Integer, Employee> getHashmap() {
		return myEmployees;
	}

	@Override
	public void setHashmap(Employee employee) {
				if (myEmployees == null) {
					myEmployees = new HashMap<Integer, Employee>();
				}
				myEmployees.put(employee.getId(), employee);
	}
	

	@Override
	public boolean deleteHashmap(int id) {
		if (myEmployees.containsKey(id)) {
			myEmployees.remove(id);
			return true;
		}
		return false;

	}
	

	@Override
	public boolean updateHashmap(Employee employee) {
		if (myEmployees.containsKey(employee.getId())) {
			myEmployees.put(employee.getId(), employee);
			return true;
		}
		return false;
	}


	

	



	
}
