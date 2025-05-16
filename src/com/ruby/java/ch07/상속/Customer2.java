package com.ruby.java.ch07.상속;

abstract class Customer2 {
	private String cname;
	private String city;
	private int age;
	
	//생성자
	public Customer2(String cname,String city,int age) {
		this.cname=cname;
		this.city=city;
		this.age=age;
	}

	public void show() {
	}

	@Override
	public String toString() {
		return null;
	}

	abstract double applyDiscount(double totalAmount);
}
