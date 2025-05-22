package com.ruby.java.ch10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>(); //디폴트로는 10개 짜리 "배열"을 만듦 -> 이후에 add, remove로 알아서 배열 크기를 조절함
		//list.add(10); list.add("북경"); list.add("상해"); //ArrayList의 데이터타입을 <String>으로 지정했으므로 int 타입의 데이터를 add할 수 없음 
		list.add("서울"); list.add("북경"); list.add("상해");
		list.add("서울"); list.add("도쿄"); list.add("뉴욕");
		
		System.out.println("1:"+list.toString());
		
//		for(int i=0; i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
		//add(인덱스, 값)
		list.add(1, "LA");
		print(2,list);
		
		//indexof(값) : 값이 들어있는 처음 인덱스
		System.out.println("3:"+list.indexOf("서울"));
		
		//lastindexof(값) : 값이 들어있는 마지막 인덱스
		System.out.println("4:"+list.lastIndexOf("서울"));
		
		//remove(값)
		list.remove("LA");
		print(5,list);
		
		//remove(인덱스)
		list.remove(2);
		
		//contains(값) : 해당 값이 배열 안에 있는지 f/t
		System.out.println("7 : "+list.contains("LA"));
	
		//clear() : 배열 안의 값을 전부 지우기
		list.clear();
		print(10,list);
		
		//isEmpty() : 배열 안이 비어있는지 t/f
		System.out.println("11: "+list.isEmpty());
		
		list.add("파리");
		list.add("방콕");
		list.add("LA");
		
		//asList() : 동적인 갯수로 인자를 받을 수 있음
		List<String> list2 = Arrays.asList("서울" , "뉴욕", "상해");
		print(12,list2);
		
		//addAll() : 배열의 모든 항목을 붙여넣기
		list.addAll(list2);
		print(13,list);
		
		//containAll() : 배열의 모든 항목이 들어있는지 t/f
		System.out.println("14 : "+list.containsAll(list2));
		
		//retainAll() : 해당 데이터만 남겨두고 나머지는 모두 삭제
		list.retainAll(list2);
		print(15,list);
		
		//removeAll() : 모두 삭제 
		list.removeAll(list2);
		print(16,list);
	}
	
	public static void print(int n, List<String>list) {
		System.out.println(n+":"+list);
	}

}
