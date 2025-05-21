package com.ruby.java.ch09.API;

//String 클래스의 split()메소드 : 문자열을 분리해 String 배열로 반환함
//StringTokenizer 클래스 사용 : 객체를 생성, 블랭크를 기준으로 토큰(분리된 문자열)을 생성함
//iterator 개념 실습
 
import java.util.StringTokenizer;

public class Test14 {
	public static void main(String[] args) {

	String msg = "Although the world is full of suffering, it is full also of the overcoming of it.";
	String arrayMessage[] = msg.split(" "); //공백을 기준으로 문자열을 분리함 -> String 배열로 반환
	for (String st: arrayMessage)
		System.out.println(st);
	System.out.println();
	
	
	StringTokenizer st1 = new StringTokenizer(msg);//st1은 객체임!! 배열 XX
	
	System.out.println("블랭크를 기준으로 나눈 토큰 수 : " + st1.countTokens()); //countTokens()메소드 : 남아있는 토큰의 수를 반환
	while (st1.hasMoreTokens()) { //hasMoreTokens()메소드 : 커서 다음에 토큰이 있는지를 판단
		System.out.print(st1.nextToken() + " + " ); //nextTokens()메소드 : 커서 다음의 토큰을 String 타입으로 반환하고,커서를 다음 토큰으로 이동함
	}
	System.out.println();
	System.out.println();
	
	
	StringTokenizer st2 = new StringTokenizer(msg, ",."); //delimiter 사용
	System.out.println(",나.을 기준으로 나눈 토큰 수 : " + st2.countTokens());
	while (st2.hasMoreTokens()) {
		System.out.print(st2.nextToken() + " + " );
	}
	System.out.println();
	
	System.out.println("\n================");
	String s = "id=guest&name=Amy&pwd=1004";
	StringTokenizer st3 = new StringTokenizer(s, "&");
	while (st3.hasMoreTokens()) {
		System.out.println("&을 기준으로 나눈 토큰 갯수 : " + st3.countTokens());
		System.out.println(st3.nextToken()); //다음 커서로 이동
	}

	System.out.println("================");
	StringTokenizer st4 = new StringTokenizer(s, "=&");
	while (st4.hasMoreTokens()) {
		System.out.println(st4.nextToken());
	}
}
}