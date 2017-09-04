package com.imooc.interfaceLearn;

public class InterfaceTest {
	public static void main(String[] args) {
		IPlayGame p1 = new SmartPhone();
		IPlayGame p2 = new Psp();
		p1.playGame();
		p2.playGame();
		IPlayGame p3 = new IPlayGame() {
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("隐式调用接口");
			}
		};
		p3.playGame();
		new IPlayGame() {
			
			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				System.out.println("调用打游戏的功能");
			}
		}.playGame();
	}
}
