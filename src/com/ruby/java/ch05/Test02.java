package com.ruby.java.ch05;

public class Test02 {
	//복합 선언 : 가변길이 인자와 다른 일반인자를 동시에 매개변수로 받음
	static void test(String name, int...v) {
		int sum = 0;
		System.out.print(name+": ");
		for (int x:v) {
			System.out.print(x+" ");
			sum+=x;
		}	
		System.out.println("/합 : "+sum);
	}
	
	public static void main(String[] args) {
		test("A씨",5,8,5,6);
		test("B씨",8,6);
	}
}
