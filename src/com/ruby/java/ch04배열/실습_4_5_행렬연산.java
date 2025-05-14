package com.ruby.java.ch04배열;

import java.util.Arrays;
import java.util.Random;

public class 실습_4_5_행렬연산 {

	public static void main(String[] args) {
		// 3*5배열 A
		// A[3][5]는 3명의 학생이 5과목 시험 본 점수표라고 생각하자.
		// 점수는 0~99 사이의 무작위 숫자로 채운다.
		Random rd = new Random();
		System.out.println("-----3*5배열 A-------");
		int[][] arrA = new int[3][5];
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrA[i].length; j++) {
				arrA[i][j] = rd.nextInt(100);
				System.out.print("["+arrA[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println();

		// 3*5배열 B도 무작위 점수로 채운다.
		System.out.println("-----3*5배열 B-------");
		int[][] arrB = new int[3][5];
		for (int i = 0; i < arrB.length; i++) {
			for (int j = 0; j < arrB[i].length; j++) {
				arrB[i][j] = rd.nextInt(100);
				System.out.print("["+arrB[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println();

		// C = A + B
		// A와 B의 각 자리에 있는 값을 더해서 C라는 새로운 표를 만든다.
		System.out.println("-----3*5배열 C-------");
		int[][] arrC = new int[3][5];
		for (int i = 0; i < arrC.length; i++) {
			for (int j = 0; j < arrC[i].length; j++) {
				arrC[i][j] = arrA[i][j] + arrB[i][j];
				System.out.print("["+arrC[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println();

		// 5*4배열 D도 무작위 점수로 채운다.
		System.out.println("-----5*4배열 D-------");
		int[][] arrD = new int[5][4];
		for (int i = 0; i < arrD.length; i++) {
			for (int j = 0; j < arrD[i].length; j++) {
				arrD[i][j] = rd.nextInt(100);
				System.out.print("["+arrD[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println();

		// E = A × D (행렬 곱셈)
		// A(3x5) X D(5x4) -> E(3x4)
		System.out.println("-----3*4배열 E-------");
		int[][] arrE = new int[3][4];
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrD[0].length; j++) {
				for (int k = 0; k < arrA[0].length; k++) {
					arrE[i][j] += arrA[i][k] * arrD[k][j];
				}
				System.out.print("["+arrE[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println();

		// F = D의 전치 행렬 (Transpose)
		// 행과 열의 위치를 바꾼 표이다.
		System.out.println("-----4*5배열 F-------");
		int[][] arrF = new int[4][5];
		for (int i = 0; i < arrF.length; i++) {
			for (int j = 0; j < arrF[i].length; j++) {
				arrF[i][j] = arrD[j][i];
				System.out.print("["+arrF[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println();
		
		/*

		// G = A × D (A 곱하기 F의 전치 행렬)
		// A[3][5] × F[4][5] → ?? 문제가 잘못된 것 같음
		System.out.println("-----3*4배열 G-------");
		int[][] arrG = new int[3][4];
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrD[i].length; j++) {
				for (int k = 0; k < arrA[i].length; k++) {
					arrG[i][j] += arrA[i][k] * arrD[k][j];
				}
				System.out.print("["+arrG[i][j] + "]");
			}
			System.out.println();
		}
		System.out.println();

		// E와 G가 같은지 비교
		// Arrays.deepEquals(E, G) 이용
		if (Arrays.deepEquals(arrE, arrG) == true) {
			System.out.println("arrE와 arrG는 동일합니다.");
		} else {
			System.out.println("arrE와 arrG는 동일하지 않습니다.");
		}
		System.out.println();
		*/
		
		
		// 2차원 배열을 테이블 형태로 출력
		System.out.println("----테이블 형태로 출력----");
		arr2Dprint(arrA);
	}

	static void arr2Dprint(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("["+array[i][j] + "]");
			}
			System.out.println();
		}
	}

}