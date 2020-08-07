package org.zerock.org.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
	public static void main(String[] args) {
		//Map(K,V)
		Map<Integer, String> wordMap = new HashMap<>();
		
		//put : 삽입
		//어제 자판기도 이걸 이용할 수 있음
		wordMap.put(1,"AAAA");
		wordMap.put(2,"BBBB");
		wordMap.put(3,"CCCC");
		wordMap.put(4,"DDDD");
		
		System.out.println(wordMap);
		
		//키를 통하여 값을 가져옴
		String result = wordMap.get(4);
		
		System.out.println(result);
		
		//키들출력
		wordMap.keySet().
		forEach(k -> System.out.println(k));
	}
}
