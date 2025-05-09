package java_3장_제어문;

public class Test30 {

	public static void main(String[] args) {
		// if문 중첩
		int i = 6;
		int j = 10;
		if ((i % 2) == 0) {
			System.out.println(i + "은 2의 배수입니다." + j);
			if ((i % 3) == 0) {
				System.out.println(i + j + "는 3의 배수입니다");
			}
		}

		if ((i % 5) == 0) {
			System.out.println(i + "은 2의 배수입니다.");
			if ((i % 3) == 0) {
				System.out.println(i + "는 3의 배수입니다");
			}
		}

	}

}
