package com.ruby.java.ch07.abstraction;

public interface Messenger {
	
	//인터페이스에서는 상수필드 선언시, 
	//자동으로 public, static, final 추가함
	int MIN_SIZE = 1;
	int MAX_SIZE = 10484565;
	
	//인터페이스는 추상메소드 선언시,
	//자동으로 public, abstract 추가함
	String getMessage();
	
	void setMessage(String msg);
	
	//메소드를 인터페이스 내에서 사용하고 싶으면 
	//public static 이나, public default 를 붙이고 메소드를 작성하기
	public static void getConnection() {
		System.out.println("네트워크에 연결합니다");
	}
	
	public static void log() {
		System.out.println("start!");
	}
	
	public static void logout() {
		System.out.println("end!");
	}

	
	public default void setLogin(boolean login) {
		if(login){
			System.out.println("로그인 처리합니다");
			log();
		}else {
			System.out.println("로그아웃 처리합니다");
			logout();
		}
	}
	
}
