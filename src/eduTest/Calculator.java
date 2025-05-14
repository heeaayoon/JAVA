package eduTest;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// 두 수를입력받아서곱을출력하세요.
		//앞의수를 뒤의수로 나누어서 몫과 나머지를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("곱 : "+a+"*"+b+"="+a*b);
		System.out.println("몫 : "+a+"/"+b+"="+a/b);
		System.out.println("나머지 : "+a+"-("+b+"*"+a/b+")="+a%b);
	}

}
