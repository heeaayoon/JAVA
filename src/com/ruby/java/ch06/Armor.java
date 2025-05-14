package com.ruby.java.ch06;

public class Armor {
	//객체를 생성하기 위한 Class
	private String name;
	private int height;
	public int age; //다른 클래스에서도 이 필드에 접근이 가능해짐

	private int aaa() { //같은 클래스 안에서 호출하기 위해 선언된 메소드
		return 1;
	}
	
	public String getName() {
		//aaa(); //위에서 선언된 aaa()메소드를 호출
		return name;
	}
	
	public void setName(String value) {
		name = value;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int value) {
		height = value;
	}

}
