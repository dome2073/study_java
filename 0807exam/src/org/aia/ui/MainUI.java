package org.aia.ui;

import java.util.Scanner;

import org.aia.service.MonsterCaveImpl;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MainUI {
	
	private MonsterCaveImpl monService;
	private Scanner sc;
	
	//���� ���۽� �۵��ϴ� �޼���
	public void Start() {
		//�ʱ� ������ level=1;
		
		int currentlevel = monService.createMonster();
		currentR(currentlevel);
		
		
		nextInt(currentlevel);
		
		
	}
	
	//���� ���带 �����ִ� �޼���
	public void currentR(int level) {
		System.out.println("������� : "+monService.getCurrentRound(level));
	}
	
	//���� ����� �Ѿ�� �޼���
	public void nextInt(int currentlevel) {
		
		System.out.println("���� ����� �Ѿ�÷��� Enter�� �����ּ���");
		
		sc.nextLine();
		
		currentlevel++;
		
		System.out.println(monService.getNext(currentlevel));
		

		nextInt(currentlevel);

	}
	
	
	
}
