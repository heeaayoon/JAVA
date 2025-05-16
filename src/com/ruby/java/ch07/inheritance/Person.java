package com.ruby.java.ch07.inheritance;

public class Person {
	// 부모 클래스
	private String name;
	private int age;

	public Person() {
		System.out.println("Person 생성자 실행");
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person(name,age) 생성자 실행");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String toString() {
		return name + ":" + age;
	}
}
