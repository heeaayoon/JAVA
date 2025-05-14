package com.ruby.java.ch06;

public class ArmorTest {
//실행을 하기 위한 Class
	public static void main(String[] args) {
		Armor suit1 = new Armor();
		Armor suit2 = new Armor();
		Armor suit3 = new Armor();
		//System.out.println(suit1.getName()+" : "+suit1.getHeight()); //set()으로 값을 넣어주기 전 자동으로 초기화된 필드
		
		suit1.setName("Mark6");
		suit1.setHeight(180);
		
		suit2.setName("Mark16");
		suit2.setHeight(220);
		
		suit3.setName("Mark38");
		suit3.setHeight(200);
		
		System.out.println("나이는 : " +suit1.age); //외부에서 필드에 접근 가능 //public 필드에 초기값을 안줬으므로 자동으로 초기화됨 //0
		System.out.println(suit1.getName()+" : "+suit1.getHeight()); //set()으로 필드에 값을 넣어준 후 출력
		System.out.println(suit2.getName()+" : "+suit2.getHeight());
		System.out.println(suit3.getName()+" : "+suit3.getHeight());

	}

}
