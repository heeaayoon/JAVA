package com.ruby.java.ch10;

import java.util.HashMap;

public class Test06 {

	public static void main(String[] args) {
		String word[] = {"BEE", "HEAVEN", "ALTHOUGH","WONDER"};
		String meaning[] = {"호박벌", "천국", "그럼에도 불구하고", "호기심이 들다"};
		
		HashMap<String, String> dic = new HashMap<String, String>();
		
		for(int i =0;i<word.length;i++) {
			dic.put(word[i], meaning[i]);
		}
		
		System.out.println(dic);
		System.out.println(dic.size());

		//get(키) : 해당 키의 값을 추출
		System.out.println("HEAVEN : "+dic.get("HEAVEN"));
		dic.replace("HEAVEN", "아주 행복한 감정");
		System.out.println("HEAVEN : "+dic.get("HEAVEN"));
		
		//containsKey(키) : 해당키를 포함하고 있는지 t/f
		System.out.println(dic.containsKey("BUMBLEBEE"));
		
		//remove(키) : 해당키와 값을 제거
		dic.remove("HEAVEN");
		System.out.println(dic.containsKey("HEAVEN"));
		
		//clear() : 모든 값을 제거함
		dic.clear();
		System.out.println(dic.isEmpty());
		System.out.println(dic.size());
	}

}
