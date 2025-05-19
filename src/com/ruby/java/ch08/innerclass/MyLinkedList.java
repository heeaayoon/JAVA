package com.ruby.java.ch08.innerclass;

//외부 클래스
public class MyLinkedList {
	// 외부 필드
	private Node head;

	// 내부 클래스
	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}

	// 외부 메소드 add(String data) : 추가
	public void add(String data) {
		Node newNode = new Node(data);

		if (head == null) {// 최조로 문자를 저장하려면
			head = newNode;
		} else { // 두번째 이상으로 문자를 저장하려면
			Node next = head;
			while (next.link != null) { // 마지막으로 생성된 Node의 링크로 찾아감
				next = next.link;
			}
			next.link = newNode; // 그 곳에 새로 생성된 인스턴스의 값을 저장함
		}
	}
	
	// 외부 메소드 remove(String string) : 삭제
	public void remove(String string) {
		if (head == null) { return; // 아무것도 들어와 있지 않았을 때는 아예 실행을 안함
		} 
		Node next = head;
		Node pre = null;
		
		while (next.link != null) { 
			if(string.equals(next.data)) {
				pre.link = next.link;
				break;
			}
			pre = next;
			next = next.link;
		}
	}

	// 외부 메소드 print() : 출력
	public void print() {
		if (head == null) {
			System.out.println("등록된 데이터가 없습니다.");
		} else {
			System.out.println("등록된 데이터는 다음과 같습니다.");
			Node next = head;
			while (next != null) {
				System.out.println(next.data);
				next = next.link;
			}
			System.out.println();
		}
	}
}
