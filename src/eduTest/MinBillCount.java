package eduTest;

import java.util.Scanner;

public class MinBillCount {

	public static void main(String[] args) {
		//천원 미만은 할인하고 임의의금액을 지불하기 위해 필요한 지폐장수를 구하는 프로그램을 작성하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 가격 : ");
		int price = sc.nextInt();
		
		int bill50000 = 0;
		int bill10000 = 0;
		int bill5000 = 0;
		int bill1000 = 0;
		
		if((price/50000)>=1) {
			bill50000 = price/50000;
			System.out.println("5만원권 : "+ bill50000+"장");
			price -= bill50000*50000;
		}
		if((price/10000)>=1) {
			bill10000 = price/10000;
			System.out.println("1만원권 : "+ bill10000+"장");
			price -= bill10000*10000;
		}
		if((price/5000)>=1) {
			bill5000 = price/5000;
			System.out.println("5천원권 : "+ bill5000+"장");
			price -= bill5000*5000;
		}
		if((price/1000)>=1) {
			bill1000 = price/1000;
			System.out.println("1천원권 : "+ bill1000+"장");
			price -= bill1000*1000;
		}
		
		System.out.println("최소장수 : "+(bill50000+bill10000+bill5000)+"장");

		
	}

}
