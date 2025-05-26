package com.ruby.java.ch14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

//제네릭 함수형 인터페이스

interface MyFunc<T> {
	T modify(T t);// 리턴값이 T 타입
}

interface StringFunc {
	String modify(String s);
}

class Student{
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;

    public Student(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }
}

public class Test07 {

	static String test(StringFunc sf, String s) {
		return sf.modify(s);
	}

	public static void main(String[] args) {
		 ArrayList<Student> classRoom = new ArrayList<>();
//		 Collections.sort(List<T> list); //숫자일 때
//		 Collections.sort(List<T> list, Comparator<? super T> c); //숫자 아닐 때
		 
		
		//MyFunc<String> 인터페이스는 modify(String t) 추상메소드를 가짐
		MyFunc<String> mf1 = (str) -> str.toUpperCase() + ":" + str.length(); //-> 뒷부분은 modify(String t) 추상메소드를 override한 내용이 들어감 //내용 : 매개변수로 들어간 값을 모두 대문자로 변환 + : + 매개변수의 길이 
		System.out.println(mf1.modify("java"));
		System.out.println(mf1.modify("java programming"));
		System.out.println();

		//MyFunc<Integer> 인터페이스는 modify(int t) 추상메소드를 가짐
		MyFunc<Integer> mf2 = (n) -> n * 2; //-> 뒷부분은 modify(String t) 추상메소드를 override한 내용이 들어감
		System.out.println(mf2.modify(23));
		System.out.println(mf2.modify(42));
		System.out.println();

		String str = "Korea,Australia,China,Germany,Spain,Turkey";
		//StringFunc 인터페이스는 modify(String s) 추상메소드를 가짐 
		StringFunc sf1 = (s) -> { //-> 뒷부분은 modify(String s) 추상메소드를 override한 내용이 들어감 //내용 : ,를 blank로 바꾸기
			String result = "";
			char c;
			for (int i = 0; i < s.length(); i++) {
				c = s.charAt(i);
				if (c == ',')
					result += " ";
				else
					result += c;
			}
			return result;
		};
		// 람다식의 결과값을 메소드의 매개변수로 전달
		String s1 = test(sf1, str);
		System.out.println(s1);
		System.out.println();
		
		//StringFunc 인터페이스는 modify(String s) 추상메소드를 가짐 
		StringFunc sf2 = (s)-> {//-> 뒷부분은 modify(String s) 추상메소드를 override한 내용이 들어감 //내용 : 단어의 길이가 가장 단어를 찾는 코드
			int max = 0;
			int index = 0;
			String[] word = s.split(",");
			for (int i = 0; i < word.length; i++) {
				if (max < word[i].length()) {
					max = word[i].length();
					index = i;
				}
			}
			return word[index];
		};
		// 람다식의 결과값을 메소드의 매개변수로 전달
		String s2 = test(sf2,str);
		System.out.println(s2);

		
		// 람다식을 메소드의 매개변수로 전달 //sf2를 선언하고 test()메소드에 집어넣는 방식이 아닌, test() 메소드 안의 매개변수로 람다식을 전달함 //자료구조에서 comparator 이해에 반드시 필요함!!!
		String s3 = test((s) -> {
			int max = 0;
			int index = 0;
			String[] word = s.split(",");
			for (int i = 0; i < word.length; i++) {
				if (max < word[i].length()) {
					max = word[i].length();
					index = i;
				}
			}
			return word[index];
		}, str);
		System.out.println(s3);
		
	}
}