package com.example.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.example.demo.models.laptop.Laptop;

@Component("emp")
//@Component("singleton")							//This is default
@Scope("prototype")
public class Employee implements Person{
	
	public Employee() {
		System.out.println("Employee object created!!");
	}
	
	@Value("Rajesh")
	private String name;
	
	@Value("25")
	private int age;
	
	@Value("30000")
	private float salary;
	
	@Value("TESTER")
	private String designation;
	
	@Autowired
	private Address address;
	
	@Autowired
	private Laptop laptop;
	
	
	@Override
	public String toString() {
		System.out.println("Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", designation=" + designation + ", address= "+address+ ", laptop = "+laptop+"]");
		return "";
	}
	
	
}
