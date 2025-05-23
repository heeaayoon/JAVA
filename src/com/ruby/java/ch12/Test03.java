package com.ruby.java.ch12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test03 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("이름을 입력하세요 : ");
			String name = br.readLine(); //readLine() : 엔터키가 입력된 곳까지 한번에 받아와서 
			System.out.println("Hello, " + name); //출력됨
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
