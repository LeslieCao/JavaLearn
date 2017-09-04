package com.imooc.vehicle;

public class Car extends Vehicle {
	String name = "公共汽车";
	String method = "陆地载客 40 人";
	@Override
	public void transport() {
		System.out.println("我是："+ name);
		System.out.println("我的运输方式是："+method);
	}
}
