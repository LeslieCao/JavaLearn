package com.imooc.rentCar;

public class IvecoTruck extends Cars{
	int goodsCapacity = 20;
	int dayPrice = 1000;
	String carName = "依维柯";
	boolean forGoods = true;
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
	public boolean isForGoods() {
		return forGoods;
	}
	public void setForGoods(boolean forGoods) {
		this.forGoods = forGoods;
	}
	
}
