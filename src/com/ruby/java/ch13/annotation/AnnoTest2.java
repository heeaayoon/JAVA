package com.ruby.java.ch13.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) //어노테이션이 언제까지 유지될지를 정하는 코드
//어노테이션 선언
@interface Mapping{
	String mode();
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
//어노테이션 선언
@interface Comment{
	String msg();
}

@Mapping(mode = "class", value =100)
@Comment(msg = "Annotation2 클래스")
public class AnnoTest2 {
	//어노테이션 사용
	
	@Mapping(mode = "method", value =200)
	@Comment(msg = "test()메소드")
	public static void test() {
		AnnoTest2 obj = new AnnoTest2();
		try {
			Class<?> c = obj.getClass();
			Annotation annoList[] = c.getAnnotations();
			System.out.println("클래스의 annotation 목록");
			for(Annotation item: annoList)
				System.out.println(item);
			
			Method m = c.getMethod("test");
			annoList = m.getAnnotations();
			System.out.println();
			System.out.println("test() 메소드의 annotation 목록");
			for(Annotation item : annoList)
				System.out.println(item);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		test();
	}

}
