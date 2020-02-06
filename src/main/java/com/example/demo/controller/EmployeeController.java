package com.example.demo.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;



@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeservice;
	
	@RequestMapping(value="/getdata", method = RequestMethod.GET)
	public HashMap<Integer,Employee> getDataOfEmployees()
	{
		System.out.println("fetching getAPI.......");
		return employeeservice.getHashmap();		
	}
	
	
	@RequestMapping(value= "/setdata", method = RequestMethod.POST)
	public String setEmployeeData(@RequestBody Employee employee)
	{
		System.out.println(employee);

		employeeservice.setHashmap(employee);
		return "employee added";
	}
	

	@RequestMapping(value= "/deletedata", method = RequestMethod.DELETE)
	public String deleteEmployeeData(@RequestParam int id)
	{
		boolean result=employeeservice.deleteHashmap(id);
		if(result)
		{
			return "employee has been deleted";
		}
		return "employee does not exist";
	}
	
	@RequestMapping(value= "/updatedata", method = RequestMethod.PUT)
	public String updateEmployeeData(@RequestBody Employee employee)
	{
		boolean result=employeeservice.updateHashmap(employee);
		if(result)
		{
			return "employee has been updated";
		}
		return "employee does not exist";
		
	}
	
	


	
}

