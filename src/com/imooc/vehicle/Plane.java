package com.imooc.vehicle;

public class Plane extends Vehicle {
	String name = "飞机";
	String method = "空中运输xxx人";
	@Override
	public void transport() {
		System.out.println("我是："+ name);
		System.out.println("我的运输方式是："+method);
	}
}
