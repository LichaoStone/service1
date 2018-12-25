package com.allook.user.domain;

import org.springframework.stereotype.Component;

@Component
public class UserProperties {
	private String name;
	private String age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
