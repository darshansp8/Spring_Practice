package com.demo;

public class SpringDemo1 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Hey, "+name);
	}
}
