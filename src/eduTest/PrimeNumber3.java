package eduTest;

import java.util.Scanner;

public class PrimeNumber3 {

	public static void main(String[] args) {
		//git test ...
		//정수의 자릿수를 입력받아서 다음 예시와 같은 경우에 출력하도록 해라
		//입력 자릿수 : 4 (1000~9999)
		//7331 - 7,73,733,7331 이 모두 소수인 수를 출력해라
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Number [0입력시 종료] : ");
			int num = sc.nextInt();
			if (num == 0) break;
			
			int s = (int)Math.pow(10.0, (double)(num-1)); //입력받은 자릿수를 가진 수 중 가장 작은 값 10/100/1000/10000...
			int e = (int)Math.pow(10.0, (double)(num))-1; //입력받은 자릿수를 가진 수 중 가장 큰 값 99/999/9999/99999...
			
			for(int i =s;i<=e;i++) {
				if (isAllPrime(i)==true) {
					System.out.println(i);
				}
			}
		}
		System.out.println("Done!");
	}
	
	public static boolean isAllPrime(int num) {
		for (int i =2;i<num;i++) {
			if(num % i == 0 && (num/10) % i == 0) {
				return false;
			}
		}
		return true;
	}
}
