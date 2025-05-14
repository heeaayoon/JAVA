package eduTest;

import java.util.Scanner;

public class KeyboardInput {

	public static void main(String[] args) {
		//키보드에서 데이터를 입력받아서 화면에 출력하세요
		Scanner sc = new Scanner(System.in); //System.in : 표준 입력 장치 (키보드)
		
		int inum = sc.nextInt(); //정수(4byte)
		double dnum = sc.nextDouble(); //실수(8byte)
		String str = sc.next(); //문자열 //공백 전까지의 단어를 받아옴
		String strline = sc.nextLine(); //문자열(with WhiteSpace : “ “ or tab) //엔터를 치기 전까지의 문자를 모두 받아옴
		
	}

}
