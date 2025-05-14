package com.ruby.java.ch06;


public class Member {
	//필드
	private String name;
	private int age;
	//생성자
	public Member() {
		System.out.println("Member() 생성자 실행");
	}
	//메소드
	public void setName(String name) {
		
	}

	public static void main(String[] args) {
		System.out.println("main() 메서드 실행");
		new Member(); //생성자 호출

	}

}
