package com.ruby.java.ch05객체;

public class CarTest {

	public static void main(String[] args) {
		 	Car car1 = new Car("Hyundai", "Sonata", 1400, 4600, 1800, 95);
	        Car car2 = new Car("BMW", "M3", 1200, 4500, 1700, 110);

	        // 도로별 제한 속도 설정
	        int cityLimit = 50;  // 도심 제한 속도
	        int highwayLimit = 100; // 고속도로 제한 속도

	        // 과속 여부 확인
	        System.out.println("도심 주행 테스트:");
	        car1.checkSpeeding(cityLimit); // 도심에서 주행
	        car2.checkSpeeding(cityLimit);
	        car1.checkSpeeding(); // method overloading
	        car2.checkSpeeding(); // method overloading
	        
	        System.out.println("고속도로 주행 테스트:");
	        car1.checkSpeeding(highwayLimit); // 고속도로에서 주행
	        car2.checkSpeeding(highwayLimit);
	        
	        System.out.println("차량 크기 분류:");
	        System.out.println(car1.getSegment());
	        System.out.println(car2.getSegment());
	        
	        System.out.println("차량 객체의 출력:");
	        System.out.println(car1);
	        System.out.println(car2);
	}

}
