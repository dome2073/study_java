package org.zerock.save;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Main = �ʿ��� ��ü�� ������ְ� ������ �� �ְ�
		Scanner scanner = new Scanner(System.in);
		PiggySave save = new PiggySave();
		SaveUI ui = new SaveUI(scanner, save);
		
		ui.init();
		
	}

}