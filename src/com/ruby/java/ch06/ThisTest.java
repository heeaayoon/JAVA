package com.ruby.java.ch06;

public class ThisTest {
	int i =1;
	
	public void first() {
		int i = 2;
		int j = 3;
		this.i = i+j;
		
		second(4);
	}
	
	public void second(int i) {
		int j =5;
		this.i = i+j;
	}

	public static void main(String[] args) {
		ThisTest test = new ThisTest();
		System.out.println("ThisTest 클래스의 필드 i 값 변환 전 : "+ test.i); 
		test.first();
		System.out.println("ThisTest 클래스의 필드 i 값 변환 후 : "+test.i); 
		

	}

}
