package com.ruby.java.ch06;

public class ThisTest2 {
	private String name;

	public void setName(String name) {
		//name = name; //지역변수에 저장됨
		this.name = name; //필드에 저장됨
	}
	
	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		ThisTest2 test = new ThisTest2();
		test.setName("Amy");
		System.out.println(test.getName());
		

	}

}
