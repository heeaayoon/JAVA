package com.ruby.java.ch10;

import java.util.ArrayList;

//Book 클래스
class Book implements Comparable<Book>{
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
		
		@Override
		public int compareTo(Book b) {
			return title.compareTo(b.title);
		}
	}


class Library {
	static final int CAPACITY = 5; // 최대 용량을 5로 설정
	private ArrayList<Book> books;
	
	//생성자
	public Library() {
		books = new ArrayList<Book>();
	}

	// 책 추가 (용량 초과 시 OverflowException 발생)
	public void addBook(Book book) {
		if(books.size()<5) {
			books.add(book);
		}
	}

	// 책 삭제, 마지막 인덱스만 삭제 (빈 목록에서 삭제 시 UnderflowException 발생)
	public void removeBook() {
		if(books.size()<1) {
			System.out.println("삭제할 책이 없습니다.");
		}else {
			Book b = books.remove(books.size()-1); //마지막 인덱스를 삭제
			System.out.println(b.getTitle()+"책을 삭제했습니다. ");
		}
	}

	public void printBooks() {
		if(books.size()==0) {
			System.out.println("더 이상 출력할 책이 없습니다.");
		}
		for(int i = 0; i<books.size(); i++) {
			System.out.println(books.get(i));
		}
	}

	public void sortBooksByTitle() {
		books.sort((a, b) ->a.compareTo(b));
	}

	public void sortBooksByISBN() {
		books.sort((a, b) ->a.compareTo(b));
	}

	public Book searchBookByTitle(String title) {
//		for(int i =0;i<books.size();i++) {
//			if (books.get(i).getTitle().compareTo(title)==0) {
//				return books.get(i);
//			}		
		return null;
	}
}

public class exercise01 {
	public static void main(String[] args) {
		Library library = new Library();

		// 5개의 Book 객체 초기화
		Book book1 = new Book("자바", "강감찬", 1995, "12");
		Book book2 = new Book("파이썬", "이순신", 2008, "9");
		Book book3 = new Book("C#", "을지문덕", 2008, "8");
		Book book4 = new Book("자료구조", "연개소문", 1994, "45");
		Book book5 = new Book("리액트", "김춘추", 1999, "7");
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
		
		// 특정 제목으로 도서 검색
		String searchTitle = "자바";
		Book foundBook = library.searchBookByTitle(searchTitle);
		if (foundBook == null)
			System.out.println(searchTitle+"책이 없습니다.");
		else {
			System.out.println("<도서명으로 검색한 도서>" );
			System.out.println(foundBook.toString());	
		}
		System.out.println();

		library.removeBook(); // 정상 삭제
		library.removeBook(); // 정상 삭제
		library.removeBook(); // 정상 삭제
		library.removeBook(); // 정상 삭제
		library.removeBook(); // 정상 삭제
		// 도서 목록 출력
		library.printBooks();
	}
}