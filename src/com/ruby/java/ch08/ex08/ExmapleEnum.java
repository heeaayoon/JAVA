package com.ruby.java.ch08.ex08;

import java.util.Scanner;

enum Mandarin {
	금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);

	private int price;
	
	//enum의 생성자는 enum 상수마다 생성자를 호출하여 초기화한다
	//enum 객체가 처음 만들어질 때 -> enum 상수마다 호출된다
	Mandarin(int p) {
		price = p;
		System.out.println("enum 생성자 실행:: price = " + price);
	}

	int getPrice() {
		return price;
	}
	
	static Mandarin MandarinAt(int idx) {
		for (Mandarin m : Mandarin.values())
			if (m.ordinal() == idx)
				return m;
		return null;
	}
}

public class ExmapleEnum {
	static Scanner sc = new Scanner(System.in); //값을 입력받기
	
	Mandarin m[] = Mandarin.values(); //values()는 static 함수로 열거된 모든 원소를 배열로 리턴
	
	static Mandarin selectMenu() {//자료구조에서 자주 사용이므로 학습 필요 
		int choose;
		do {
		for (Mandarin m : Mandarin.values()) {
			System.out.println(m.ordinal()+ "번. " + m + "(" + m.getPrice()+ "원)");
		}
		System.out.println();
		System.out.print("번호를 선택하시오 : ");
		choose = sc.nextInt();
		} while(choose < Mandarin.금귤.ordinal() || choose > Mandarin.황금향.ordinal());
		
		return Mandarin.MandarinAt(choose);
	}
	
	public static void main(String[] args) {
		Mandarin ma = Mandarin.한라봉;//enum 클래스 생성자가 호출된다 
		System.out.println(ma.toString());
		System.out.println();
		
		System.out.println("황금향과 비교: "+ ma.compareTo(Mandarin.레드향));
		System.out.println();
		
		Mandarin m3 = Mandarin.valueOf("레드향");
		System.out.println(m3);
		System.out.println();

		Mandarin list[] = Mandarin.values();
		System.out.println("== 귤의 종류 ==");
		for (Mandarin m4 : list)
			System.out.println(m4 + ":" + m4.getPrice());
		System.out.println();	
		
		Mandarin mSelected = selectMenu();
		System.out.println(mSelected + " : " + mSelected.getPrice());
	}
}