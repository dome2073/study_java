package org.zerock.th1;

public class ToyHorseRace {
	public static void main(String[] args) {
		
		ToyHorse[] arr = new ToyHorse[4];
		
		arr[0] = new ToyHorse("1����");
		arr[1] = new ToyHorse("2����");
		arr[2] = new ToyHorse("3����");
		arr[3] = new ToyHorse("4����");
		
		//������ ���ε��� ���ƾ� �ϴ� ��� extends thread
		
		//���ÿ� ���������� �ϴ� �۾� --gallop()
		for (int i = 0; i < arr.length; i++) {
			ToyHorse horse = arr[i];
			
			//
			horse.start();
		}
		
	}
}
