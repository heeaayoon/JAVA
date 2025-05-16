package com.ruby.java.ch07.inheritance;

public class Studnet extends Person {
	private String major;
	
	public Studnet() {
		System.out.println("student 생성자 실행");
	}
	
	public Studnet(String name, int age, String major) {
		super(name, age);
		this.major=major;
		System.out.println("student(name, age,major) 생성자 실행");
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString()+":"+getMajor();
	}
}
