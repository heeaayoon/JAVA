package java_2장_데이터활용;

public class Test07 {

	public static void main(String[] args) {
		// 증감연산자
		int a = 10;
		++a;
		System.out.println(a); // 11
		a++;
		System.out.println(a); // 12

		int b = 10;
		--b;
		System.out.println(b); // 9
		b--;
		System.out.println(b); // 8

		// 전위/후위 연산
		int c = 10;
		int d = 10;
		System.out.println(++c); // 전위 증감연산자 : 먼저 1증가 후, 변에 저장 / 증감 먼저 연산 후, 다른 연산을 처리
		System.out.println(d++); // 후위감연산자 : 변수에 저장한 후, 1 증가 / 다른연산을 먼저 처리한 후, 증감연산 처리

	}

}
