package java_3장_제어문;

public class Test27 {

	public static void main(String[] args) {
		// for문
		for (int i = 10; i < 10; i++) {
			System.out.println("for OK"); // 실행X
		}

		// while문
		int j = 10;
		while (j < 10) {
			System.out.println("while OK"); // 실행X
			j++;
		}

		// do-while문
		int k = 10; // 초기값
		do {
			System.out.println("do-while OK"); // 실행X //do블록은 무조건 실행됨
			k++; // 증감식
		} while (k < 10); // 조건식

	}

}
