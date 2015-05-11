package com.zoo.safari;

import com.zoo.CC;

public class EE extends CC{

	public static void main(String[] args) {
		CC cc = new CC();// super클래스로 생성하면 protected 접근 할 수 없다.
		cc.tiger();//  O
	//	cc.giraffe();  X
	//	cc.elephant(); X
	//	cc.lion();     X
		System.out.println("--------------");
		
		EE ee= new EE();// sub클래스로 생성하면 protected 접근 할 수 있다.
		ee.tiger();//	 O
		ee.giraffe();//  O
	//	ee.elephant();// X
	//	ee.lion();//	 X

	}

}
