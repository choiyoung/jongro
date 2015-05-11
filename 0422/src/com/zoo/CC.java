package com.zoo;

public class CC {
	
	public void tiger(){
		System.out.println("무서운 호랑이");
	}
	// protected는 나와 자식클래스만 사용가능하다.
	protected void giraffe(){
		System.out.println("목이 긴 기린");
		
	}
	// pubilc,rotected, private를 쓰지 않은 상태를 defult라고 되어있다. 
	void elephant(){
		System.out.println("뚱뚱한 코끼리");
	}
	//
	private void lion(){
		System.out.println("멋있는 사자");
		
	}
}
