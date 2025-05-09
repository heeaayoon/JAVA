package java_2장_데이터활용;

public class Test07_1 {

	public static void main(String[] args) {
		// 전위, 후위 연산
		int a = 10;
		int b, c;

		b = ++a; // a에 1을 먼저 더한 후, b에 대입
		c = a++; // a를 먼저 c에 대입한 후, c에 대입
		System.out.println("a = " + a + "\tb= " + b + "\tc = " + c);
	}
}
