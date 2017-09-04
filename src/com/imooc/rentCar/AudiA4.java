package com.imooc.rentCar;

public class AudiA4 extends Cars{
	int personCapacity = 4;
	int dayPrice = 500;
	String carName = "奥迪A4";
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
