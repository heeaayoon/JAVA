package com.ruby.java.ch09.API;
//String 클래스의 메소드 실행해보기
public class Test02 {
	public static void main(String[] args) {
		//String 클래스의 인스턴스를 생성하는 방법
		//new()로 전부 다른 인스턴스 생성하기 or 동일한 "문자열" 을 대입해 동일한 인스턴스 생성하기 
		System.out.println("=== 407페이지/String 클래스 ===");
		String s1 = new String("java");//새로운 객체 생성
		String s2 = new String("java");//새로운 객체 생성
		String s3 = "java";
		String s4 = "java";

		System.out.println("=== 409페이지/문자열 비교 ===");
		System.out.println("s1,s2의 해시코드 비교) " +System.identityHashCode(s1)+":" + System.identityHashCode(s3));
		System.out.println("s1,s2의 출력값 비교)  " + s1 + " : "+ s3.toString());
		System.out.println();
		
		if (s1 == s2) {			
			System.out.println("s1 == s2/s1과 s2는 동일 객체이다.");
		} else {
			System.out.println("s1 != s2/s1과 s2는 다른 객체이다.");
		}
		
		if (s1 == s2) {
			System.out.println("s1 == s2/s1과 s2는 동일 문자열을 가집니다.");
		} else {
			System.out.println("s1 != s2/s1과 s2는 다른 문자열을 가집니다.");
		}
		
		
		if (s1.equals(s2)) { //equals()는 동일한 객체일 때만 true를 반환함
			System.out.println("s1과 s2는 동일 문자열을 가집니다.");
		} else {
			System.out.println("s1과 s2는 다른 문자열을 가집니다.");
		}
		System.out.println();
		
		
		
		System.out.println(System.identityHashCode(s3)+":" + System.identityHashCode(s4));
		System.out.println(s3.hashCode()+":" + s4.hashCode());
		
		System.out.println("s3,s4의 해시코드 비교)  " +s3.hashCode()+":" + s4.hashCode());
		System.out.println("s3,s4의 출력값 비교)  " + s3 + " : "+ s4.toString());
		
		
		if (s3 == s4) {
			System.out.println("s3 == s4/s3과 s4는 동일 객체이다.");
		} else {
			System.out.println("s3 != s4/s3과 s4는 다른 객체이다.");
		}
		System.out.println();
		
		
		String s5 = "JAVA"; //동일한 문자열을 가진 String 클래스의 객체를 생성 -> s3,s4,s5 는 객체도 문자열도 동일함
		if (s1.equals(s5)) {
			System.out.println("s1과 s5는 동일 문자열을 가집니다.");
		} else {
			System.out.println("s1과 s5는 다른 문자열을 가집니다.");
		}

		if (s1.equalsIgnoreCase(s5)) {
			System.out.println("s1.equalsIgnoreCase(s5)::동일 문자열을 가집니다.");
		} else {
			System.out.println("s1.equalsIgnoreCase(s5)::다른 문자열을 가집니다.");
		}
		
	}
}
