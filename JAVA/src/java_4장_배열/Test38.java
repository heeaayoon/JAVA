package java_4장_배열;

import java.util.Random;

public class Test38 {

	public static void main(String[] args) {
		//난수를 이용해 이차원 배열 초기화
		int [][]arr = new int[5][5];
		Random rd = new Random();
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr[i].length;j++) {
				arr[i][j]=rd.nextInt(100);
				System.out.print("["+arr[i][j]+"]");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//2차원 배열에서 확장형 for문 사용
		for(int[] row : arr) { //int[] row 는 각 행을 나타냄
			for (int v : row) { //row 변수가 각 행이므로 1차원 배열
				System.out.print("["+ v+"]");
			}
			System.out.println();
		}
		
	}

}
