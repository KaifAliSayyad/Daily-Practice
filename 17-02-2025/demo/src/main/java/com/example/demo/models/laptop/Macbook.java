package com.example.demo.models.laptop;

import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;


@Component("mac")
@Priority(value = 1)
public class Macbook implements Laptop{
	
	@Override
	public String toString() {
		System.out.println("Macbook laptop has been created!");
		return "";
	}
}
