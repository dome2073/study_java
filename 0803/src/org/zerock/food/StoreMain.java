package org.zerock.food;

import java.util.Arrays;
import java.util.Scanner;

//god class
public class StoreMain {
	public static void main(String[] args) {
		// 음식점의 목록을 배열 arr로 선언 = 
		//1. Store배열을 가져온다 (가 데이터를 배열로 입력해준다 (맛집정보)	
		StoreVO[] vo = new StoreVO[] {
			new StoreVO("우래옥", 37.568386, 126.998756),
			new StoreVO("지리산왕재봉흑돼지", 37.550624, 127.126389),
			new StoreVO("영동족발", 37.484760, 127.038022),
			new StoreVO("황소고집", 37.568775, 126.986073),
			new StoreVO("하남돼지집 구로디지털점", 37.484458, 126.901877),
			new StoreVO("정식당", 37.525697, 127.041080),
		};
		
		// 사용자에게 현재 위치를 물어본다. /위도 /경도 =
		//2. 현재위치를 받는다.
		//위치 = 경도, 위도
		Scanner sc = new Scanner(System.in);
		System.out.println("경도를 입력하세요");
		double lat = sc.nextDouble(); //경도 받기
		System.out.println("위도를 입력하세요");
		double lng = sc.nextDouble(); //위도 받기
		
		
		//3.
		//배열을 루프
		//최소값이 되는 가게 구하기 - 가장 가까운 가게 구하기
		Arrays.sort(vo, (s1,s2) -> {
			
			double d1 = s1.calcDistance(lat, lng);
			double d2 = s2.calcDistance(lat, lng);
			
			return d1>d2?1:-1;
			
		});
		//정렬된 결과 = 최솟값이 되는 가게
		System.out.println(vo[0]);
		
	}
}

