package com.ruby.java.ch09.API;
//Wrapper 클래스의 메소드 실행해보기
//박싱 : valueOf()
//언박싱 : 데이터 타입 데이터타입Value()
//박스와 언박싱 처리는 jdK1.5부터 자동 처리됨

//알아야할 것 : 문자열을 기본 데이터 타입으로 변환하는 메소드인 parse데이터타입 (parseInt , parseDouble...)
import java.util.Arrays;

public class Test12 {
	static void showData(String[]arr) {
		System.out.println();
		for (String st: arr)
			System.out.print(st + " -> ");
	}
	static void sortData(String[]arr, int[]arrInt) {
		for (int i = 0; i< arr.length;i++)
		{
			arrInt[i] = Integer.parseInt(arr[i]);
		}
		Arrays.sort(arrInt);
	}
	static void showNumber(int[]arr) {
		System.out.println();
		for (int n: arr)
			System.out.print(n + " -> ");
	}
	public static void main(String[] args) {
		// string 정렬의 문제 
		String arr[] = {"12", "9", "222", "5", "888", "112"};
		showData(arr); //12 -> 9 -> 222 -> 5 -> 888 -> 112 -> 
		Arrays.sort(arr); //문자열 정렬
		showData(arr); //112 -> 12 -> 222 -> 5 -> 888 -> 9 ->  //문자열을 비교할 때는 첫자리부터 비교를 함 -> 원하는 결과가 안나옴
		System.out.println();
		System.out.println();
		
		System.out.println("기본데이터 타입 -> 객체 / 객체  -> 기본 데이터 타입 전환");
		//숫자로 비교하고 싶음
		int n1 = 10;
		Integer obj1 = n1; // 박싱 : Integer.valueOf(n1)을 자동으로 컴파일러가 실행함 //객체의 메소드를 사용하기 위해 변환한 것임
		
		Integer obj2 = Integer.parseInt("20"); //parseInt()를 이용해 문자열을 integer 타입으로 변환해서 객체 생성 
		int n2 = obj2; //언박싱 : obj2 intValue()
		
		Integer obj3 = 30; //박싱

		int n3 = obj3 + 40; //언박싱

		//정수로 배열로 변환후 정렬 
		int []arrInt = new int[arr.length];
		sortData(arr, arrInt);
		showNumber(arrInt);

	}
}