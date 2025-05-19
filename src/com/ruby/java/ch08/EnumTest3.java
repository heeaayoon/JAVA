package com.ruby.java.ch08;

enum Mandarin3{
	금귤(600), 한라봉(500), 천혜향(400), 레드향(300), 황금향(800);
	
	private int price;
	Mandarin3(int p){
		price = p;
		}
	int getPrice() {
		return price;
	}
}

public class EnumTest3 {

	public static void main(String[] args) {
		Mandarin3 ma = Mandarin3.한라봉;
		if(ma ==Mandarin3.한라봉)
			System.out.println("ma는 한라봉입니다.");
		System.out.println(ma+"가격 : "+ma.getPrice());
		
		Mandarin3 list[] = Mandarin3.values(); //values() : 모든 열거 상수 반환
		System.out.println("== 귤의 종류 : 가격 ==");
		for(Mandarin3 m :list)
			System.out.println(m+ ":"+ma.getPrice());
	}
}
