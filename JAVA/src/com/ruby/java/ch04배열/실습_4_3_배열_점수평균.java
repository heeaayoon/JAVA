package com.ruby.java.ch04배열;

import java.util.Random;

public class 실습_4_3_배열_점수평균 {

	public static void main(String[] args) {
		/*배열 사용, 난수로 입력된 10명의 성적 평균 구하기
		 Random rd =new Random();
		 score[i] = rd. nextInt(100);
		 
		 10명 학생의 학점 출력:
		  ~90 A, ~80 B, ~70 C, ~60 D, 59~ F
		 출력은 "99점 - A 학점" 등으로 출력한다.
		 */
		
		Random rd = new Random();
		//학생 10명의 성적을 저장할 score 배열 선언
		int [] score = new int[10];
		
		//학생 10명의 성적을 랜덤으로 입력
		for (int i=0;i<score.length;i++) {
			score[i] = rd.nextInt(100);
			//학생 개개인의 점수를 출력
			System.out.print((i+1)+"번 학생의 점수는 : "+ score[i]+"점입니다. -> ");
			//학생 개개인의 학점을 출력
			if(score[i]>=90) {
				System.out.println("A학점입니다.");
			}else if(score[i]>=80) {
				System.out.println("B학점입니다.");
			}else if(score[i]>=70) {
				System.out.println("C학점입니다.");
			}else if(score[i]>=60) {
				System.out.println("D학점입니다.");
			}else {
				System.out.println("F학점입니다.");
			}
			
		}
		
		

	}

}
