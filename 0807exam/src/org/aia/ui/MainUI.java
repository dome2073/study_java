package org.aia.ui;

import java.util.Scanner;

import org.aia.service.MonsterCaveImpl;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MainUI {
	
	private MonsterCaveImpl monService;
	private Scanner sc;
	
	//게임 시작시 작동하는 메서드
	public void Start() {
		//초기 생성시 level=1;
		
		int currentlevel = monService.createMonster();
		currentR(currentlevel);
		
		
		nextInt(currentlevel);
		
		
	}
	
	//현재 라운드를 보여주는 메서드
	public void currentR(int level) {
		System.out.println("현재라운드 : "+monService.getCurrentRound(level));
	}
	
	//다음 라운드로 넘어가는 메서드
	public void nextInt(int currentlevel) {
		
		System.out.println("다음 라운드로 넘어가시려면 Enter를 눌러주세요");
		
		sc.nextLine();
		
		currentlevel++;
		
		System.out.println(monService.getNext(currentlevel));
		

		nextInt(currentlevel);

	}
	
	
	
}
