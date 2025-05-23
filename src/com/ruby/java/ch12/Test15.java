package com.ruby.java.ch12;

//직렬화 

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test15 {

	public static void main(String[] args) {
		UserBean user = new UserBean("p", "오정임", "010-", "서울");
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.txt"))){
			out.writeObject(user);
		}catch(Exception e) {
			e.getMessage();
		}
	}

}
