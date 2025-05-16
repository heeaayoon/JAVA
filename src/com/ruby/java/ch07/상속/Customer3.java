package com.ruby.java.ch07.상속;

abstract class Customer3 {
	private String name;

	// 생성자
	public Customer3(String name) {
			this.name=name;
		}
	//추상메소드 선언 
	abstract double applyDiscount(double totalAmount);
}