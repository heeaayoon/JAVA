package com.ruby.java.ch07.���.ex02;

abstract class Customer2 {

	private String cname;
	private String city;
	private int age;
	
	//������
	public Customer2(String cname,String city,int age) {
		this.cname=cname;
		this.city=city;
		this.age=age;
	}


	@Override
	public String toString() {
		return "��2����";
	}

	abstract double applyDiscount(double totalAmount);
	
	public String getCname() {
		return cname;
	}


}
