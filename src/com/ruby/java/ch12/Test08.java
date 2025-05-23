package com.ruby.java.ch12;
//Properties 파일 : 키-값으로 데이터를 저장

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

public class Test08 {

	public static void main(String[] args) {
		try(Reader reader = new FileReader("user.properties")){
			Properties user = new Properties();
			user.load(reader);
			
			System.out.println(user.getProperty("id"));
			System.out.println(user.getProperty("password"));
			System.out.println(user.getProperty("name"));
			System.out.println(user.getProperty("ss"));
			System.out.println(user.getProperty("d"));
		}catch(Exception e) {
			e.getMessage();
		}
	}
}
