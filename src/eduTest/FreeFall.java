package eduTest;

import java.util.Scanner;

public class FreeFall {

	public static void main(String[] args) {
		//임의의 상공에서 정지상태의 물체를 가만히 놓아 자유낙하시키려 한다. 
		//높이를 입력하면 지면도착 시간을 아래실행 예와같이 출력하세요. (저항은없고, 중력가속도는9.81m/s로한다.)

		Scanner sc = new Scanner(System.in);
		System.out.print("높이 :");
		
		int height = sc.nextInt();
		double time = Math.sqrt(height*2/9.81);
		System.out.println(time+"초");
	
	}

}
