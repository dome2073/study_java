package org.zerock.org.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
	
	//좋은 예제가 아님
	public static void main(String[] args) {
		
		//원래는 가벼운 객체가 키가 되어야함
		Map<Player, String> map = 
				new HashMap<>();
		
		map.put(new Player(1, "류현진"), "류현진의 커리어는..");
		map.put(new Player(2, "박찬호"), "박찬호의 커리어는..");
		map.put(new Player(3, "추신수"), "추신수의 커리어는..");
		map.put(new Player(4, "선동열"), "선동열의 커리어는..");
		
		Player target = new Player(3, "");
		
		//hashcode를 이용해서 검색을 한다.
		//5번 실행 ..
		//target 이 한번
		//==> 자료구조를 사용하려면 equalsa hashcode를 오버라이드를 해야한다.
		
		String result = map.get(target);
		
		System.out.println(result);
		
		
		
	}
}
