package com.ruby.java.ch12;

//입력스트림의 종류(FileInputStream,FileReader)에 따라 다른 문자 읽는 방식
//stream 계열은 1바이트 단위로 읽거나 씀
//reader 계열은 글자 하나하나 단위로 읽거나 씀
import java.io.FileInputStream;
import java.io.FileReader;

public class Test01_01 {

	public static void main(String[] args) {
		try(FileInputStream fi = new FileInputStream("tt.txt")){
			int c = 0;
			while ((c=fi.read())!=-1) {
			 // System.out.print((char)c+":");
			  System.out.print(c+" ");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		try(FileReader fi = new FileReader("tt.txt")){
			int c = 0;
			while ((c=fi.read())!=-1) {
				System.out.print(c+":");
			    System.out.print((char)c+" ");;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
