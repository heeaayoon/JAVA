package com.ruby.java.ch06;


public class Member2 {
	//필드
	private String name;
	private int age;
	//생성자 오버로딩
	//생성자1
	public Member2() {
		System.out.println("Member2() 생성자 실행");
	}
	//생성자2
	public Member2(String name) {
		System.out.println("Member2(String) 생성자 실행");
	}
	//생성자3
	public Member2(String name, int age) {
		System.out.println("Member2(String, int) 생성자 실행");
	}
	
	//메소드
	public void setName(String name) {
		
	}

	public static void main(String[] args) {
		System.out.println("main() 메서드 실행");
		new Member2(); //생성자1 호출
		new Member2("Amy"); //생성자2 호출
		new Member2("Amy",23); //생성자3 호출

	}

}
