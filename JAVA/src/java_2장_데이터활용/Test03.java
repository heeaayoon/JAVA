package java_2장_데이터활용;

public class Test03 {

	public static void main(String[] args) {

		// 정수타입 변수
		byte age; // byte : 1byte (-2^7 ~ 2^7-1)
		short point; // short : 2byte(-2^15 ~ 2^15-1)
		int price; // int : 4byte (-2^31 ~ 2^31-1)
		long totalSales; // long : 8byte (-2^63 ~ 2^63-1)

		age = 23;
		point = 32000;
		price = 38389388;
		// totalSales = 2147483648; //The literal 2147483648 of type int is out of range
		// 에러발생
		totalSales = 2147483648L; // 정수의 기본타입은 int이므로 long 타입을 선언하려면 정수리터럴 뒤에 L/l 붙이기

		System.out.println(age);
		System.out.println(point);
		System.out.println(price);
		System.out.println(totalSales);
	}

}
