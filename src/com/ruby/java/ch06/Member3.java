package com.ruby.java.ch06;


public class Member3 {
	//필드
	private String name;
	private int age;
	//생성자 오버로딩
	//생성자1
	public Member3() {
		this("guest"); //생성자 내에서 생성자를 다시 호출하는 방법 : this();
		System.out.println("Member3() 생성자 실행 : "+name+" "+age);
	}
	//생성자2
	public Member3(String name) {
		this(name, 10);
		System.out.println("Member3(String) 생성자 실행 : "+name+" "+age);
	}
	//생성자3
	public Member3(String name, int age) {
		this.name =name;
		this.age=age;
		System.out.println("Member3(String, int) 생성자 실행 : "+name+" "+age);
	}
	
	//메소드
	public void setName(String name) {
		
	}
	
	public String toString() {
		return name+" : "+age;
	}

	public static void main(String[] args) {
		Member3 m1 = new Member3(); //생성자1 호출 -> 생성자2 호출됨 -> 생성자3 호출됨
		System.out.println(m1.toString());
		System.out.println();
		Member3 m2 = new Member3("Amy"); //생성자2 호출 -> 생성자3 호출됨
		System.out.println(m2.toString());
		System.out.println();
		Member3 m3 = new Member3("Blu",50); //생성자3 호출
		System.out.println(m3.toString());

	}

}
