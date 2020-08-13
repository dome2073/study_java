package org.zerock.th1;

public class ToyHorseRace {
	public static void main(String[] args) {
		
		ToyHorse[] arr = new ToyHorse[4];
		
		arr[0] = new ToyHorse("1번마");
		arr[1] = new ToyHorse("2번마");
		arr[2] = new ToyHorse("3번마");
		arr[3] = new ToyHorse("4번마");
		
		//말마다 따로따로 돌아야 하는 경우 extends thread
		
		//동시에 실행했으면 하는 작업 --gallop()
		for (int i = 0; i < arr.length; i++) {
			ToyHorse horse = arr[i];
			
			//
			horse.start();
		}
		
	}
}
