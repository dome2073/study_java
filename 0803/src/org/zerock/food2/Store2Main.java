package org.zerock.food2;

import java.util.Scanner;

public class Store2Main {

	public static void main(String[] args) {

		// 음식점의 목록을 배열 arr로 선언 =
		// 1. Store배열을 가져온다 (가 데이터를 배열로 입력해준다 (맛집정보)
		Store[] store = new Store[] { 
				new Store("우래옥", 37.568386, 126.998756),
				new Store("지리산왕재봉흑돼지", 37.550624, 127.126389), 
				new Store("영동족발", 37.484760, 127.038022),
				new Store("황소고집", 37.568775, 126.986073), 
				new Store("하남돼지집 구로디지털점", 37.484458, 126.901877),
				new Store("정식당", 37.525697, 127.041080), 
				};
		
		Scanner scanner = new Scanner(System.in);

		//가까운 거리에 있는 store을 찾기 위해 필요한 데이터
		StoreFinder finder = new StoreFinder(store);
		
		Position current = new Position(8,9);

		Store nearestStore = finder.findByPosition(current);

		System.out.println(nearestStore.getName());
	}
}
