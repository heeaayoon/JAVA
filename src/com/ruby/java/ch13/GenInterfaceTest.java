package com.ruby.java.ch13;
//제너릭 인터페이스

interface Maximum<T extends Comparable<T>>{
	T max();
}

class NumUtil<T extends Comparable<T>> implements Maximum<T>{
	T[] value;
	
	public NumUtil(T[] value) {
		this.value = value;
	}
	
	public T max() {
		T v = value[0];
		for (int i =0;i<value.length;i++) {
			if(value[i].compareTo(v)>0)
				v= value[i];
		}
		return v;
	}
}

public class GenInterfaceTest {

	public static void main(String[] args) {
		Integer[] inum = {1,2,3,4,5};
		Double[] dnum = {1.0,2.0,3.0,4.0,1.5};
		String[] snum = {"a","c","d","g","e"};
		
		NumUtil<Integer> iutil = new NumUtil<Integer>(inum);
		NumUtil<Double> dutil = new NumUtil<Double>(dnum);
		NumUtil<String> sutil = new NumUtil<String>(snum);
		
		System.out.println("inum 최댓값 : "+iutil.max());
		System.out.println("dnum 최댓값 : "+dutil.max());
		System.out.println("snum 최댓값 : "+sutil.max());
	}

}
