package com.ruby.java.ch11.exception;

import java.util.ArrayList;
import java.util.Arrays;

//Overflow 예외 클래스
class OverflowException extends RuntimeException {
	public OverflowException() {
		super("OverflowException발생");
	}
}

//Underflow 예외 클래스
class UnderflowException extends RuntimeException {
	public UnderflowException() {
		super("UnderflowException발생");
	}
}

//Book 클래스
class Book implements Comparable<Book> {
	private String title;
	private String author;
	private int publicationYear;
	private String isbn;
	
	//생성자 
	public Book(String title, String author, int publicationYear, String isbn) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return String.format("도서명:%s, 저자:%s, 출판연도:%d, ISBN:%s", title, author, publicationYear, isbn);
	}

	@Override
	public int compareTo(Book b) {
		return title.compareTo(b.title);
	}

	public String getTitle() {
		return title;
	}
	
	public String getIsbn() {
		return isbn;
	}
}

class Library {
	static final int CAPACITY = 5; // 기본 용량을 5로 설정
	private ArrayList<Book> books;
	private int top; //인덱스 역할
	
	//생성자 
	public Library() {
		books = new ArrayList<>();
	}

	// 책 추가 (용량 초과 시 OverflowException 발생)
	public void addBook(Book book) {
		if(books.size()>CAPACITY) {
			try { //예외처리 try~catch문을 실행함
				throw new OverflowException();
			} catch (OverflowException e) {
				System.out.println("추가 용량을 넘어갔습니다.");
			}
		}
	}

	// 책 삭제 (빈 목록에서 삭제 시 UnderflowException 발생)
	public Book removeBook() {
		if(books.size()<0) {
			try { //예외처리 try~catch문을 실행함
				throw new UnderflowException();
			} catch (UnderflowException e) {
				System.out.println("책이 없습니다.");
			}
		}
	}

	public void printBooks(String msg) {
		for(int i = 0; i<top; i++) {
			System.out.println(books);
		}
	}

	public void sortBooksByTitle() {
		Arrays.sort(books, 0, top, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
	}

	public void sortBooksByISBN() {
		Arrays.sort(books, 0, top, (b1, b2) -> Integer.parseInt(b1.getIsbn()) - Integer.parseInt(b2.getIsbn()));
	}

	public Book searchBookByTitle(String title) {
		//String 클래스의 compareTo() 사용 -> 같을 때만 0반환
		for(int i =0;i<top;i++) {
			if (books[i].getTitle().compareTo(title)==0) {
				return books[i];
			}		
		}
		return null;
	}
}

public class exercise01 {
	public static void main(String[] args) {
			ArrayList<Book> LibraryList = new ArrayList<>(); 
			
			// 5개의 Book 객체 초기화
//			Book book1 = new Book("자바", "강감찬", 1995, "12");
//			Book book2 = new Book("파이썬", "이순신", 2008, "9");
//			Book book3 = new Book("C++", "을지문덕", 2008, "8");
//			Book book4 = new Book("자료구조", "연개소문", 1994, "45");
//			Book book5 = new Book("리액트", "김춘추", 1999, "7");
			
			LibraryList.add(new Book("자바", "강감찬", 1995, "12"));
			LibraryList.add(new Book("파이썬", "이순신", 2008, "9"));
			LibraryList.add(new Book("C#", "을지문덕", 2008, "8"));
			LibraryList.add(new Book("자료구조", "연개소문", 1994, "45"));
			LibraryList.add(new Book("리액트", "김춘추", 1999, "7"));
			LibraryList.add(new Book("스프링", "홍길동", 2025, "99"));
			
			
			// 예외 처리를 적용한 책 추가 및 삭제
			// 도서관의 용량을 초과하여 책을 추가시 예외발생
			try {
			} catch (OverflowException e1) {
				e1.getMessage();
			}

			// 도서 목록 출력
			//LibraryList.printBooks("현재 도서 목록:");

			// 빈 도서관에서 책을 삭제시 예외 발생
			try {
			} catch (UnderflowException e2){
				e2.getMessage();
			}

			// 최종 도서 목록 출력
			//library.printBooks("최종 도서 목록:");
		}
}