package com.ruby.java.ch07.상속;

public class Customer {
	private String cname; //고객명
	private String city; //고객 지역
	private int age; //고객 나이

	//생성자
    public Customer(String cname, String city, int age) {
		this.cname=cname;
		this.city=city;
		this.age=age;
	}
	
	// 정보 출력 메소드
	public void show() {
		System.out.println("고객명 : "+cname+", 고객 지역 : "+city+", 고객 나이 : "+ age);
	}

	@Override
	public String toString() { //고객의 이름을 리턴함
		return cname;
	}
}
