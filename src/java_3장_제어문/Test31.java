package java_3장_제어문;

public class Test31 {

	public static void main(String[] args) {
		// 반복문 중첩
		// 구구단 출력
		for (int i = 2; i < 10; i++) {
			System.out.println("-----" + i + "단-----");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

	}

}
