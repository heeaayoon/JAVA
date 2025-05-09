package java_4장_배열;

import java.util.Random;

public class Assign5 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		//3*5표 A를 만든다.
		System.out.println("행렬 A");
		int[][] arrA = new int[3][5];
		for (int i =0;i<arrA.length;i++) {
			for (int j =0; j<arrA[i].length;j++) {
				arrA[i][j]=rd.nextInt(100);
				System.out.print("["+arrA[i][j]+"]");
			}
			System.out.println();
		}
		System.out.println();
		//3*5표 B를 만든다
		System.out.println("행렬 B");
		int[][] arrB = new int[3][5];
		for (int i =0;i<arrB.length;i++) {
			for (int j =0; j<arrB[i].length;j++) {
				arrB[i][j]=rd.nextInt(100);
				System.out.print("["+arrB[i][j]+"]");
			}
			System.out.println();
		}
		System.out.println();
		//행렬 덧셈 (arrA+arrB=arrC)
		System.out.println("행렬 덧셈(A+B=C)");
		int[][] arrC = new int[3][5];
		for (int i =0;i<arrC.length;i++) {
			for(int j=0;j<arrC[i].length;j++) {
				arrC[i][j] = arrA[i][j]+arrB[i][j]; 
				System.out.print("["+arrC[i][j]+"]");
			}
			System.out.println();
		}
		System.out.println();
		//5*4 표 D를 만든다
		System.out.println("행렬 D");
		int[][] arrD = new int[5][4];
		for (int i =0;i<arrD.length;i++) {
			for (int j =0; j<arrD[i].length;j++) {
				arrD[i][j]=rd.nextInt(100);
				System.out.print("["+arrD[i][j]+"]");
			}
			System.out.println();
		}
		System.out.println();
		//행렬곱셈 (arrA*arrD=arrE)
		System.out.println("행렬 곱셈(A*D=E)");
		int[][] arrE = new int[3][4];
		for(int i=0;i<arrA[i].length;i++) {
			for (int j=0;j<arrB[j].length;j++) {
				//arrE = 
			}
		}
		
		System.out.println();
		//전치행렬(행과 열의 위치를 바꿈
		
	}

}
