package com.imooc.interfaceLearn;

import com.imooc.Telephone;

public class SmartPhone extends Telephone implements IPlayGame {

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("具备打游戏的功能");
	}

}
