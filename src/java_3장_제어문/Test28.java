package java_3장_제어문;

public class Test28 {

	public static void main(String[] args) {
		// 무한루프 빠져나오기 -> break
		int cnt = 0;
		while (true) {
			System.out.println("OK");
			cnt += 2;
			if (cnt == 10) {
				break; // 반복문을 종료시키는 역할
			}
		}

	}

}
