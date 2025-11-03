package com.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		 System.out.println("Create and Deploy a Simple Spring boot Application \n"
		 		+ "a. Create a basic Spring boot application "
		 		+ "✅ P1 only hello controller Congratulations Application Started...");
		 
		 System.out.println(" Introduction to restful services \n"
		 		+ "a. Create restful service using sprint boot using static data. "
		 		+ "✅ P2 User Model and controller RESTful Service Started...");
		 
		  System.out.println("Intro to http methods using spring boot for restful services \n"
		  		+ "a. Define all http operations using restful services (get, put, post, delete) with static data"
		  		+ "✅ P3 Employee Model and controller RESTful HTTP Demo started...");
		  
		  System.out.println("Perform ORM integration with restful services  \n"
		  		+ "Integration of ORM Framework with restful services and database."
		  		+ "✅ P4 Student Model, Repo and controller Student ORM RESTful Service Started...");
		  
		  System.out.println("Perform CRUD Operations using Spring restful services \n"
		  		+ "A. Demonstrate CRUD operations using database. "
		  		+ "✅P5 Product Model,Service,Repo,Controller RESTful Service Started...");
		  
		  
	}

}
