package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class ToClassApplication {

	public static void main(String[] args) {
//		System.out.println("请进行签到");
		/*@Autowired
		private SignInService signInService;*/
		SpringApplication.run(ToClassApplication.class, args);
	}
}
