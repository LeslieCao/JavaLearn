package com.imooc.rentCar;

public class GoldenDragonBus extends Cars{
	int personCapacity = 20;
	int dayPrice = 800;
	String carName = "金龙";
	boolean forPerson = true;
	public int getPersonCapacity() {
		return personCapacity;
	}
	public void setPersonCapacity(int personCapacity) {
		this.personCapacity = personCapacity;
	}
	public int getDayPrice() {
		return dayPrice;
	}
	public void setDayPrice(int dayPrice) {
		this.dayPrice = dayPrice;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public boolean isForPerson() {
		return forPerson;
	}
	public void setForPerson(boolean forPerson) {
		this.forPerson = forPerson;
	}
	
}
