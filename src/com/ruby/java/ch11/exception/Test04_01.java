package com.ruby.java.ch11.exception;

//예외 던지기 throws : 메소드를 호출하는 곳에서 예외처리를 함

public class Test04_01 {
	public static void c() throws Exception { //c()메소드에서 예외 발생시 -> c()메소드 실행구간으로 throws함 
		System.out.println("c():: 실행");
		throw(new Exception());
	}
	public static void b() {
		//c(); -> c()메소드의 실행구간임 -> try~catch문으로 예외처리 해야함/ 하고싶지 않다면 또 다음 실행구간으로 throw 하기
		try {
			c();
		}catch(Exception e) {
			System.out.println("C():: 예외처리");
		}
	}
	
	public static void main(String[] args) {
		b();
	}
}