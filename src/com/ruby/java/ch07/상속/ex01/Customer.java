package com.ruby.java.ch07.���.ex01;

public class Customer { //�� Ŭ����
	
	private String cname;
    private String city;
    private int age;
    
    //������ 
    public Customer(String cname, String city, int age) {
		this.cname=cname;
		this.city=city;
		this.age=age;
	}

    // ���� ��� �޼ҵ�
    public void show() {
        System.out.println("�̸� : "+cname+", ���� : "+city+", ���� : "+age);
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