package com.ruby.java.ch09.API;

import java.util.Arrays;

/*
도서 관리 시스템은 다양한 책을 관리하고, 고객이 도서를 대여하거나 반납할 수 있게 하는 기능을 제공합니다. 
또한, 고객의 대여 기록을 관리하고, 특정 조건에 맞는 책을 검색하거나 필터링하는 기능도 구현합니다.

1단계: 기본 클래스 및 컬렉션 사용
목표: Book 클래스 생성 및 기본 컬렉션 사용

설계:
Book 클래스 -> 제목, 저자, 출판 연도, ISBN 등을 속성으로 가짐
Library 클래스 -> 도서 목록을 관리하는 기능 (책 추가, 책 목록 출력)

과제:
Book 클래스를 작성하고 도서 정보를 담는 객체를 생성하세요.
Library 클래스를 작성해 ArrayList를 사용하여 도서를 관리하고, 도서 목록을 출력하세요.
*/

// Book 클래스
class Book {
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

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

}

// Library 클래스
class Library {
	static final int CAPACITY = 20;
	private Book[] books; //Book 클래스 타입의 배열을 필드로 가짐
	private int top; //인덱스 역할
	
	//생성자
	public Library() {
		books = new Book[CAPACITY];
	}
	
	//책을 추가하는 메소드
	public void addBook(Book book) {
		if(top<books.length) {
		 books[top] = book;
		 top++;
		}
	}
	
	//책의 정보를 출력하는 메소드
	public void printBooks() {
		for(int i = 0; i<top; i++) {
			System.out.println(books[i]);
		}
	}
	
	//제목을 이용해 책을 분류하는 메소드
	public void sortBooksByTitle() {
//		//제목만 배열에 넣기 -> 새로운 배열을 만들어서 제목배열을 sort하기 //해보기!!!!!
//		Book[] newBooks = new Book[top];
//		for(int i=0;i<top; i++) {
//			newBooks[i] = books[i].getTitle();
//		}
//		
//		for(int i=0;i<top; i++) {
//			Arrays.so
//		}
		
		//람다식
		Arrays.sort(books, 0, top, (b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
	}

	//ISBN을 이용해 책을 분류하는 메소드 
	public void sortBooksByISBN() {
		Arrays.sort(books, 0, top, (b1, b2) -> Integer.parseInt(b1.getIsbn()) - Integer.parseInt(b2.getIsbn()));
	}
	
	//제목으로 책을 찾는 메소드
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

public class Exercise01 {
	public static void main(String[] args) {
		Library library = new Library();

		// 5개의 Book 객체 초기화
		Book book1 = new Book("자바", "강감찬", 1995, "12");
		Book book2 = new Book("파이썬", "이순신", 2008, "9");
		Book book3 = new Book("C++", "을지문덕", 2008, "8");
		Book book4 = new Book("자료구조", "연개소문", 1994, "45");
		Book book5 = new Book("리액트", "김춘추", 1999, "7");
		//System.out.println(book1);
		// 책 추가
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book4);
		library.addBook(book5);
		
		// 제목 정렬 전, 도서 목록 출력
		System.out.println("=======제목정렬전=======");
		library.printBooks();
		// 도서 목록 정렬
		library.sortBooksByTitle();
		// 제목 정렬 후, 도서 목록 출력
		System.out.println("=======제목정렬후=======");
		library.printBooks();
		System.out.println();
		
		// ISBN 정렬 전, 도서 목록 출력
		System.out.println("=======ISBN정렬전=======");
		library.printBooks();
		// 도서 목록 정렬
		library.sortBooksByISBN();
		// ISBN 정렬 후, 도서 목록 출력
		System.out.println("=======ISBN정렬후=======");
		library.printBooks();
		System.out.println();
		
		
		// 특정 제목으로 도서 검색
		String searchTitle = "자바";
		Book foundBook = library.searchBookByTitle(searchTitle);
		if (foundBook == null)
			System.out.println(searchTitle+"책이 없습니다.");
		else {
			System.out.println("<도서명으로 검색한 도서>" );
			System.out.println(foundBook.toString());	
		}
		
	}
}