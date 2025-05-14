package eduTest;

import java.util.Scanner;

public class CalcIncome {

	public static void main(String[] args) {
		// 임의의 변수를 만들어서 일주일간의 수입을 입력하고 총수입과 일일평균수입을 출력하세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("월요일 : ");
		int mon = sc.nextInt();
		System.out.print("화요일 : ");
		int tue = sc.nextInt();
		System.out.print("수요일 : ");
		int wed = sc.nextInt();
		System.out.print("목요일 : ");
		int thu = sc.nextInt();
		System.out.print("금요일 : ");
		int fri = sc.nextInt();	
		
		int sum = mon+tue+wed+thu+fri;
		
		System.out.println("총 수입 : "+ sum+"원");
		System.out.println("일 평균 : "+(double)sum/5+"원");

	}

}
