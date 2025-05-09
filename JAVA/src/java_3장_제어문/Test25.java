package java_3장_제어문;

public class Test25 {

	public static void main(String[] args) {
		/*
		 * System.out.println(1); System.out.println(2); System.out.println(3);
		 * System.out.println(4); System.out.println(5); System.out.println(6);
		 * System.out.println(7); System.out.println(8); System.out.println(9);
		 * System.out.println(10);
		 * 
		 * System.out.print(1+"\t"); System.out.print(2+"\t"); System.out.print(3+"\t");
		 * System.out.print(4+"\t"); System.out.print(5+"\n"); System.out.print(6+"\t");
		 * System.out.print(7+"\t"); System.out.print(8+"\t"); System.out.print(9+"\t");
		 * System.out.print(10+"\t");
		 */

		// 반복문 //무한루프 주의
		// for문
		for (int i = 0; i <= 20; i += 5) {
			System.out.println(i);
		}
		System.out.println("OK");

	}

}
