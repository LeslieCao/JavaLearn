package com.imooc.rentCar;

public class Cars {
	int personCapacity = 0;
	int goodsCapacity = 0;
	int dayPrice = 0;
	String carName = "";
	boolean forPerson = false;
	boolean forGoods = false;
	public int getPersonCapacity() {
		return personCapacity;
	}
	public void setPersonCapacity(int personCapacity) {
		this.personCapacity = personCapacity;
	}
	public int getGoodsCapacity() {
		return goodsCapacity;
	}
	public void setGoodsCapacity(int goodsCapacity) {
		this.goodsCapacity = goodsCapacity;
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
	public boolean isForGoods() {
		return forGoods;
	}
	public void setForGoods(boolean forGoods) {
		this.forGoods = forGoods;
	}
	
}
