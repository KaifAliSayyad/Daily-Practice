package com.example.demo.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("student")
@Lazy
@Scope("prototype")
public class Student implements Person{
	
	@Value("${rno}")
	private int rollNo;
	
	@Value("${sname}")
	private String name;
	
	@Value("${std}")
	private int standard;
	
	
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", standard=" + standard + "]";
	}
	
	
}
