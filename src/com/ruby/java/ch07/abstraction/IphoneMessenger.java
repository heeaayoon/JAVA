package com.ruby.java.ch07.abstraction;
//클래스는 하나만 상속받을 수 있음
//인터페이스는 여러개 상속	받을 수 있음
public class IphoneMessenger extends GraphicIOS implements Messenger {

	@Override
	public String getMessage() {
		return "iPhone";
	}

	@Override
	public void setMessage(String msg) {
		System.out.println("아이폰에서 메세지를 설정합니다 : "+msg);
		//System.out.println(getMessage()+"에서 메세지를 설정합니다 : "+msg);

	}
	
	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다.");
	}

}
