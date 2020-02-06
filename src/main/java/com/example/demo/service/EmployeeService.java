package com.example.demo.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public interface EmployeeService {

	public HashMap<Integer, Employee> getHashmap();
	public void setHashmap(Employee employee);
	//public boolean deleteHashmap();
	public boolean deleteHashmap(int id);
	//public boolean updateHashmap(int id);
	boolean updateHashmap(Employee employee);


	

}