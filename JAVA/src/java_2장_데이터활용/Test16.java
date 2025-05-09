package java_2장_데이터활용;

public class Test16 {

	public static void main(String[] args) {
		// 타입 캐스팅
		byte i = 10;
		byte j = 20;
		//byte k = i + j; //자바에서 연산결과는 int 타입으로 저장됨
		int k1 = i + j;
		byte k2 = (byte)(i + j);
		System.out.println(k1);
		System.out.println(k2);
	}

}
