package com.ruby.java.ch08.ex07;

public class LinkedList {
	
	Node first = null;
	
	void insert(int data) {
		Node temp = new Node(data);
		if (first == null) {
			first = temp;
		}else {
			Node app = first;
			while(app.link!=null) {
				app = app.link;
			}
			app.link = temp;
		}
	}
	
	void showList() {
		System.out.println();
		if(first == null) {
			System.out.println("입력된 데이터가 없습니다.");
		}else {
			System.out.println("입력된 데이터는 다음과 같습니다.");
			Node p = first;
			while (p!=null) {
				System.out.print(p.data+"->");
				p = p.link;
			}
			System.out.println();
		}
		
	}
}
