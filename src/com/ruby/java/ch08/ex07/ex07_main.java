package com.ruby.java.ch08.ex07;

public class ex07_main {
	//배열의 값을 결정하는 메소드
	//배열의 값 : 해당 인덱스번호 * 5 로 지정함
	static int getList(int[] data) {
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			data[i] = i * 5; 
			count++;
		}
		return count;
	}
	
	//배열을 출력하는 메소드
	//윗줄은 인덱스를 출력
	//아랫줄은 인덱스에 들어있는 값을 출력함
	static void showList(int[]data) {
		System.out.println();
		for (int i=0; i < data.length; i++)
			if(i<10) {
			System.out.print(" " + i + " ");
			}else {
				System.out.print(i + " ");
			}
		System.out.println();
		for (int i = 0; i < data.length; i++) {
			if (data[i] < 10) //배열 모양 결정 : 값이 10보다 작으면 앞에 띄어쓰기 한칸을 추가함
				System.out.print(" "); 
			System.out.print(data[i]+ " ");
		}
	}
	
	//배열의 마지막에 값을 추가하는 메소드
	static int[] insertList(int[] data, int x) {
		int[] newList = new int[data.length+1];
		for(int i =0; i<data.length;i++) {
			newList[i] = data[i];
		}
		newList[data.length]=x;
		return newList;
	}
	
	public static void main(String[] args) {
		int[] list = new int[10];
		int count = 0;
		System.out.println("배열로 리스트::");
		count = getList(list);
		showList(list);
		System.out.println();
		
		list = insertList(list, 3);
		showList(list);
		System.out.println();
		
		list = insertList(list, 7);
		showList(list);
		System.out.println();
		
		
		LinkedList ll = new LinkedList();
		ll.showList();

		ll.insert(3);
		ll.showList();
		
		ll.insert(7);
		ll.showList();
	}
}
