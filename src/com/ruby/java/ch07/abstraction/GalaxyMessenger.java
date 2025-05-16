package com.ruby.java.ch07.abstraction;
//인터페이스는 다중 상속 가능
public class GalaxyMessenger implements Messenger, WorkFile {

	@Override
	public String getMessage() {
		return "galaxy";
	}

	@Override
	public void setMessage(String msg) {
		System.out.println("갤럭시에서 메세지를 설정합니다 : "+msg);

	}
	
	public void changeKeyboard() {
		System.out.println("키보드 아이콘을 터치 후, 키보드를 변경합니다.");
	}

	@Override
	public void fileUpload() {
		System.out.println("파일을 업로드합니다.");
		
	}

	@Override
	public void fileDownload() {
		System.out.println("파일을 다운로드합니다.");
	}

}
