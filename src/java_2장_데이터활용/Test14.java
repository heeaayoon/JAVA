package java_2장_데이터활용;

public class Test14 {

	public static void main(String[] args) {
		// 비트 연산 예제
		char c = 'A'; // 65
		int nc = c;
		System.out.println(nc);
		c ^= (1 << 5); // 1을 왼쪽으로 5자리 이동 : 100000 // 1000001 = 1000001^100000 //1100001 = 97
		System.out.println(c);

	}

}
