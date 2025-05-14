package com.ruby.java.ch06;

public class ArmorTest2 {
//실행을 하기 위한 Class
	public static void main(String[] args) {
		Armor suit = new Armor();
		System.out.println(suit.getName()+" : "+suit.getHeight()); //필드가 자동 초기화된 값이 출력됨
		suit = null; //NullPointerException : 참조형 지역변수에 null을 넣으면 주소가 없어짐 (참조가 끊김)
		suit.setName("Mark6");
		suit.setHeight(180);
		System.out.println(suit.getName()+" : "+suit.getHeight());

	}

}
