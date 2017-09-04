package com.imooc;

public class Initial {
	
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println("Age是："+animal.age);
		
		Dog black = new Dog();
		System.out.println("狗的初始年龄："+black.age);
		black.age = 2;
		black.name = "littleblack";
		black.eat();
		
		System.out.println(black);
	}
	
}
