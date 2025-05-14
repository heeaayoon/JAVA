package eduTest;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		//입력받은 값이 소수인지를 판별
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Number [0입력시 종료] : ");
			int num = sc.nextInt();
			if (num == 0) {
				break;
			}
			if (isPrime(num) == true) {
				System.out.println(num + "is a Prime");
			} else {
				System.out.println(num + "is not a Prime");
			}
		}
	}

	public static boolean isPrime(int num) {
		for (int i = 2; i < num - 1; i++) {
			if (num % i == 0) // 입력한 수를 2~입력한수-1로 모두 나눴을 때 나머지가 0인 경우, 소수가 아니므로 false를 리턴함
				return false;
		}
		return true;

	}

}
