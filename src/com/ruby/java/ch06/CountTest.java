package com.ruby.java.ch06;


class Count{
	public static int totalCount; //Static 멤버 //공유 데이터로, 실행 전부터 code영역에 저장됨
	int count1; //Non-Static 멤버 : 인스턴스가 만들어진 후에야 힙 영역에 저장됨 //접근 제한자 default : 동일한 패키지 안에서는 그냥 사용 가능함 
	private int count2; //Non-Static 멤버 : 인스턴스가 만들어진 후에야 힙 영역에 저장됨 //접근제한자 private : get, set메소드를 만들어야 count2 필드 사용 가능함
	
	public int getCount2() {
		return count2;
	}
	public void setCount2(int count2) {
		this.count2 = count2;
	}
	
}


public class CountTest {

	public static void main(String[] args) {
		System.out.println("실행시작");
		Count c1 = new Count();
		c1.count1++;
		//c1.count2++ //count2는  private 필드이므로 바깥에서 접근이 아예 불가함.
		c1.setCount2(10); //대신, set()메소드를 사용해서 count2에 간접적으로 접근 가능함.
		System.out.println("count1 : "+ c1.count1+", count2 : "+c1.getCount2()); //get()메소드를 이용해 count2에 간접적으로 접근함.
	
	}

}
