package java_4장_배열;

public class Test34 {

	public static void main(String[] args) {
		//length변수를 사용하는 이유
		/*
		int []arr = {10,20,30,40,50};
		arr = new int[] {10,20,30};
		for (int i=0;i<5;i++) {
			System.out.println(arr[i]); //Index 3 out of bounds for length 3 //배열의 길이가 달라지면 오류가 발생할 수 있음
		}*/
		
		int []arr = {10,20,30,40,50};
		arr = new int[] {10,20,30}; //새로운 배열이 arr에 저장됨 - > 기존 배열은 garbage collection에서 가져감
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" "); //for문의 조건식에 length를 이용하면 배열의 길이가 달라져도 출력이 가능해짐
		}

	}

}
