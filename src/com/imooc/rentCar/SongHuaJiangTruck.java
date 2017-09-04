package com.imooc.rentCar;

public class SongHuaJiangTruck extends Cars{
	int goodsCapacity = 4;
	int dayPrice = 400;
	String carName = "松花江";
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
