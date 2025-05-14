package com.ruby.java.ch05객체;

public class Person {
	/*
	 // 필드
	 name은 String, age는 int, weight는 float로 필드들을 private 선언 
	 subjects을 교육과목 private배열 
	 years을 수강 연도 private 배열 
	 count 필드를 사용하여 수강 과목 증가시마다 ++count
	  
	 // 메소드 
	 void show() { 
	 	//기본 정보 출력:name=**, age=**, weight=**로 출력
		//교육과목 및 수강 연도 출력
		//while 문을 사용하여 교육과목과 수강연도를 출력
	 } 
	 
	 void addSubjectYear(String subject, int year);//과목, 수강연도를 매개변수로 전달받아 배열에 추가
	 */
	
	//필드
	private String name; 
	private int age;
	private float weight;
	private String[] subject; //교육과목
	private int[] years; //수강연도
	int count; //수강과목 증가시마다 카운트 증가

	
	
	
	//메소드
	//이름 정하는 메소드 
	public void setName(String name){
		this.name = name;
	}
	//나이 정하는 메소드
	public void setAge(int age){
		this.age = age;
	}
	//무게 정하는 메소드
	public void setWeight(float weight){
		this.weight = weight;
	}
	//수강과목 정하는 메소드
	public void setSubject(String[] subject){
		this.subject = subject;
	}
	
	//연도 정하는 메소드
	public void setYears(int[] years){
		this.years = years;
	}
	
	//정보를 출력하는 메소드
	//기본 정보 출력:name=**, age=**, weight=**로 출력
	//while 문을 사용하여 교육과목과 수강연도를 출력
	void show() { 
		System.out.println("name = "+this.name+", age = "+this.age+", weight = "+this.weight);
		int i=0;
		while(i<subject.length && i<years.length) {
			System.out.println("과목 : " +subject[i]+", 수강연도 : "+years[i]);
			i++;
		}
	}
	
	//과목, 수강연도를 매개변수로 전달받아 배열에 추가하는 메소드
	void addSubjectYear(String nsubject, int nyear) {
		String[] newSubject = new String[subject.length+1];
		System.arraycopy(this.subject,0, newSubject, 0, this.subject.length);
		newSubject[newSubject.length-1]= nsubject;
		subject = newSubject; //sub
		
		int[] newYears = new int[years.length+1];
		System.arraycopy(years, 0, newYears, 0, years.length);
		newYears[newYears.length-1]=nyear;
		years=newYears;
	}
	
	//과목을 매개변수로 전달받아 배열에 추가하는 메소드
	String[] addSubject(String nsubject) {
		String[] newSubject = new String[subject.length+1];
		System.arraycopy(this.subject,0, newSubject, 0, this.subject.length);
		newSubject[newSubject.length-1]= nsubject;
		return newSubject;
	}
	
	
	

}
