package com.example.demo.models.laptop;

import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;

@Component("dell")
@Priority(value =3)
public class DellLaptop implements Laptop{
	
	@Override
	public String toString() {
		System.out.println("Dell Laptop has been created");
		return "";
	}
}
