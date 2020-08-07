package org.zerock.org.DataStructure;

import java.util.HashMap;
import java.util.Map;

//���� ���� ���ĺ� ���� idx�� hashmap���� �ٲ㺸��
public class Letter {
	public static void main(String[] args) {
		Map<Character, LetterCount> map = new HashMap<>();
		
		map.put('a', new LetterCount('a',0));
		map.put('b', new LetterCount('a',0));
		map.put('c', new LetterCount('a',0));
		
		String str = "aaaabbbbcccc";
		
		//���� �ɰ���
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			
			char ch = arr[i];
			//null == map�� �������
			if(map.get(ch) == null) {
				continue;
			}
			
			
			//Integer�� �Һ��̱� ������ value ++�� �ص� ���� ���������ʴ´�.
			//value++;
			//put���� �����ߵȴ�..
			//�������� �ڵ��̴�/
			map.get(ch).inc();
		}
		//Ű�� ã���� �ؽ��ڵ带 ����.
		//�ڷᱸ���� ����� ���� ������ equals and hashcode�� ���� 
		
		System.out.println(map);
	}
}
