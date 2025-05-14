package java_2장_데이터활용;

public class Test11 {

	public static void main(String[] args) {
		// 비트 연산자
		int num = 42;
		String bnum = Integer.toBinaryString(num); // Integer.toBinaryString : 10진수를 2진수로 변환하는 메소드
		System.out.println(bnum);
		String st = Integer.toHexString(num);
		System.out.println(st);

	}

}
