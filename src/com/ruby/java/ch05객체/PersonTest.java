package com.ruby.java.ch05객체;

public class PersonTest {

	public static void main(String[] args) {
		//첫번째 객체 생성 및 초기화
        Person p1 = new Person();
        //다음 코드를 setter, addSubjectYear를 사용하여 수정
//        p1.name = "홍길동";
//        p1.age = 25;
//        p1.weight = 60.56f;
//        p1.subjects = new String[] {"Mathematics", "Science", "History"};
//        p1.years = new int[] {2020, 2021, 2022};
        
        p1.setName("홍길동");
        p1.setAge(25);
        p1.setWeight(60.56f);
        p1.setSubject(new String[] {"Mathematics", "Science", "History"});
        p1.setYears(new int[] {2020, 2021, 2022});

        // 메소드 호출
        p1.show();
        System.out.println();
        
        
        //과목과 수강연도를 addSubjectYear()메소드로 추가하기
        p1.addSubjectYear("Music", 2023);
        p1.show();
        
        System.out.println();
        // 두 번째 객체 생성 및 초기화
        Person p2 = new Person();
//        p2.name = "강감찬";
//        p2.age = 55;
//        p2.weight = 62.34f;
//        p2.subjects = new String[] {"Literature", "Philosophy", "Physics"};
//        p2.years = new int[] {2018, 2019, 2020};
        
        p2.setName("강감찬");
        p2.setAge(55);
        p2.setWeight(62.4f);
        p2.setSubject(new String[] {"Literature", "Philosophy", "Physics"});
        p2.setYears(new int[] {2018, 2019, 2020});


        // 메소드 호출
        p2.show();
	}

}
