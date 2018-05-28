package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SignInService {
	public String signIn(String name,List<String> list ,List<String> user) {
		if(name!=null) {
			boolean t =list.contains(name);
			if(t) {
				boolean t1=list.contains(user);
				if(t1) {
					System.out.println("你已签到");
				}else {
					user.add(name);
					System.out.println("签到成功");
				}
			}else {
				System.out.println("签到失败");
			}
		}
		return name;
	}
	public String search(String name,List<String> list ,List<String> user) {
		if(name!=null) {
			boolean flag=list.contains(name);
			if(flag) {
				boolean b=user.contains(name);
				if(b) {
					System.out.println(name+"已签到!");
				}else {
					System.out.println("未签到");
				}
			}else {
				System.out.println("查詢失敗");
			}
		}
		
		return name;
	}
	public int count (List<String> user) {
		return user.size();
	}
}
