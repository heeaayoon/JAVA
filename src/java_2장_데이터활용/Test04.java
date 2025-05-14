package java_2장_데이터활용;

public class Test04 {
	public static void main(String[] args) {
		// 실수타입 변수
		// float(4byte) 
		//double(8byte) 
		//지수는 한자리, 나머지가 가수부분임
		// float exchangeRate = 1136.50; //Type mismatch: cannot convert from double to float
		float exchangeRate = 1136.50F; // 실수의 기본타입은 double이므로 float 타입의 값을 선언하려면 실수리터럴 뒤에 F/f 붙이기
		double USAAmount = 600.50;
		double KRWAmount = 682468.25;

		System.out.println(exchangeRate);
		System.out.println(USAAmount);
		System.out.println(KRWAmount);

	}

}
