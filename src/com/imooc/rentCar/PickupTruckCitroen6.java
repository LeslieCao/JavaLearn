package com.imooc.rentCar;

public class PickupTruckCitroen6 extends Cars{
	int personCapacity = 4;
	int goodsCapacity = 2;
	int dayPrice = 450;
	String carName = "皮卡雪6";
	boolean forPerson = true;
	boolean forGoods = true;
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
