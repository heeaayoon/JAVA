package eduTest;

import java.util.Scanner;

public class NumericalSum {

	public static void main(String[] args) {
		// 0 보다 큰 하나의 정수를 입력받아서 전체합, 홀수합, 짝수합을 출력하세요

		Scanner sc = new Scanner(System.in);
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		System.out.print("숫자를 입력하시오 : ");
		int num = sc.nextInt();

		// 전체합 구하기
		for (int i = 1; i <= num; i++) {
			sum1 += i;
		}
		System.out.println("전체합 : " + sum1);

		// 홀수합 구하기
		for (int i = 1; i <= num; i++) {
			if ((i % 2) == 0)
				continue;
			sum2 += i;
		}
		System.out.println("홀수합 : " + sum2);

		// 짝수합 구하기
		for (int i = 1; i <= num; i++) {
			if ((i % 2) == 1)
				continue;
			sum3 += i;
		}
		System.out.println("짝수합 : " + sum3);

	}
}
