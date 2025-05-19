package com.ruby.java.ch08.ex05;

public class ex05_main {
	
	public static void displayVehicles(Vehicle [] a) {
		for (Vehicle v : a) {
			v.showVehicle();//v의 타입을 실행 시간에 확인하여 해당 클래스의 메소드로 바인딩
		}
	}

	public static void main(String[] args) {
		Vehicle [] arr = new Vehicle[5];
		arr[0] = new Truck(33);
		arr[1] = new Car(4);
		arr[2] = new Taxi(2, 9000);//생성자가 super()를 사용
		arr[3] = new Truck(22);
		arr[4] = new MotorCycle(12000);
		displayVehicles(arr);
		System.out.println();
		
		Vehicle v = new Vehicle() { //Vehicle 인터페이스를 이용해 익명 객체 생성
			public void showVehicle() {
				System.out.println(" 익명 클래스를 이용해 익명 객체를 생성함 ");
			}
		};
		
		v.showVehicle();
	}
	}
