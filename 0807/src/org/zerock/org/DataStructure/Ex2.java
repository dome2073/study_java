package org.zerock.org.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Ex2 {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		
		map.put('a', 0);
		map.put('b', 0);
		map.put('c', 0);
		
		String str = "aaaabbbbcccc";
		
		//���� �ɰ���
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			
			char ch = arr[i];
			Integer value = map.get(ch);
			//Integer�� �Һ��̱� ������ value ++�� �ص� ���� ���������ʴ´�.
			//value++;
			//put���� �����ߵȴ�..
			//�������� �ڵ��̴�/
			map.put(ch,++value);
		}
		//Ű�� ã���� �ؽ��ڵ带 ����.
		//�ڷᱸ���� ����� ���� ������ equals and hashcode�� ���� 
		
		System.out.println(map);
	}
}
