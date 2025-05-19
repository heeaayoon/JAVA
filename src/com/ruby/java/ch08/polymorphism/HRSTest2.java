package com.ruby.java.ch08.polymorphism;
//추상클래스의 상속
//추상클래스의 자식 클래스는 반드시 메소드 오버라이드 하기!!!
//오버라이드 하지 않으면 자식클래스도 추상클래스가 되버림

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee{
	int annual_sales; //연간 판매실적
	@Override
	public void calcSalary() {
		System.out.println("Salesman 급여 = 기본급 + 판매수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Salesman 보너스  = 기본급 * 12 * 4");
		
	}
}

class Consultant extends Employee{
	int num_project; //컨설팅 참여 수 
	@Override
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 *12*2");
	}
	
}

class Manager extends Employee{
	int num_team; //관리하는 팀 수
	@Override
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Manager 보너스  = 기본급 *12*6");
	}
}

class Director extends Manager{
	
	@Override
	public void calcSalary() {
		System.out.println("Director 급여 = 기본급 + 팀 성과 수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
	
}

public class HRSTest2 {
	public static void calcTax(Employee e) {
		if(e instanceof Salesman) {
			Salesman s = (Salesman)e;
			s.annual_sales = 65000;
			System.out.println("세일즈맨입니다.");
			System.out.println(s.annual_sales); //Employee() 부모 클래스에 해당 필드가 들어있지 않았으므로 -> 자식 클래스의 타입으로 타입 캐스팅을 한 후에 자식 클래스의 필드를 사용할 수 있음
		}else if(e instanceof Manager) {
			Manager m = (Manager)e;
			m.num_team = 5;
			System.out.println("매니저입니다.");
			System.out.println(m.num_team);
		}else if(e instanceof Consultant) {
			Consultant c = (Consultant)e;
			c.num_project = 10;
			System.out.println("컨설턴트입니다.");
			System.out.println(c.num_project);
		}else {
			System.out.println("직원입니다.");
		}
	}	
	

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Manager m = new Manager();
		//Director d = new Director();
		
		calcTax(s);
		calcTax(c);
		calcTax(m);
		//calcTax(d);
	}

}
