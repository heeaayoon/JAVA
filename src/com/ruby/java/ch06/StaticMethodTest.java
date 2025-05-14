package com.ruby.java.ch06;



public class StaticMethodTest {
	
	public static void print1() {
		System.out.println("Hello");
	}
	
	public void print2() {
		System.out.println("Java");
	}
	
	public static void main(String[] args) {
		StaticMethodTest.print1(); //정적멤버 호출방법 : 클래스명.정적멤버(정적 필드/정적 클래스)
		StaticMethodTest aa = new StaticMethodTest(); //논정적멤버 호출방법 : 인스턴스 생성 후 -> 참조변수.논정적멤버(논정적 필드/논정적 클래스)
		aa.print2();
		aa.print1(); //인스턴스 생성 후 -> 정적멤버를 호출하는 건 안좋은 방법임

	}


}
