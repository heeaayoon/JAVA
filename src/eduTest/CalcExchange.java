package eduTest;

import java.util.Scanner;

public class CalcExchange {

	public static void main(String[] args) {
		//환율이 아래와 같이 주어졌을때 임의의달러를 원화로 계산해서 출력하세요.
		//1 달러 : 1,350원
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1달러 환율을 입력하시오 :");
		int exchange = sc.nextInt();
		
		System.out.print("몇 달러를 환전하고 싶나요? : ");
		int money = sc.nextInt();
		int sum = exchange*money;
		System.out.println("=>"+sum+"원이 필요합니다");
		
	}

}
