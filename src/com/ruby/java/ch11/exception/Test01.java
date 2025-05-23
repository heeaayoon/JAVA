package com.ruby.java.ch11.exception;

//예외 발생시 -> try~catch 문으로 예외를 처리해줘야 JVM이 실행을 종료하지 않음

public class Test01 {

	public static void main(String[] args) {
//		int arr2[] = new int[3];
//		arr2[3] = 0;  //ArrayIndexOutOfBoundsException 발생 -> JVM이 실행을 종료함
//		
//		int n = 10;
//		n=n/0; //ArithmeticException 발생 : 0으로는 나눌 수 없음 -> JVM이 실행을 종료함
// 
//		String st = "hello";
//		st = null;
//		System.out.println(st.length()); //NullPointerException 발생 -> JVM이 실행을 종료함

		//JVM이 실행을 종료하지 않으려면 ? try ~ catch 문을 작성
		//try 블록 내에 예외가 여러개 발생하더라도, 스레드에 따라 가장 최상단의 예외만 catch 블록으로 처리 가능함 
		try {
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length(); // NullPointerException() --> throw() : catch문으로 넘어감
			int arr[] = new int[3];
			arr[3] = 30; // ArrayIndexOutOfBoundsException()
			System.out.println("OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println("모든 Exception 처리");	
		} catch (ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace();//printStackTrace() : 오류의 위치, 내용을 알려줌 -> 개발 과정에서 유용함
			System.out.println(e1.getMessage());//getMessage() : 발생한 예외의 메세지를 추출
			System.out.println("ArrayIndexOutOfBoundsException 처리");
		} catch (NullPointerException e2) {
			e2.printStackTrace();
			System.out.println(e2.getMessage());
			System.out.println("NullPointerException 처리");
		} catch (Exception e) {//모든 예외를 전부 잡기 때문에 맨 마지막에 위치하도록 함 //만약 catch블록의 최상단에 Exception을 위치시키면 밑은 catch문은 아예 돌수가 X
			System.out.println("Exception 처리");
			System.out.println("오류 발생 : " + e);// e.toString()
		} finally { //예외와 상관없이 계속 처리할 부분
			System.out.println("GOOD");
		}
		
		System.out.println("123");
	}
}