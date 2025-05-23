package com.ruby.java.ch11.exception;

//자료구조에서 사용할 예외처리 > stack과 queue에서 사용 

class NagativeNumberException extends Exception {
	//생성자
	public NagativeNumberException() {
		super("음수는 허용하지 않습니다1"); //Exception의 생성자를 호출하는 것 //여기에서는 예외 발생시에 출력되는 위치를 확인 하기 위해 사용 
	}
}

public class Test05 {
	int battery = 0;
	
	//charge()메소드 
	void charge(int time) {
		if (time < 0) { //음수를 넣으면 
			time = 0; //0으로 전환한 후, 
			try { //예외처리 try~catch문을 실행함
				throw new NagativeNumberException();
			} catch (NagativeNumberException e) {
				System.out.println("음수는 허용하지 않습니다2");
			}
		}
		battery += time;
		System.out.println("현재 배터리 : " + battery);

	}

	public static void main(String[] args) {
		Test05 test = new Test05();
		test.charge(30);
		test.charge(20);
		test.charge(-10);
	}
}
