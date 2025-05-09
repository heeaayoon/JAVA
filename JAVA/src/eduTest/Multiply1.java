package eduTest;

import java.util.Scanner;

public class Multiply1 {

	public static void main(String[] args) {
		// 숫자를 입력받아 5~7단까지 구구단 출력
		Scanner scanner = new Scanner(System.in);
		System.out.print("시작단 : ");
		int num1 = scanner.nextInt();
		System.out.print("마지막단 : ");
		int num2 = scanner.nextInt();

		for (int i = num1; i <= num2; i++) {
			System.out.println("-----" + i + "단-----");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

	}

}
