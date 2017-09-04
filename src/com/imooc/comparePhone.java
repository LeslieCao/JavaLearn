package com.imooc;

public class comparePhone {
	public static void main(String[] args) {
		Telephone iphone_1 = new Telephone();
		iphone_1.mem = 2.0f;
		iphone_1.storage=8.0f;
		Telephone iphone_2 = new Telephone();
		iphone_2.mem = 2.0f;
		iphone_2.storage = 8.0f;
		if(iphone_1.equals(iphone_2)) {
			System.out.println("两个手机是一样的");
		}
		else {
			System.out.println("两个手机是不一样的");
		}
	}
}
