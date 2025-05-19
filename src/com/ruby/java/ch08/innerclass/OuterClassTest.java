package com.ruby.java.ch08.innerclass;
//익명 클래스 생성 -> 익명 객체 생성
public class OuterClassTest {

	public static void main(String[] args) {
		Messenger test = new Messenger() {

			@Override
			public String getMessage() {
				return "test";
			}

			@Override
			public void setMessage(String msg) {
				System.out.println("test에 메세지를 설정합니다 : "+msg);
			}
			
		};
		System.out.println(test.getMessage());
		test.setMessage("nice day");

	}

}
