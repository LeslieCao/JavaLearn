package com.imooc;
public class Telephone {
	private float screen;
	float mem;
	float storage;
	int var = 5;
	
	public float getScreen() {
		return screen;
	}
	
	public void setScreen(float newScreen) {
		screen = newScreen;
	}
	
	void call() {
		int var = 10;
		int localVar = 50;
		System.out.println("var:"+var);
		System.out.println("localVar:"+localVar);
		System.out.println("这是手机打电话的功能");
	}
	
	void sendMessage() {
		int var = 20;
		System.out.println("var:"+var);
		//System.out.println("localVar:"+localVar);
		System.out.println("这是手机发信息的功能");
	}
	
	//无参构造函数
	public Telephone() {
		// TODO Auto-generated constructor stub
		System.out.println("调用无参的构造函数");
	}
	
	//有参的构造函数
	public Telephone(float newSceen, float newMem, float newStorage) {
		// TODO Auto-generated constructor stub
		if (newSceen<3.5) {
			System.out.println("您输入的数值不对，自动赋值3.5");
			screen = 3.5f;
		}
		else {
			screen = newSceen;
		}
		mem = newMem;
		storage = newStorage;
		System.out.println("调用有参的构造函数");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(mem);
		result = prime * result + Float.floatToIntBits(storage);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telephone other = (Telephone) obj;
		if (Float.floatToIntBits(mem) != Float.floatToIntBits(other.mem))
			return false;
		if (Float.floatToIntBits(storage) != Float.floatToIntBits(other.storage))
			return false;
		return true;
	}
	
	
}
