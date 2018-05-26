package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;

@RestController
public class EmployeeProvider {

	@GetMapping("/show")
	public String show() {
		return "hello";
	}
	@GetMapping("/showOb")
	public Employee showData() {
		Employee emp=new Employee();
		emp.setEmpId(100);
		emp.setEmpName("santosh");
		emp.setEmpSal(2.2);
		return emp;
	}
	
	@GetMapping("/showAll")
	public List<Employee> showList(){
		List<Employee> list=Arrays.asList(
				new Employee(10,"santosh",3.3),
				new Employee(20,"vishal",4.3),
				new Employee(30,"dinesh",5.3),
				new Employee(40,"suresh",6.3),
				new Employee(50,"ramesh",7.3)
				);
		return list;
	}
	
}
