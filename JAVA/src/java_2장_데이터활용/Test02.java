package java_2장_데이터활용;

public class Test02 {

	public static void main(String[] args) {
		// 변수 선언과 초기화
		int depositAmount;
		depositAmount = 50000;
		System.out.println(depositAmount);

		// boolean 타입 : true / false (1byte)
		boolean isMarried = false;
		System.out.println("isMarried : " + isMarried);
		isMarried = true;
		System.out.println("isMarried : " + isMarried);

		// 문자 타입 : '한글자 문자' (2byte)
		char ch = 'A'; // 'A'의 유니코드 = 65
		int num = ch;
		System.out.println(num);

		num += 1;
		// ch = num; //int(2byte)->char(1byte) 변환시 데이터 크기 차이 때문에 변환불가
		ch = (char) num; // 강제타입변환으로 변환시킴
		System.out.println(ch);

		// 특수문자 "\"
		System.out.println(ch + "\b" + ch);

		// 참조타입_String 타입 : "문자열"의 주소 저장 /= 문자타입 : 문자 그 자체를 저장
		String greeting = "Good morning";
		System.out.println(greeting);

		String name = "Amy";
		System.out.println(name.length()); // 변수.length() : 변수의 길이
		System.out.println(name.getBytes()); // 변수.getBytes() : 문자열을 바이트코드로 변환해주는 코드

	}
}
