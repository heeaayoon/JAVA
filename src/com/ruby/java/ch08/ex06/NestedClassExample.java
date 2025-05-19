package com.ruby.java.ch08.ex06;

//외부 클래스 : NestedClassExample
public class NestedClassExample {
	
	//필드
	private Node head;
	
	//생성자 
	public NestedClassExample() {
		head = null;
	}
	
	//내부 클래스 : Node
	private class Node {
		//내부클래스의 필드
		private String data;
		private Node link;
		//내부클래스의 생성자
		public Node(String data) {
			this.data = data;
		}
	}
	
	//외부 메소드 : add(String data)
	public void add(String data) {
		Node temp = new Node(data); //새롭게 생성된 Node클래스 타입인스턴스
		if (head == null) {
			head = temp;
		}else {
			Node p = head;
			while(p.link!=null) {
				p = p.link;
			}
			p.link = temp;
		}
	}
	
//	public void add(String data) {
//		Node temp = new Node(data); //새롭게 생성된 Node클래스 타입인스턴스
//		Node p = head;
//		Node q = null;
//		if(p == null) {
//			head = p;
//			return;
//		}
//		
//		while (p!=null) {
//			q = p;
//			p = p.link;
//		}
//		q.link = temp; //맨 마지막 head에 값을 집어넣음
//	}
	
	//외부 메소드 : delete(String data)
	public void delete(String data) {
		
	}
	
	//외부 메소드 : printList()
	public void printList() {
		//printList() 결과는 A -> B -> C 등으로 출력한다
		if(head == null) {
			System.out.println("아무것도 입력되지 않았음");
			return;
		}else {
			Node p = head;
			while(p!= null) {
				System.out.print(p.data + " -> ");
				p = p.link;
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		NestedClassExample myList = new NestedClassExample();
		myList.printList();

		myList.add("JAVA");
		myList.printList();
		myList.add("HTML");
		myList.printList();
		myList.add("CSS");
		myList.printList();
		myList.add("Javascript");
		myList.printList();
		
//		myList.delete("CSS");
//		myList.printList();
	}
}
