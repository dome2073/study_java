package org.zerock.food2;

import java.util.Arrays;

//서비스 객체 -고객의 모든 요구사항이 반영되어야 한다. 
public class StoreFinder {
	
	//Store 객체배열 생성
	private Store[] arr;
	

	public StoreFinder(Store[] arr) {
		this.arr = arr;
	}
	
	//최소값이 되는 가게 구하기 - 가장 가까운 가게 구하기
	
	public Store findByPosition(Position position) {
		
		Arrays.sort(arr, (s1,s2) -> {
			
			double d1 = s1.getPosition().calcDistance(position);
			double d2 = s2.getPosition().calcDistance(position);
			
			return d1>d2?1:-1;
			
		});
		
		return arr[0];
	}
}
