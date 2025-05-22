package com.ruby.java.ch10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class Test07 {

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<>();
		
		dic.put("고", "고생");
		dic.put("분","몸");
		dic.put("권", "실");
		dic.put("교", "가");
		dic.put(null, null);
		
		//Hash 계열, Map 계열은 순서를 보장하지 X
		Set<String> set = dic.keySet();
		Iterator<String> keys = set.iterator();
		//Iterator<String> keys = dic.keySet().iterator(); //위 두줄을 합침
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("%s:%s", key, dic.get(key)));
			//System.out.printf("%s:%s\n", key, dic.get(key));
		}
		
		for(Map.Entry<String, String> elem : dic.entrySet()) {
			System.out.println(String.format("%s:%s", elem.getKey(), elem.getValue()));
		}
		
		for(String key : dic.keySet()) {
			System.out.println(String.format("%s:%s", key, dic.get(key)));
		}

	}

}
