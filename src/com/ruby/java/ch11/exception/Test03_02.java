package com.ruby.java.ch11.exception;

import java.io.FileInputStream;
import java.io.IOException;

//try ~ with ~ resources 문 : finally 블록 없이 try-catch 문이 완료되면 예외처리가 종료됨

public class Test03_02 {

	public static void main(String[] args) {
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("a4.txt"); 
			int c = fi.read();
			//fi.read(null);
			System.out.println((char) c);
		} catch (IOException e) {
			if (fi != null) {
				try {
					fi.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			if (fi != null) {
				try {
					fi.close();//해제문을 포함해야 한다 
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
