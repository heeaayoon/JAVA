package eduTest;

import java.util.Scanner;

public class TransformUnit {

	public static void main(String[] args) {
		//임의의 속도를 시속으로 입력받아서 초속, 분속, 마하로출력하세요
		//1 mach = 340 m/s = 1,224 km/h
		Scanner sc = new Scanner(System.in);
		System.out.print("시속을 입력하시오 :");
		double hspeed = sc.nextInt(); //(km/h)
		double mspeed = hspeed/60; //(km/m)
		double secspeed = hspeed/3.6; //(m/s)
		double mach = hspeed*0.6215; //(M/h)
		
		System.out.println("시속 : "+hspeed+"(km/h)");
		System.out.println("분속 : "+mspeed+"(km/m)");
		System.out.println("초속 : "+secspeed+"(m/s)");
		System.out.println("마하 : "+mach+"(M/h)");
		
	}

}
