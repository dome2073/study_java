package org.zerock.org.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
	public static void main(String[] args) {
		//Map(K,V)
		Map<Integer, String> wordMap = new HashMap<>();
		
		//put : ����
		//���� ���Ǳ⵵ �̰� �̿��� �� ����
		wordMap.put(1,"AAAA");
		wordMap.put(2,"BBBB");
		wordMap.put(3,"CCCC");
		wordMap.put(4,"DDDD");
		
		System.out.println(wordMap);
		
		//Ű�� ���Ͽ� ���� ������
		String result = wordMap.get(4);
		
		System.out.println(result);
		
		//Ű�����
		wordMap.keySet().
		forEach(k -> System.out.println(k));
	}
}
