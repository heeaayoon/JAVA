package com.ruby.java.ch05;

public class Test03 {
	/*
	public static void main(String[] args) {
		int a = addNumber(1,2);
		System.out.println("합 : "+a);
	}
	
	private static int addNumber(int a, int b) {
		return a+b;
	}*/
	
	/*
	//메소드 오버로딩 -> 매개변수의 갯수가 달리지면 또 다시 메소드를 오버로딩해야 하는 단점
	private static int addNumber(int x) {
		return x;
	}
	private static int addNumber(int x, int y) {
		return x+y;
	}
	private static int addNumber(int x, int y,int z) {
		return x+y+z;
	}
	private static int addNumber(int x, int y,int z, int q) {
		return x+y+z+q;
	}
	*/
	
	/*
	//가변길이 인자 선언 및 사용 -> 매개변수의 길이가 다양하더라도 사용이 가능해짐
	private static int addNumber(int...v) { //가변 길이 인자 선언
		int sum=0;
		for (int x:v)
			sum+=x;
		return sum; //리턴 타입이 int임
	}
	public static void main(String[] args) {
		System.out.println("합1 : "+ addNumber(1,2)); 
		System.out.println("합2 : "+ addNumber(1,2,3)); 
		System.out.println("합3 : "+ addNumber(1,2,3,4)); 
		System.out.println("합4 : "+ addNumber(1,2,3,4,5)); 
	}
	*/
	
	//매개변수와 합을 동시에 출력
	private static int addNumber(int...v) { //가변 길이 인자 선언
		System.out.print(v.length+": ");
		int sum = 0;
		for (int x:v) {
			System.out.print(x+ " ");
			sum+=x;
		} 
		System.out.print("-> ");
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("합1 : "+ addNumber(1,2)); 
		System.out.println("합2 : "+ addNumber(1,2,3)); 
		System.out.println("합3 : "+ addNumber(1,2,3,4)); 
		System.out.println("합4 : "+ addNumber(1,2,3,4,5)); 
	}

}
