package com.ruby.java.ch04배열;

public class 실습_4_2_배열생성최대값 {
	public static void main(String[] args) {
		/*1차원 배열 생성 및 초기화
		정수 1차원 배열 price를 선언하고 5개 값으로 초기화: 49, 91, 87, 67, 73
		->for문을 사용한 최대값 찾기
		 */
		
		int [] price = {49, 91, 87, 67, 73};
		int max = price[0];
		for(int i=1;i<price.length;i++) {
			if(max<price[i]) {
				max = price[i];
			}
		}
		System.out.println("최댓값 : "+ max);
	}
}
