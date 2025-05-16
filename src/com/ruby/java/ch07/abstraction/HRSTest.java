package com.ruby.java.ch07.abstraction;
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
	@Override
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	@Override
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 *12*2");
	}
	
}

abstract class Manager extends Employee{
	@Override
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}
}

class Director extends Manager{
	
//	@Override
//	public void calcSalary() {
//		System.out.println("Director 급여 = 기본급 + 팀 성과 수당");
//	}

	@Override
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
	
}

public class HRSTest {

	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		//Manager m = new Manager();
		Director d = new Director();
		
		s.calcSalary();
		s.calcBonus();
		c.calcSalary();
		c.calcBonus();
		//m.calcSalary();
		d.calcSalary();
		d.calcBonus();

	}

}
