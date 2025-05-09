package java_4장_배열;

public class Test36 {

	public static void main(String[] args) {
		//2차원 배열 : 행과 열
		int [][] arr = new int[5][];
		arr[0] = new int[2];
		arr[1] = new int[1];
		arr[2] = new int[3];
		arr[3] = new int[1];
		arr[4] = new int[6];
		
		int [][]arr2 = {{1,2},{3,4,33,44},{5,6},{7,8,77},{9,10}}; //행이 5개, 열은 행마다 항목 수가 다름
		
		for (int i=0;i<arr.length;i++) {
			System.out.println();
			for (int j=0; i<arr[i].length;j++) {
				System.out.print("*");
			}
		}

	}

}
