package com.ruby.java.ch07.상속;

public class 실습과제_7장_B1_객체생성 {

	public static void main(String[] args) {
		// 아이템 생성
        Item laptop = new Item("노트북", 1200.00, 10);
        Item tshirt = new Item("티셔츠", 20.00, 50);
        Item phone = new Item("휴대폰", 800.00, 30);
        Item headphones = new Item("헤드폰", 150.00, 20);
        Item mouse = new Item("마우스", 30.00, 15);
        //laptop.show();
        System.out.println(laptop);
        System.out.println();


        // 고객 생성
        Customer boy = new Customer("홍길동", "부산", 21);
        Customer girl = new Customer("계백", "양산", 22);
        //boy.show();
        System.out.println(boy);
        System.out.println();

        // 주문 생성
        System.out.println("주문1입니다");
        Order order1 = new Order(boy, 5); // 최대 5개 아이템
        //order1.show();
        order1.addItem(laptop, 1);
        //order1.orderListShow();
        order1.addItem(tshirt, 2);
        //order1.orderListShow();
        order1.addItem(phone, 1);
        order1.addItem(headphones, 1);
        order1.addItem(mouse, 1);
        order1.orderListShow();
        System.out.println(order1.calculateTotal()+"$");
        System.out.println();
        
        System.out.println("주문2입니다");
        Order order2 = new Order(girl, 5); // 최대 5개 아이템
        order2.addItem(laptop, 1);
        order2.addItem(tshirt, 1);
        order2.addItem(phone, 1);
        order2.addItem(headphones, 1);
        order2.addItem(mouse, 1);
        order2.orderListShow();
        System.out.println(order2.calculateTotal()+"$");
        

        // 주문 요약 출력
        order1.printOrderSummary();
        order2.printOrderSummary();
        
    }
}
