package com.imooc.vehicle;

public class Steamer extends Vehicle {
	String name = "轮船";
	String method = "海上运输200人";
	@Override
	public void transport() {
		System.out.println("我是："+ name);
		System.out.println("我的运输方式是："+method);
	}
}
