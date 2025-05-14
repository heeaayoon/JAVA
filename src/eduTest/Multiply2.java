package eduTest;

import java.util.Scanner;

public class Multiply2 {

	public static void main(String[] args) {
		// 숫자 2개를 입력받아 작은 수에서 큰 수까지 구구단 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 2개 입력 : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int min = 0;
		int max = 0;

		if (num1 < num2) {
			min = num1;
			max = num2;
		} else {
			min = num2;
			max = num1;
		}

		for (int i = min; i <= max; i++) {
			System.out.println("-----" + i + "단-----");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

	}
}