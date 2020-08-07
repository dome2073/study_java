package org.aia.ui;

import java.util.Scanner;

import org.aia.service.MonsterCaveImpl;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MonsterCaveImpl service = new MonsterCaveImpl();
		
		MainUI mainUI = new MainUI(service, sc);
		
		//���ͻ���
		mainUI.Start();
		
		
		
	}
}
