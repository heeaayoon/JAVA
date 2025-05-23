package com.ruby.java.ch12;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;

public class Test05 {

	public static void main(String[] args) {
		try {
			File dir = new File ("C:\\work");
			dir.mkdir();
			
			File file = new File(dir, "file1.txt");
			file.createNewFile();
			
			//파일 또는 디렉토리 여부 판단
			if(dir.isDirectory()) System.out.println(dir.getName()+"은 디렉토리입니다.");
			if(dir.isFile()) System.out.println(file.getName()+"은 파일입니다.");
			
			//파일에 데이터 출력 후 읽기
			if(file.exists()) {
				try(PrintWriter out = new PrintWriter(file)) {
					out.println("Hello java");
				}
				System.out.println("파일 이름 : "+file.getName());
				System.out.println("파일 경로 : "+file.getPath());
				System.out.println("쓰기 가능 : "+file.canWrite());
				System.out.println("읽기 가능 : "+file.canRead());
				System.out.println("파일 길이 : "+file.length());
			}else {
				System.out.println("작업할 파일이 존재하지 않음");
			}
			
			File subDir = new File("C:\\work\\subDir");
			subDir.mkdir();
			File file2 = new File(subDir, "file2.txt");
			file2.createNewFile();
		
			System.out.println("절대경로 : "+file2.getAbsolutePath());
			System.out.println("부모 디렉터리 : "+file2.getParent());
			System.out.println("부모 디렉터리 목록 : "+file.getParentFile());
			          
		}catch(Exception e) {
			e.getMessage();
		}
		

	}

}
