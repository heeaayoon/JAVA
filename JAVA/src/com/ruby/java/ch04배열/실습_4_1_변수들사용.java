package com.ruby.java.ch04배열;

public class 실습_4_1_변수들사용 {
	public static void main(String[] args) {
		/*
		배열 사용없이 변수 5개를 사용하여 5명 점수의 평균 구하기
		int score1,score2,score3, score4, score5;
		5명 점수를 score1 등의 변수로 초기화: 49, 91, 87, 67, 73
		최대 점수, 최소 점수, 평균 점수 계산하는 코드 구현
		*/
		
		int score1 = 49;
		int score2 = 91;
		int score3 = 87;
		int score4 = 67;
		int score5 = 73;
		
		//최대점수
		int max = score1;
		if(max<score2) max = score2;
		if(max<score3) max = score3;
		if(max<score4) max = score4;
		if(max<score5) max = score5;
		System.out.println("최댓값: " + max);
		
		//최소점수
		int min = score1;
		if(min>score2) min = score2;
		if(min>score3) min = score3;
		if(min>score4) min = score4;
		if(min>score5) min = score5;
		System.out.println("최솟값: " + min);
		
		//평균점수
		int sum = 0;
		sum = score1 + score2 + score3 + score4 + score5;
		System.out.println("평균 점수 : "+sum/5);
		
		System.out.println("------------");
		//메소드 활용
		System.out.println("평균 : " + avg(score1, score2, score3, score4, score5));
		System.out.println("최댓값: " + max(score1, score2, score3, score4, score5));
		System.out.println("최솟값: " + min(score1, score2, score3, score4, score5));
	}
	
	//avg()메소드 선언
	static int avg(int...v) {
		int sum = 0;
		for(int x:v) {
			sum+=x;
		}
		return sum/v.length;
	}
	
	//max()메소드 선언
	static int max(int...v) {
		int m = v[0]; //초기값 주의하기 : 임의로 값을 주게 되면, 초기화시킨 m이 최댓값일 때 잘못된 결과가 나올 수 있음
		for(int x:v) {
			if(x>m) {
				m=x;
			}
		}
		return m;
	}
	
	//min()메소드 선언
	static int min(int...v) {
		int n = v[0]; //초기값 주의하기 : 임의로 값을 주게 되면, 초기화시킨 n이 최솟값일 때 잘못된 결과가 나올 수 있음
		for(int x:v) {
			if(n>x) {
				n=x;
			}
		}
		return n;
	}
}
