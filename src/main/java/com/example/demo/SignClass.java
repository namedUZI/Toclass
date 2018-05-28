package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SignClass {
	@Autowired
	private SignInService signInService;
	@Bean
	public String qianDao() {
		List<String> list =new ArrayList<>();
		list.add("李强");
		list.add("李红");
		list.add("李紅");
		Scanner scanner=new Scanner(System.in);
		int choose;
		List<String> people =new ArrayList();
		while(true) {
			System.out.println("1.签到");
			System.out.println("2.查询");
			System.out.println("3.统计");
			System.out.println("请输入要执行的操作：");
			choose=scanner.nextInt();
			scanner.nextLine();
			while(choose==1) {
				System.out.println("签到姓名：");
				String name=scanner.nextLine();
				signInService.signIn(name, list, people);
				System.out.println("输入n结束");
				String nString=scanner.nextLine();
				if(nString.equals("n")) {
					break;
				}
			}
			while(choose==2) {
				System.out.println("请输入要查询的学生姓名：");
				String name1 = scanner.next();
				signInService.search(name1,people,list);
				System.out.println("输入n退出查询");
				String what = scanner.next();
				if (what.equals("n")) {
					break;
				}
			}
			if(choose==3) {
				int i=signInService.count(people);
				System.out.println("已签到人数："+i);
			}
		}		
	}
}
