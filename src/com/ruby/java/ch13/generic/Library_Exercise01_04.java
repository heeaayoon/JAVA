package com.ruby.java.ch13.generic;

import java.util.ArrayList;

//Overflow 예외 클래스
class OverflowException extends RuntimeException { // 교재 553
	public OverflowException() {
		//super("OverflowException 입니다.");
	}
}

//Underflow 예외 클래스
class UnderflowException extends RuntimeException {
	public UnderflowException() {
		super("UnderflowException 발생");
	}
}

interface MediaBook {
	public String getTitle();
	public String getISBN();
}

//Book 클래스
class Book5 implements MediaBook, Comparable<Book5> {
	private String title;
	private String author;
	private int publicationYear;
	private String isbn;

	// 생성자
	public Book5(String title, String author, int publicationYear, String isbn) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.isbn = isbn;
	}

	@Override
	public int compareTo(Book5 o) {
		return 0;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public String getISBN() {
		return isbn;
	}

	@Override
	public String toString() {
		return "Book5 [title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + ", isbn="
				+ isbn + "]";
	}
}

//class CDBook implements MediaBook, Comparable<CDBook> {
//	private String cdStory;
//	private String artist;
//	private String catalogNumber;
//	
//	@Override
//	public int compareTo(CDBook o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public String getTitle() {
//		return getTitle();
//	}
//	@Override
//	public String getISBN() {
//		return getISBN();
//	}
//}
//
//class USBBook implements MediaBook, Comparable<USBBook> {
//	private String usbName;
//	private int capacity;
//	private String serialNumber;
//	private static String mediaType = "USB";
//	
//	@Override
//	public int compareTo(USBBook o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	@Override
//	public String getTitle() {
//		return getTitle();
//	}
//	@Override
//	public String getISBN() {
//		return getISBN();
//	}
//
//}

class Library<T extends MediaBook> {
	static final int CAPACITY = 5; // 기본 용량을 5로 설정
	private ArrayList<T> items;

	// 생성자
	public Library() {
		items = new ArrayList<>();
	}

	// 책 추가 (용량 초과 시 OverflowException 발생)
	public void addBook(T book) {
		if (items.size() >= CAPACITY) {
			throw new OverflowException();
		}
		items.add(book);
		
	}

	// 책 삭제 (빈 목록에서 삭제 시 UnderflowException 발생)
	public void removeBook() {
		if (items.size() == 0) 
			throw new UnderflowException();
			
		T b = items.remove(items.size() - 1); // 마지막 인덱스를 삭제
		System.out.println(b.getTitle() + "책을 삭제했습니다. ");
	}


	public void printBooks() {
		if (items.size() == 0) {
			System.out.println("더 이상 출력할 책이 없습니다.");
		}
		for (int i = 0; i < items.size(); i++) {
			System.out.println(items.get(i));
		}
	}

	public void sortBooksByTitle() {
		items.sort((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
	}

	public void sortBooksByISBN() {
		//items.sort((b1, b2) -> b1.getISBN().compareTo(b2.getISBN()));
		items.sort((b1, b2) -> {
			int i1 = Integer.parseInt(b1.getISBN());
			int i2 = Integer.parseInt(b2.getISBN());
			
			if(i1 ==i2) return 0;
			if(i1<i2) return -1;
			return 1;
		});
	}

	public T searchBookByTitle(String title) {
		for (int i = 0; i < items.size(); i++) {
			if (title.equals(items.get(i).getTitle())) {
				return items.get(i);
			}
		}
		return null;
	}
}

public class Library_Exercise01_04 {

	public static void main(String[] args) {
		Library<Book5> library = new Library<Book5>();

		// 5개의 Book 객체 초기화
		Book5 book1 = new Book5("자바", "강감찬", 1995, "12");
		Book5 book2 = new Book5("파이썬", "이순신", 2008, "9");
		Book5 book3 = new Book5("C#", "을지문덕", 2008, "8");
		Book5 book4 = new Book5("자료구조", "연개소문", 1994, "45");
		Book5 book5 = new Book5("리액트", "김춘추", 1999, "7");
		Book5 book6 = new Book5("스프링", "홍길동", 2025, "99");
		
		//책 추가
		try {
			library.addBook(book1);
			library.addBook(book2);
			library.addBook(book3);
			library.addBook(book4);
			library.addBook(book5);
			library.addBook(book6); // 이 부분에서 OverflowException 발생 -> catch로 이동
			//도서관의 용량을 초과하여 책을 추가
			Book5 book7 = new Book5("SQL", "이기자", 2024, "34");
			library.addBook(book7); // 이 부분은 아예 실행이 안됨
		} catch (OverflowException e) {
			System.out.println(e.getMessage());// OverflowException 생성시 전달된 메시지 출력
		}

		// 도서 목록 출력
		System.out.println("\n현재 도서 목록:");
		library.printBooks();

		// **제목 기준 정렬 및 출력**
		System.out.println("\n=== 제목 기준 정렬 ===");
		library.sortBooksByTitle();
		System.out.println("제목 정렬 후:");
		library.printBooks();

		// **ISBN 기준 정렬 및 출력**
		System.out.println("\n=== ISBN 기준 정렬 ===");
		library.sortBooksByISBN();
		System.out.println("ISBN 정렬 후:");
		library.printBooks();
		System.out.println();
		

		// 책 삭제
		try {
			library.removeBook(); // 정상 삭제 -> 4권 
			library.removeBook(); // 정상 삭제 -> 3권
			library.removeBook(); // 정상 삭제 -> 2권
			library.removeBook(); // 정상 삭제 -> 1권
			library.removeBook(); // 정상 삭제 -> 0권
			//빈 도서관에서 책을 삭제 
			library.removeBook(); // 이 부분에서 UnderflowException 발생 -> catch문으로 이동
			library.removeBook(); // 이 부분은 아예 실행이 안됨
		} catch (UnderflowException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		// 최종 도서 목록 출력
		System.out.println("최종 도서 목록:");
		library.printBooks();
	}
}