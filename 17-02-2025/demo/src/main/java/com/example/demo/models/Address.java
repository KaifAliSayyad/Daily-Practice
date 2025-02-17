package com.example.demo.models;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("address")
@Scope("prototype")
public class Address {
	
	public Address() {
		System.out.println("Address object created!!");
	}
	private String state;
	private String city;
	private int pin;
	
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pin=" + pin + "]";
	}

}
