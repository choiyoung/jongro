package com.zoo.safari;

import com.zoo.CC;

public class EE extends CC{

	public static void main(String[] args) {
		CC cc = new CC();// superŬ������ �����ϸ� protected ���� �� �� ����.
		cc.tiger();//  O
	//	cc.giraffe();  X
	//	cc.elephant(); X
	//	cc.lion();     X
		System.out.println("--------------");
		
		EE ee= new EE();// subŬ������ �����ϸ� protected ���� �� �� �ִ�.
		ee.tiger();//	 O
		ee.giraffe();//  O
	//	ee.elephant();// X
	//	ee.lion();//	 X

	}

}
