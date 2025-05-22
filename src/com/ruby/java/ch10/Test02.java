package com.ruby.java.ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {

	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<String>();
		 
		list.add("서울"); list.add("북경"); list.add("상해");
		list.add("서울"); list.add("도쿄"); list.add("뉴욕");
		
		System.out.println("1. 일반적인 for문");
		for(int i =0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("2. 확장 for문"); //객체를 안만들어도 되는 장점
		for(String i : list) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("3. Iterator 객체 생성"); //객체를 생성, 일부데이터가 아닌 모든 데이터에 접근할 때 유용함
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
	}
}
