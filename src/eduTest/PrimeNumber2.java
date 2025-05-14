package eduTest;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		//정수의 자릿수를 입력받아서 해당자릿수에 속하는 소수를 찾아서 출력하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while (true) {
			System.out.print("Number [0입력시 종료] : ");
			int num = sc.nextInt();
			if (num == 0) break;
			
			int s = (int)Math.pow(10.0, (double)(num-1)); //입력받은 자릿수를 가진 수 중 가장 작은 값 10/100/1000/10000...
			int e = (int)Math.pow(10.0, (double)(num))-1; //입력받은 자릿수를 가진 수 중 가장 큰 값 99/999/9999/99999...
			
			for(int i =s;i<=e;i++) {
				if (isPrime(i)==true) {
					count++;
				}
			}
			System.out.println("Number of Prime : "+ count);	
		}
		System.out.println("Done!");
	}
	
	public static boolean isPrime(int num) {
		for (int i =2;i<num;i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
