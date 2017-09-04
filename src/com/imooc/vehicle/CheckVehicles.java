package com.imooc.vehicle;

public class CheckVehicles {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		Vehicle bus = new Car();
		Vehicle airbus = new Plane();
		Vehicle titanic = new Steamer();
		vehicle.transport();
		bus.transport();
		airbus.transport();
		titanic.transport();
		
		//instanceOf关键字
		Plane airbus1 = new Plane();
		Vehicle vehicle2 = airbus1;
		//Car car = (Car)vehicle2;
		if(vehicle2 instanceof Car) {
			System.out.println("可以进行类型转换，转换成car类型");
		}
		else {
			System.out.println("不可以进行类型转换");
		}
	}
}
