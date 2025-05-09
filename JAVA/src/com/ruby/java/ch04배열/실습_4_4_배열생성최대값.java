package com.ruby.java.ch04배열;

import java.util.Random;

public class 실습_4_4_배열생성최대값 {

	public static void main(String[] args) {
		/*
		 난수 배열의 최대, 최소, 평균 구하기
		 0부터 100까지의 정수 난수 10개를 생성하여 배열에 저장
		 배열에서 최대값, 최소값, 평균을 구하기 >> for문을 사용한 최대값 찾기 - length 사용
		 */
		
		Random rd = new Random();
		int[] arr = new int[10];
		
		//arr배열 안에 Random한 값을 넣음
		for(int i=0;i<arr.length;i++) { 
			arr[i]=rd.nextInt(100);
			System.out.print(arr[i]+" ");
		}
		//arr배열 안에서 최대값, 최소값, 평균을 구하기
		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(max<=arr[i]) {
				max = arr[i];
			}
			if(min>=arr[i]) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("합 : "+ sum);
		System.out.println("평균 : "+ (double)sum/(double)arr.length);
		System.out.println("최댓값 : "+ max);
		System.out.println("최솟값 : "+ min);
	

	}

}
