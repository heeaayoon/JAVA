package com.ruby.java.ch14;
//함수형 인터페이스 API
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test14 {
	public static void main(String[] args) {
		//Function 인터페이스는 apply(String s) 추상메소드를 가짐
		Function<String, Integer> func = (s) -> { //->뒷 부분은 apply(String s) 추상메소드를 override한 내용이 들어감 //내용 : 띄어쓰기를 기준으로 배열에 차례로 넣고 그 배열의 길이를 반환
			int cnt = 0;
			String[] word = s.split(" ");
			cnt = word.length;
			return cnt;
		};		
		int wordCnt = func.apply("고개를 들어 별들을 보라 당신 발만 내다 보지말고");
		System.out.println("단어 수 : " + wordCnt);
		
		//Predicate 인터페이스는 test(Integer n) 추상메소드를 가짐
		Predicate<Integer> func2 = (n) -> n % 2 == 0; //->뒷 부분은 test(Integer n) 추상메소드를 override한 내용이 들어감 //내용 : 인자를 2로 나눈 나머지가 0이면 true 반환/ 아니면 false 반환
		if (func2.test(123))
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
		
		//Consumer 인터페이스는 accept(Date d) 추상메소드를 가짐 
		Consumer<Date> date = (d) -> { //->뒷 부분은 accept(Date d) 추상메소드를 override한 내용이 들어감
			String s1 = new SimpleDateFormat("YY-MM-dd").format(d);
			String s2 = new SimpleDateFormat("YYYYMMdd").format(d);
			System.out.println(s1);
			System.out.println(s2);
		};
		date.accept(new Date());
		
		//Supplier 인터페이스는 get() 추상메소드를 가짐 
		Supplier<String> day = () -> new SimpleDateFormat("E요일").format(new Date()); //->뒷 부분은 get() 추상메소드를 override한 내용이 들어감
		String result = day.get();
		System.out.println(result);
	}
}