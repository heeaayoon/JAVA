package com.ruby.java.ch13.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) //어노테이션이 언제까지 유지될지를 정하는 코드
//value 정보를 가지는 Bean 어노테이션 선언
@interface Bean{
	String value();
}

//어노테이션 값 저장 : (이름=값, 이름=값)
//(값) 형식으로 저장해도 자동으로 value의 정보값으로 저장됨
@Bean("Member")
public class AnnoTest5 {

	public static void main(String[] args) {
		AnnoTest5 obj = new AnnoTest5();
		try{
			Class<?> c = obj.getClass();
			Bean b = c.getAnnotation(Bean.class);
			System.out.println(b.value());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
