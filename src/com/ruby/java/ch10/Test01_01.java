package com.ruby.java.ch10;
//ArrayList 클래스 활용
import java.util.ArrayList;
import java.util.HashMap;

class Item{
	String name;
	int pid;
	
	public Item(String name, int pid) {
		this.name = name;
		this.pid = pid;
	}
	
	@Override
	public String toString() {
		return name + ":" + pid;
	}
	
}

class ItemA extends Item{
	String size;
	
	public ItemA(String name, int pid, String size ) {
		super(name, pid);
		this.size = size;
	}
	
	@Override
	public String toString() {
		return super.toString() + ":" + size;
	}
}

class ItemB extends Item{
	String color;
	
	public ItemB(String name, int pid, String color) {
		super(name, pid);
		this.color = color;
	}
	
	@Override
	public String toString() {
		return super.toString() + ":" + color;
	}
}


public class Test01_01 {
	public static void main(String[] args) {
		//ItemA a = new ItemA("Name", 100, "XXL");
		//ItemB b = new ItemB("Name", 100, "RED");
		
		ArrayList<Item> list = new ArrayList<Item>(); //넣으려는 객체의 타입 : Item 클래스로 고정 -> Item 클래스와 Item 클래스의 자식 클래스로 만든 인스턴스 모두 들어갈 수 있음
		list.add(new ItemA("Name", 100, "XXL")); //추가하려는 항목은 Item 클래스의 자식 클래스인 ItemA로 생성한 인스턴스여도 가능함
		list.add(new ItemB("Name", 100, "RED")); //동일. ItemB로 생성한 인스턴스도 추가할 수 있음
		
		for(Item i : list) {
			System.out.println(i);
		}
		System.out.println();
		
		//HashMap 클래스를 이용해 키-값 저장, 츨력하기
		HashMap<String, Item> map = new HashMap<>();
		map.put("ItemA",new ItemA("Name", 100, "XXL"));
		map.put("ItemB",new ItemB("Name", 100, "RED"));
		System.out.println(map.get("ItemA"));
		System.out.println();
		
		HashMap<Integer, Item> map2 = new HashMap<>();
		map2.put(1,new ItemA("Name", 100, "XXL"));
		map2.put(2,new ItemB("Name", 100, "RED"));
		System.out.println(map2.get(2));
	}

}
