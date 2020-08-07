package org.zerock.org.DataStructure;

import java.util.HashMap;
import java.util.Map;

//어제 만든 알파벳 비교의 idx를 hashmap으로 바꿔보기
public class Letter {
	public static void main(String[] args) {
		Map<Character, LetterCount> map = new HashMap<>();
		
		map.put('a', new LetterCount('a',0));
		map.put('b', new LetterCount('a',0));
		map.put('c', new LetterCount('a',0));
		
		String str = "aaaabbbbcccc";
		
		//글자 쪼개기
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			
			char ch = arr[i];
			//null == map에 없을경우
			if(map.get(ch) == null) {
				continue;
			}
			
			
			//Integer는 불변이기 때문에 value ++을 해도 값이 증가하지않는다.
			//value++;
			//put으로 덮어써야된다..
			//좋지않은 코드이다/
			map.get(ch).inc();
		}
		//키를 찾을때 해시코드를 쓴다.
		//자료구조를 사용할 일이 있으면 equals and hashcode를 쓰자 
		
		System.out.println(map);
	}
}
