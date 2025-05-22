package com.ruby.java.ch10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Test10 {

	public static void main(String[] args) {
		
		//로또 번호 만들기
		Random ran = new Random(20000101); //Random 클래스에 시드넘버를 심어서 랜덤한 수 출력하기
		HashSet<Integer> lotto = new HashSet<>();
		
		while(lotto.size()<6) { //lotto의 배열 사이즈가 5일때 마지막으로 값을 추가함
			lotto.add(ran.nextInt(45)+1);
			//System.out.println(lotto);
		}
		
//		Object[] lottoList = lotto.toArray();
//		Arrays.sort(lottoList);
//		System.out.println(lottoList);
		
		//작은수부터 차례로 출력하기 -> 인덱스 만들어서 sort()?
		ArrayList<Integer>lottoList = new ArrayList<>(lotto);
//		System.out.println(lottoList);
		lottoList.sort(null); //ArrayList클래스의 .sort(람다식:비교할 함수 넣기) //현재는 비교할 대상이 없으므로 null 
		System.out.println(lottoList);
	}
}
