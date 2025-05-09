package com.ruby.java.ch05;

public class Test01 {
	//메소드 선언
	static void test(int...v) { //매개변수의 갯수가 정해지지 않았을 때, 매개변수를 (타입...매개변수명)으로 선언가능함 //데이터를 받으면 배열로 저장함
		System.out.print(v.length+":");
		for (int x:v) //확장 for문을 사용할 수 있는 이유 : v가 배열이기 때문
			System.out.print(x+" ");
		System.out.println();
	}
	
	//실행 메소드
	public static void main(String[] args) {
		test(1);
		test(1,2);
		test(1,2,3);
	}
}
