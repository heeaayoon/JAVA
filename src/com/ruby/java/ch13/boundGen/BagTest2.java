package com.ruby.java.ch13.boundGen;


class Bag2<T extends Solid2>{
	private T thing;
	private String owner;
	
	public Bag2(T thing) {
		this.thing = thing;
	}

	public T getThing() {
		return thing;
	}

	public void setThing(T thing) {
		this.thing = thing;
	}
	

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	boolean isSameOwner(Bag2<?> obj) {
		if(this.owner.equals(obj.getOwner())){
			return true;			
		}
		return false;
		
	}
	void showType() {
		System.out.println("T의 타입은 "+thing.getClass().getName());
	}
	
}

class Solid2{}
class Liquid2{}

class Book2 extends Solid2{}
class PencilCase2 extends Solid2{}
class NoteBook2 extends Solid2{}

class Water2 extends Liquid2{}
class Coffee2 extends Liquid2{}

public class BagTest2 {

	public static void main(String[] args) {
		Bag2<Book2> bag = new Bag2<>(new Book2());
		Bag2<PencilCase2> bag2 = new Bag2<>(new PencilCase2());
		Bag2<NoteBook2> bag3 = new Bag2<>(new NoteBook2());
		
		bag.setOwner("ss");
		bag2.setOwner("ss");
		boolean result = bag.isSameOwner(bag2);
		if(result) System.out.println("소유자가 동일합니다");
		else System.out.println("소유자가 다릅니다.");
	}

}
