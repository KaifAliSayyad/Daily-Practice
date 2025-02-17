package com.example.demo.models.laptop;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;

@Component("lenovo")
//@Primary()			//This annotation is used to resolve which class's object should be created when creating a component of an interface using container. As here there are multiple implementations of Laptop interfaces
@Priority(value = 2)
public class LenovoLaptop implements Laptop{
	
	@Override
	public String toString() {
		System.out.println("Lenovo laptop has been created!!");
		return "";
	}
}
