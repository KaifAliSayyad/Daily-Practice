package com.example.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import org.springframework.beans.factory.BeanFactory;
import com.example.demo.models.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Employee;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		BeanFactory factory = SpringApplication.run(DemoApplication.class, args);
		
		System.out.println("Welcome to Spring Boot Application");
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
			System.out.print("Enter the name of the class you want to create object of : ");
			String obj = br.readLine();
			//This is IOC as now container is taking control for creating an object of Employee/Student class
			Person p1 = (Person)factory.getBean(obj);
			System.out.println(p1);
			
			Person p2 = (Person)factory.getBean(obj);
			System.out.println(p2);
			
			Person p3 = (Person)factory.getBean(obj);
			System.out.println(p3);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
