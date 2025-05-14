package com.ruby.java.ch04배열;

import java.util.Random;

public class 실습_4_5_행렬연산2 {

	public static void main(String[] args) {
		
		int[][] arrA = getMatrix(3, 5);
		arr2Dprint(arrA, "Matrix A : 난수 3*5");
		int[][] arrB = getMatrix(3, 5);
		arr2Dprint(arrB, "Matrix B : 난수 3*5");
		int[][] arrC = addMatrix(arrA, arrB);
		arr2Dprint(arrC, "Matrix C : Matrix A + Matrix B");
		int[][] arrD = getMatrix(5, 4);
		arr2Dprint(arrD, "Matrix D : 난수 5*4");
		int[][] arrE = mulMatrix(arrA, arrD);
		arr2Dprint(arrE, "Matrix E : Matrix A * Matrix D");
		int[][] arrF = trsMatrix(arrD);
		arr2Dprint(arrF, "Matrix F : trans Matrix D");
	}
	
	private static int[][] getMatrix(int row, int col) {
		Random rd = new Random();
		int[][] arr = new int[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=rd.nextInt(10);
			}
		}
		return arr;
	}

	private static int[][] addMatrix(int[][] arrA, int[][] arrB) {
		if((arrA.length!=arrB.length) || (arrA[0].length!=arrB[0].length)) { //매개변수 행*열 사이즈가 같은지 검사 //매 행마다 열 갯수를 카운트할 필요는 없음->1번째 행의 열수만 비교하기
			return null;
		}
		int[][] addarr = new int[arrA.length][arrA[0].length];
		for(int i=0;i<addarr.length;i++) {
			for(int j=0;j<addarr[i].length;j++) {
				addarr[i][j]=arrA[i][j]+arrB[i][j];
			}
		}
		return addarr;
	}
//	private static int[][] addMatrix(int[][] arrA, int[][] arrB) {
//		for (int a=0;a<arrA.length;a++) { //이렇게 할 필요 없음
//			if((arrA.length==arrB.length) && (arrA[a].length==arrB[a].length)) {
//				int[][] addarr = new int[arrA.length][arrA[a].length];
//				for(int i=0;i<addarr.length;i++) {
//					for(int j=0;j<addarr[i].length;j++) {
//						addarr[i][j]=arrA[i][j]+arrB[i][j];
//					}
//				}
//				return addarr;
//			}
//		}
//	}
	
	private static int[][] mulMatrix(int[][] arrA, int[][] arrD) {
		if (arrA[0].length!=arrD.length) { //매개변수 arrA의 열 수와 arrD의 행 수가 같은지 검사
			return null;
		}
		int[][] mularr = new int[arrA.length][arrD[0].length];
		for(int i=0;i<mularr.length;i++) {
			for(int j=0;j<mularr[0].length;j++) {
				for(int k=0;k<arrA[0].length;k++)
				mularr[i][j]=arrA[i][k]*arrD[k][j];
			}
		}
		return mularr;
	}

	private static int[][] trsMatrix(int[][] arrD) {
		int [][] trsarr = new int [arrD[0].length][arrD.length];
		for (int i=0;i<trsarr.length;i++) {
			for(int j=0;j<trsarr[i].length;j++) {
				trsarr[i][j]=arrD[j][i];
			}
		}
		return trsarr;
	}



	static void arr2Dprint(int[][] array, String msg) {
		System.out.println(msg);
		if (array != null) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print("["+array[i][j] + "]");
				}
				System.out.println();
			}
		}
		System.out.println("-".repeat(40));
	}

}