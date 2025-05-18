package com.ruby.java.ch07.상속.ex01;

public class Customer { //고객 클래스
	
	private String cname;
    private String city;
    private int age;
    
    //생성자 
    public Customer(String cname, String city, int age) {
		this.cname=cname;
		this.city=city;
		this.age=age;
	}

    // 정보 출력 메소드
    public void show() {
        System.out.println("이름 : "+cname+", 도시 : "+city+", 나이 : "+age);
    }

    @Override
    public String toString() {
    	return cname+" "+city+" "+age;
    }

	public String getCname() {
		return cname;
	}

	public String getCity() {
		return city;
	}

	public int getAge() {
		return age;
	}
    
    
}