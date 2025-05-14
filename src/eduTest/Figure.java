package eduTest;

import java.util.Scanner;

public class Figure {

	public static void main(String[] args) {
		//삼각형 또는 사각형을 선택받는다
		//만약(if)
		//삼각형이면 밑변과 높이를 입력받아서 면적을 계산해서 출력한다.
		//사각형이면 너비와 높이를 입력받아서 면적을 계산해서 출력한다
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("삼각형[t] or 사각형[r] or e[X]it : ");
			String shape = sc.next();
			
			System.out.println(shape.equalsIgnoreCase("t")||shape.equalsIgnoreCase("r")?"면적을 계산하기 위해 값을 입력하시오":"t나 r을 입력하지 않았습니다.");
			if (shape.equalsIgnoreCase("t")) { //변수.equalsIgnoreCase() : 대문자, 소문자 상관없이 받으면 작동함 
				System.out.print("밑변 : ");
				int x = sc.nextInt();
				System.out.print("높이 : ");
				int y = sc.nextInt();
				System.out.println("삼각형의 넓이 :"+ x*y/2);
			} else if (shape.equalsIgnoreCase("r")) {
				System.out.print("너비 : ");
				int x = sc.nextInt();
				System.out.print("높이 : ");
				int y = sc.nextInt();
				System.out.println("사각형의 넓이 :"+ x*y);
			} else if (shape.equalsIgnoreCase("x")) {
				break;
			}
		}
		System.out.println("Bye~~~");
	}

}
