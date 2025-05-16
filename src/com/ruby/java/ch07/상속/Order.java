package com.ruby.java.ch07.상속;

public class Order {
	private Customer customer; // 고객
    private Item[] items; // 주문 제품들
    private int[] quantities; // 주문 제품 수량들
    //private String []orderDates;
    private int count; // 아이템 개수
    double sum; //총액
    
    //생성자
    public Order(Customer customer, int count) {
		this.customer=customer;
		Item[] items = new Item[count];
		int[] quantities = new int[count];
	}

    //초기 주문 내역 출력 메소드
    public void show(){
    	System.out.println("----------------주문 정보-------------------");
    	System.out.println(customer);
    	System.out.println("주문 아이템 종류의 갯수 : "+count);
    	System.out.println();
    }
    
    // 아이템 추가 메소드
    public void addItem(Item item, int orderQuantity) {
    	items[count]= item;
    	quantities[count] = orderQuantity;
    	count++;
//    	 Item[] newItems = new Item[this.items.length+1];
//    	 System.arraycopy(items, 0, newItems, 0, items.length);
//    	 newItems[newItems.length-1]=item;
//    	 items = newItems;
    	 
//    	 int[] newQuantities = new int[quantities.length+1];
//    	 System.arraycopy(quantities, 0, newQuantities, 0, quantities.length);
//    	 newQuantities[newQuantities.length-1]=orderQuantity;
//    	 quantities=newQuantities;
    }
    
  //아이템이 추가된 주문 내역 출력 메소드
    public void orderListShow(){
    	System.out.println("------------주문 아이템과 갯수-------------");
    	for(int i=0;i<items.length;i++) {
    		System.out.println("주문 아이템 종류 : " + items[i].getName() + ", 해당 아이템의 갯수 : "+ quantities[i]);  
    	}
    	System.out.println();
    }
    

    // 총액 계산 메소드
    public double calculateTotal() {
    	for(int i=0;i<items.length;i++) {
    		sum += items[i].getPrice() *quantities[i]; 
    	}
    	System.out.println("-----------총액----------");
		return sum;
  
    }

    // 주문 요약 출력 메소드
    public void printOrderSummary() {
    	System.out.println("주문자 : "+customer.toString());
    	System.out.println("주문 아이템의 종류와 갯수 : ");
    	for(int i=0;i<items.length;i++) {
    		System.out.println(items[i].getName() + " : "+ quantities[i]+"개");  
    	}
    	System.out.println();
    }
}
