package com.ruby.java.ch04배열;

import java.util.Random;

public class 실습_4_4_배열생성최대값 {

	public static void main(String[] args) {
		/*
		 난수 배열의 최대, 최소, 평균 구하기
		 0부터 100까지의 정수 난수 10개를 생성하여 배열에 저장
		 배열에서 최대값, 최소값, 평균을 구하기 >> for문을 사용한 최대값 찾기 - length 사용
		  * 출력 내용:
		 *   배열 price는 확장형 for 문으로 출력, 출력 형태는 다음과 같다:[1,2,3,4,5]
		 *   최대값 출력은 다음과 같다
		 *   최대값 = **
		 *   최소값, 평균값 출력은 최대값 출력과 같다.

		 */
		
		Random rd = new Random();
		int[] price = new int[10];
		
		//arr배열 안에 Random한 값을 넣음
		for(int i=0;i<price.length;i++) { 
			price[i]=rd.nextInt(101);
		}
		
		//확장형 for문으로 배열을 출력
		System.out.print("[");
		for(int x:price) {
			System.out.print(x+",");
			if(x==price[(price.length)-1]) {
				System.out.print(x);
			}
		}
		System.out.println("]");
		System.out.println();
		//arr배열 안에서 최대값, 최소값, 평균을 구하기
		int max = price[0];
		int min = price[0];
		int sum = 0;
		for(int i=0;i<price.length;i++) {
			sum+=price[i];
			if(max<=price[i]) {
				max = price[i];
			}
			if(min>=price[i]) {
				min = price[i];
			}
		}
		System.out.println();
		System.out.println("합 : "+ sum);
		System.out.println("평균 : "+ (double)sum/(double)price.length);
		System.out.println("최댓값 : "+ max);
		System.out.println("최솟값 : "+ min);
	

	}

}
