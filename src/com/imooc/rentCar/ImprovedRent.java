package com.imooc.rentCar;

import java.util.Scanner;
/**
 * @author lesliecao
 * 本系统为答答租车系统
 */
public class ImprovedRent {
	public static void main(String[] args) {
		int totalPrice = 0;
		int totalPerson = 0;
		int totalGoods = 0;
		Car cars[] = {new Car(4, 500, 0, "奥迪A4", true, false), new Car(4, 400, 0, "马自达6", true, false), 
				new Car(4, 450, 2, "皮卡雪6", true, true),new Car(20, 800, 0, "金龙", true, false),
				new Car(0, 400, 4, "松花江", false, true), new Car(0, 1000, 20, "依维柯", false, true)};
		try {
			Scanner input = new Scanner(System.in);
			System.out.println("欢迎使用答答租车系统： \n您是否需要租车： 1 是 0 否");
			int number = input.nextInt();
			if(number != 1) {
				System.out.println("欢迎下次光临！！！");
			}else {
				System.out.println("您可租车的类型及其价目表：");
				System.out.println("序号  汽车名称                租金                容量");
				System.out.println("1.  奥迪A4        "+cars[0].price+"元/天       载人："+cars[0].person+"人");
				System.out.println("2.  马自达6       "+cars[1].price+"元/天         载人："+cars[1].person+"人");
				System.out.println("3.  皮卡雪6       "+cars[2].price+"元/天         载人："+cars[2].person+"人  载货："+cars[2].goodsNum+"吨");
				System.out.println("4.  金龙                      "+cars[3].price+"元/天        载人："+cars[3].person+"人");
				System.out.println("5.  松花江                  "+cars[4].price+"元/天        载货："+cars[4].goodsNum+"吨");
				System.out.println("6.  依维柯                  "+cars[5].price+"元/天        容载："+cars[5].goodsNum+"吨");
			}
			System.out.println("请输入您要租汽车的数量：");
			int carNum = input.nextInt();
			Car rentCar[] = new Car[carNum];
			for(int i=0;i<rentCar.length;i++) {
				int sequence = i+1;
				System.out.println("请输入第"+sequence+"辆车的需要");
				int carNumber = input.nextInt();
				totalPrice+=cars[carNumber-1].price;
				totalGoods+=cars[carNumber-1].goodsNum;
				totalPerson+=cars[carNumber-1].person;
				rentCar[i] = cars[carNumber-1];
			}
			System.out.println("请输入租车天数：");
			int rentDay = input.nextInt();
			int allPrice = totalPrice * rentDay;
			System.out.println("您的账单：");
			System.out.println("***可载人的车有：");
			for(int i=0;i<carNum;i++) {
				if(rentCar[i].passenger) {
					System.out.println(rentCar[i].name);
				}
			}
			System.out.println("共载人："+totalPerson);
			System.out.println("***可载货的车有：");
			for(int i=0;i<carNum;i++) {
				if(rentCar[i].goods)
					System.out.println(rentCar[i].name);
			}
			System.out.println("共载货："+totalGoods);
			System.out.println("***租车总价格为："+allPrice);
		} catch (Exception e) {
			System.out.println("您输入的信息不正确！！请重新开始");
		}
	}
}
