package com.imooc.rentCar;

public class Car {
	int person = 0;
	int price = 0;
	int goodsNum = 0;
	String name = "";
	boolean passenger = false;
	boolean goods = false;
	public Car(int person, int price, int goodsNum, String name, boolean passenger, boolean goods) {
		this.person = person;
		this.price = price;
		this.goodsNum = goodsNum;
		this.name = name;
		this.passenger = passenger;
		this.goods = goods;
	}
}
