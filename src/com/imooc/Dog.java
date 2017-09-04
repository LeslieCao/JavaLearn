package com.imooc;

public class Dog extends Animal {
	int age = 40;
	public void eat() {
		System.out.println("狗具备吃东西的能力");
	}
	
	public Dog() {
		// TODO Auto-generated constructor stub
		System.out.println("Dog的构造方法执行了。");
		age = 60;
	}

	@Override
	public String toString() {
		return "Dog [age=" + age + "]";
	}
}
