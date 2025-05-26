package com.ruby.java.ch14;
//함수형 스타일 : 람다식 

//기본 인터페이스 선언
interface MyInterface2 {
	void print();
}

//함수형 인터페이스 => 메소드 하나만 가능하다
@FunctionalInterface
interface Multiply2 {
	double getValue();
	//void print();  //함수형 인터페이스에서는 메소드가 1개만 필요함 -> 여러개의 메소드가 있으면 람다식에서 어떤 메소드를 override 할지 알 수가 없음
}

@FunctionalInterface
interface Verify {
	boolean check(int n);// 매개변수를 사용하는 람다식
}

@FunctionalInterface
interface Verify2 {
	boolean check(int n, int d);// 매개변수를 여러개 사용하는 람다식
}

@FunctionalInterface
interface NumberFunc {
	int func(int n);
}

public class Test02 {
	//MyInterface 인터페이스 타입의 메소드 선언 
	public static MyInterface2 test3() {
		return new MyInterface2() { //익명 클래스 생성
			@Override
			public void print() {
				System.out.println("hello");
			}
		};
	}
	public static void main(String[] args) {
		MyInterface2 m1 = test3();
		m1.print();
		System.out.println();
		
		//함수형 스타일의 람다식 구현
		//MyInterface2 인터페이스는 print() 추상메소드를 가짐
		MyInterface2 m2 = () -> System.out.println("hi");// 함수형 인터페이스 - 오직 한 메소드만 구현한다
		m2.print();
		System.out.println();
		
		//Multiply2 인터페이스는 getValue() 추상메소드를 가짐
		Multiply2 m3 = () -> 3.14 * 2; //-> 뒷부분은 getValue() 추상메소드를 override한 내용이 들어감
		System.out.println(m3.getValue());
		m3 = () -> 10 * 3;
		System.out.println(m3.getValue());
		System.out.println();

		//Verify 인터페이스는 check(int n) 추상메소드를 가짐
		Verify isEven = (n) -> (n % 2) == 0;  //-> 뒷부분은 check(int n) 추상메소드를 override한 내용이 들어감
		System.out.println(isEven.check(10)); //true

		//Verify 인터페이스는 check(int n) 추상메소드를 가짐
		Verify isPositive = (n) -> n >= 0; //-> 뒷부분은 check(int n) 추상메소드를 override한 내용이 들어감
		System.out.println(isPositive.check(-5)); //false

		//Verify2 인터페이스는 check(int n, int d) 추상메소드를 가짐
		Verify2 vf = (n, d) -> (n % d) == 0; //-> 뒷부분은 check(int n, int d) 추상메소드를 override한 내용이 들어감
		System.out.println(vf.check(24, 3)); //true
		System.out.println();

		//NumberFunc 인터페이스는 func(int n) 추상메소드를  가짐
		NumberFunc sum = (n) -> { //-> 뒷부분은 func(int n) 추상메소드를 override한 내용이 들어감
			int result = 0;
			for (int i = 0; i <= n; i++) {
				result += i;
			}
			return result;
		};
		System.out.println("1부터 10까지의 합 : " + sum.func(10));
		System.out.println("1부터 100까지의 합 : " + sum.func(100));
	}

}
