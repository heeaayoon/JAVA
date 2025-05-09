package java_3장_제어문;

public class Test29 {

	public static void main(String[] args) {
		// 다음 실행문으로 넘어갈 때 -> continue
		for (int i = 0; i < 10; i++) {
			if ((i % 2) == 0)
				continue; // (i%2)==0가 true 일때는, for문의 끝으로 바로 넘어감
			System.out.println(i);
		}

	}

}
