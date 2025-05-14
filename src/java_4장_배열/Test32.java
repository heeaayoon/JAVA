package java_4장_배열;

public class Test32 {

	public static void main(String[] args) {
		// 배열
		int[] arr = new int[5];
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		arr[3] = 19;
		arr[4] = 29;

		// System.out.println(arr[0]);
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == 4) {
				System.out.print(arr[4]);
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
		System.out.println("]");

		/*
		//최대값구하기 
		int max = 0; 
		for (int i = 0;i<arr.length;i++) { 
			if (max < arr[i]) {
		 		max = arr[i]; 
		 	} 
		 } 
		 System.out.println("max : "+max);
		
		//최솟값구하기 
		int min = 0; 
		for (int i = 0;i<arr.length;i++) { 
			if (min > arr[i]) {
		 		min = arr[i]; 
		 	} 
		 } 
		 System.out.println("min : "+min);
		 
		 //평균구하기 
		 int sum = 0; 
		 for (int i =0;i<arr.length;i++) { 
		 	sum+=arr[i]; 
		 }
		 System.out.println("sum : "+sum);
		 System.out.println("avg : "+sum/arr.length);
		 */

		// 최대,최소,평균구하기
		int max = 0;
		int min = 0;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
			sum += arr[i];
		}
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("sum : " + sum);
		System.out.println("avg : " + sum / arr.length);

		// 등차수열을 배열로 구현
		int[] intarr = new int[10];
		System.out.print("[");
		for (int i = 0; i < intarr.length; i++) {
			intarr[i] = 3 + (2 * i);
			if (i == 9) {
				System.out.print(intarr[i]);
			} else {
				System.out.print(intarr[i] + ",");
			}
		}
		System.out.print("]");

	}
}
