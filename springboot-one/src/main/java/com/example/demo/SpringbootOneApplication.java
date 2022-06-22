package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.bean.Student;

@SpringBootApplication
public class SpringbootOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOneApplication.class, args);
		
		System.out.println("welcome to Spring-Boot App");
	}

}
