package com.ruby.java.ch12;

import java.io.InputStream;
import java.io.PrintStream;

public class Test02 {

	public static void main(String[] args) {
		try(InputStream keyboard = System.in; PrintStream s = System.out;){
			int c = 0;
			while ((c=keyboard.read())!=-1) {
					s.write(c);
				}
			}catch(Exception e) {
				e.printStackTrace();
				e.getMessage();
			}
	}
}