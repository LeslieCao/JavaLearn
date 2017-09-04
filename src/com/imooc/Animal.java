package com.imooc;

public class Animal {
	int age=10;
	String name="";
	public void eat() {
		System.out.println("动物具备吃东西的能力");
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
		System.out.println("Animal的构造方法执行了。");
		age = 20;
	}
}
