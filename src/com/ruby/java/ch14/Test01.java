package com.ruby.java.ch14;
//명령형 스타일로 인터페이스 구현하기
//익명클래스로 인터페이스 구현
//익명객체로 인터페이스 메소드 호출

//인터페이스 생성 : 추상 메소드로만 구성됨
interface MyInterface {
	public void print();
}

//방법 1. implements 키워드로 인터페이스를 구현할 클래스 MyClass1 생성 -> 반드시 메소드 재정의!
class MyClass1 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass1");
	}
}

//방법 1. implements 키워드로 인터페이스를 구현할 클래스 MyClass2 생성 -> 반드시 메소드 재정의!
class MyClass2 implements MyInterface {
	@Override
	public void print() {
		System.out.println("MyClass2");
	}
}

public class Test01 {
	// 메소드 : 매개변수 타입이 인터페이스
	static void test(MyInterface mi) {
		mi.print();
	}

	// 메소드 : 데이터타입이 인터페이스
	static MyInterface test2() {
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("test2()메서드에서 반환된 MyInterface");
			}
		};
		return mi; //익명클래스의 객체(인터페이스 타입)를 리턴함
	}

	public static void main(String[] args) {
		// 방법1 : 인터페이스를 구현할 클래스를 이용해 객체 생성하기
		MyClass1 mc1 = new MyClass1();
		MyClass2 mc2 = new MyClass2();
		MyInterface mc3 = new MyClass1();
		mc1.print(); // MyClass1
		mc2.print(); // MyClass2
		mc3.print(); // MyClass1
		test(mc1); // MyClass1
		System.out.println();

		//MyInterface mi2 = new MyInterface(); //인터페이스만을 가지고는 객체 생성불가
		// 방법2: 익명 클래스 이용해 객체 생성하기 
		MyInterface mi = new MyInterface() {
			@Override
			public void print() {
				System.out.println("익명 클래스로 구현");
			}
		};
		mi.print(); // 익명 클래스로 구현
		test(mi); // 익명 클래스로 구현
		System.out.println();

		// 방법3: 선언, 생성, 호출을 한꺼번에 처리하는 인터페이스 객체 : 익명객체
		(new MyInterface() {
			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한번에 처리");
			}
		}).print(); // 익명 클래스 선언, 익명 객체 생성, 호출을 한번에 처리
		System.out.println();

		MyInterface mi2 = test2();
		mi2.print(); // test2() 메서드에서 반환된 MyInterface

	}
}