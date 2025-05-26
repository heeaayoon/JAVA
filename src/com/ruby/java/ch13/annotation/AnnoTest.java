package com.ruby.java.ch13.annotation;

//어노테이션 : 정보 제공 목적

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) //어노테이션이 언제까지 유지될지를 정하는 코드
//어노테이션 선언
@interface Check{
	String name();
	int val();
}

public class AnnoTest {
	//어노테이션 사용
	@Check(name ="first", val =123)
	
	public static void test() {
		AnnoTest obj = new AnnoTest();
		try {
			Class<?> c = obj.getClass();
			Method m = c.getMethod("test");
			
			Check check = m.getAnnotation(Check.class);
			System.out.println(check.name()+" : "+check.val());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		test();
	}

}
