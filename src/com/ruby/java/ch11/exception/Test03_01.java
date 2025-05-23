package com.ruby.java.ch11.exception;

//try - catch - resources : finally 블록 없이 try-catch 문이 완료되면 예외처리가 종료됨

import java.io.FileInputStream;
import java.io.IOException;

public class Test03_01 {

	public static void main(String[] args) {
		// try-catch-resources문
		try (FileInputStream fi = new FileInputStream("a.txt")) {
			int c = fi.read();
			fi.read(null);
			System.out.println((char) c);
		} catch (NullPointerException e1) {
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		} catch (IOException e2) {
			e2.printStackTrace();
			System.out.println(e2.getMessage());
		}
		System.out.println("finally 블록 없이도 예외처리가 종료됨");
	}
}
