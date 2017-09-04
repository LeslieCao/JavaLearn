package com.imooc.rentCar;

import java.io.IOException;
import java.util.Scanner;

public class Rent {
	@SuppressWarnings("null")
	public static void main(String[] args) throws IOException {
		int totalPrice = 0;
		int totalPerson = 0;
		int totalGoods = 0;
		AudiA4 audiA4 = new AudiA4();
		Mazda6 mazda = new Mazda6();
		PickupTruckCitroen6 citroen6 = new PickupTruckCitroen6();
		GoldenDragonBus goldenDragon = new GoldenDragonBus();
		SongHuaJiangTruck songhuajiang = new SongHuaJiangTruck();
		IvecoTruck iveco = new IvecoTruck();
		Scanner input = new Scanner(System.in);
		System.out.println("欢迎使用答答租车系统： \n您是否需要租车： 1 是 0 否");
		int number = input.nextInt();
		if(number!=1) {
			System.out.println("欢迎下次光临！！！");
		}else {
			System.out.println("您可租车的类型及其价目表：");
			System.out.println("序号  汽车名称                租金                容量");
			System.out.println("1.  奥迪A4        "+audiA4.dayPrice+"元/天       载人："+audiA4.personCapacity+"人");
			System.out.println("2.  马自达6       "+mazda.dayPrice+"元/天         载人："+mazda.personCapacity+"人");
			System.out.println("3.  皮卡雪6       "+citroen6.dayPrice+"元/天         载人："+citroen6.personCapacity+"人  载货："+citroen6.goodsCapacity+"吨");
			System.out.println("4.  金龙                      "+goldenDragon.dayPrice+"元/天        载人："+goldenDragon.personCapacity+"人");
			System.out.println("5.  松花江                  "+songhuajiang.dayPrice+"元/天        载货："+songhuajiang.goodsCapacity+"吨");
			System.out.println("6.  依维柯                  "+iveco.dayPrice+"元/天        容载："+iveco.goodsCapacity+"吨");
			System.out.println("请输入您要租汽车的数量：");
			int carNum = input.nextInt();
			Cars rentCars[] = new Cars[carNum];
			for(int i=0;i<carNum;i++) {
				int sequence = i+1;
				System.out.println("请输入第"+sequence+"辆车的需要");
				int carNumber = input.nextInt();
				switch (carNumber) {
				case 1:
					totalPrice+=500;
					totalPerson+=4;
					rentCars[i] = new AudiA4();
					System.out.println(rentCars[i].isForPerson());
					break;
				case 2:
					totalPrice+=400;
					totalPerson+=4;
					rentCars[i] = new Mazda6();
					break;
				case 3:
					totalPrice+=450;
					totalPerson+=4;
					totalGoods+=2;
					rentCars[i] = new PickupTruckCitroen6();
					break;
				case 4:
					totalPrice+=800;
					totalPerson+=20;
					rentCars[i] = new GoldenDragonBus();
					break;
				case 5:
					totalPrice+=400;
					totalGoods+=4;
					rentCars[i] = new SongHuaJiangTruck();
					break;
				case 6:
					totalPrice+=1000;
					totalGoods+=20;
					rentCars[i] = new IvecoTruck();
					break;
				default:
					break;
				}
			}
			System.out.println("请输入租车天数：");
			int rentDay = input.nextInt();
			int allPrice = totalPrice * rentDay;
			System.out.println("您的账单：");
			System.out.println("***可载人的车有：");
			for(int i=0;i<carNum;i++) {
				if(rentCars[i].isForPerson())
					System.out.println(rentCars[i].getCarName());
			}
			System.out.println("共载人："+totalPerson);
			System.out.println("***可载货的车有：");
			for(int i=0;i<carNum;i++) {
				if(rentCars[i].isForGoods())
					System.out.println(rentCars[i].getCarName());
			}
			System.out.println("共载货："+totalGoods);
			System.out.println("***租车总价格为："+allPrice);
			
		}
	}
}
