package com.imooc.abstrct;

public class Test {
	public static void main(String[] args) {
		Firgure recT = new Rectangle();
		Firgure circle = new Circle();
		recT.length = 2.4f;
		recT.width = 1.5f;
		System.out.println("长方形recT的面积是："+recT.calculateArea(recT.length, recT.width));
		circle.r = 5.0f;
		System.out.println("圆形circle的面积是："+circle.calculateArea(circle.r, circle.pi));
	}
}
