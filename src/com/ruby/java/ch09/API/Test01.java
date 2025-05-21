package com.ruby.java.ch09.API;
//object 클래스의 메소드 실행해보기

class MyObject {
	public MyObject() {}
	public String toString() {
		return "toString()오버라이딩 결과 : MyObject";
	}
}
public class Test01 {
	public static void main(String[] args) {
		//hashCode() 메소드 
		//hashCode : 객체 식별자. 객체를 생성하면 만들어지는 특정한 주소값 
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new MyObject();
		System.out.println("===397페이지/해시코드===");
		System.out.println("obj1.hashCode()=" + obj1.hashCode());//출력이 정수
		System.out.println(Integer.toHexString(obj1.hashCode()));
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		System.out.println();
		
		//getClass() 메소드 : 인스턴스의 클래스를 반환하는 메소드
		System.out.println("===398페이지/클래스정보===");
		Class c = obj3.getClass();//c는 객체이고 toString()이 있음
		System.out.println(c);
		System.out.println("객체의 클래스 이름: " + c.getName());
		//문자열은 비교할 때 compareTo()사용함 //숫자 비교시에는 ==사용함
		if ((c.getName()).compareTo("MyObject")== 0) //==1(false)/==0(true)
			System.out.println("클래스는 " + c.getName()); 
		String st ="Hello";
		if(st.compareTo("Hello")==0) {
			System.out.println("동일합니다.");
		}
		System.out.println();
		
		//toString() 메소드 : 인스턴스에 대한 정보를 문자열로 반환하는 메소드 -> 해쉬코드를 hexaString으로 자동변환
		//toString() 메소드는 명시하지 않아도, 디폴트로 사용되는 메소드임
		System.out.println("===399페이지/문자열로 표현===");
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj2);
		System.out.println(obj3);//obj3은 MyObject 클래스로 만들어진 객체임 -> MyObject 클래스에서 toString()메소드를 "MyObject"이라는 문자열을 리턴한다고 재정의 했음 -> 재정의된 toString() 호출
		System.out.println();
		
		//equals() 메소드
		//new()로 만든 인스턴스 하나하나는 전부 다른 해쉬코드를 가진, 전부 다른 객체임
		System.out.println("===403페이지/같은지 비교===");
		MyObject obj4 = new MyObject();
		MyObject obj5 = new MyObject();
		if (obj4.equals(obj5)) { //hashCode가 다르므로 false
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		System.out.println(obj4.hashCode() + ":" + obj5.hashCode());
		System.out.println();
		
		if (obj4 == obj5) { 
			System.out.println("동일 객체이다.");
		} else {
			System.out.println("다른 객체이다.");
		}
		System.out.println("obj4 = " + obj4);
		MyObject mo2 = new MyObject();//402페이지의 toString() 오버라이딩
		System.out.println(mo2);
	}
}