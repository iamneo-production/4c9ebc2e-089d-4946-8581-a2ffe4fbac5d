package com.example.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringappApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringappApplication.class, args);
	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    Calculator obj =(Casio) context.getBean("casioobjref");
    int sum=obj.add();
    int diff=obj.sub();
    System.out.println(sum);
    System.out.println(diff);
		
	}

}
