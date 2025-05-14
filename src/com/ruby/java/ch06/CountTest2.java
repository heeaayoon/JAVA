package com.ruby.java.ch06;

class Count1{
	public static int totalCount; //공유 데이터로, 실행 전부터 code영역에 저장됨
	int count; //인스턴스가 만들어진 후에야 힙 영역에 저장됨
}


public class CountTest2 {

	public static void main(String[] args) {
		Count1 c1 = new Count1();
		Count1 c2 = new Count1();
		Count1 c3 = new Count1();
		
		c1.count++; //논정적멤버 호출방법 : 인스턴스 생성후 -> 참조변수.논정적멤버(논정적 필드/논정적 클래스)
		Count1.totalCount++; //정적멤버 호출방법 : 클래스명.정적멤버(정적 필드/정적 클래스)
		System.out.println("Count1 클래스의 정적멤버 totalCount :"+Count1.totalCount+", Count1 클래스의 논정적멤버 count : "+c1.count);
		
		c2.count++;
		Count1.totalCount++;
		System.out.println(Count1.totalCount+" : "+c2.count);
		
		c3.count++;
		Count1.totalCount++;
		System.out.println(Count1.totalCount+" : "+c3.count);
		
		System.out.println("--------");
		System.out.println(Count1.totalCount+" : "+c1.count);
		System.out.println(Count1.totalCount+" : "+c2.count);
		System.out.println(Count1.totalCount+" : "+c3.count);
		
	}

}
