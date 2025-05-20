package com.ruby.java.ch08.innerclass;

public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList();
		myList.print();
		myList.remove("JSP");
		
		myList.add("JAVA");
		myList.print();
		
		myList.add("JSP");
		myList.print();
		
		myList.add("Servelet");
		myList.print();
		
		myList.remove("JSP");
		myList.print();
	}

}
