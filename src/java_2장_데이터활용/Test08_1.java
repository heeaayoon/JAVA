package java_2장_데이터활용;

public class Test08_1 {

	public static void main(String[] args) {
		// 부호 연산자 = negation 연산자
		int a = 10;
		// short num1 = -a; //부호 정보 변경의 결과는 int 타입으로 처리되므로, short 타입에 바로 저장될 수 없다.
		short num1 = (short) -a; // 강제 타입 변환하거나
		int num2 = -a; // int 타입으로 저장해야 함
		System.out.println(num1);
		System.out.println(num2);
	}

}
