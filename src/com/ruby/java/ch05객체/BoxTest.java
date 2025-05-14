package com.ruby.java.ch05객체;

public class BoxTest {

	public static void main(String[] args) {
		// 박스 객체1 생성
		Box box1 = new Box(10, 5, 3);

		// 박스 정보 출력
		box1.show();
		System.out.println("박스의 부피는 : "+box1.getVolume());
		System.out.println("박스의 둘레는 : "+box1.getPerimeter());
		System.out.println();
		
		// 박스 크기 변경
		box1.resize(15, 8, 5);
		
		// 변경된 박스의 정보 출력
		box1.show();
		System.out.println("박스의 부피는 : "+box1.getVolume());
		System.out.println("박스의 둘레는 : "+box1.getPerimeter());
		System.out.println();
		
		// 박스를 2배 확대
		box1.resize(2);
		
		// 변경된 박스의 정보 출력
		box1.show();
		System.out.println("박스의 부피는 : "+box1.getVolume());
		System.out.println("박스의 둘레는 : "+box1.getPerimeter());
		System.out.println();
		
		System.out.println("---------------------------------------");
		
		// 박스 객체2 생성
		Box box2 = new Box(4, 7, 3);
		System.out.println(box2.toString()); //toString() 메소드는 디폴트 -> 굳이 메소드 언급하지 않아도 됨
		
		// 박스 정보 출력
		box2.show();
		System.out.println("박스의 부피는 : "+box2.getVolume());
		System.out.println("박스의 둘레는 : "+box2.getPerimeter());
		System.out.println();
		
		// 박스 크기 변경
		box2.resize(9, 3, 8);
		System.out.println(box2);
		
		// 변경된 박스 정보 출력
		System.out.println("박스의 부피는 : "+box2.getVolume());
		System.out.println("박스의 둘레는 : "+box2.getPerimeter());
		System.out.println();

		// 박스를 1.5배 확대
		box2.resize(1.5);
		System.out.println(box2);
		
		// 변경된 박스 정보 출력
		System.out.println("박스의 부피는 : "+box2.getVolume());
		System.out.println("박스의 둘레는 : "+box2.getPerimeter());
	}

}
