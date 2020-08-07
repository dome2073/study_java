package org.zerock.bub;

import java.util.Scanner;

public class SelectUI {

	private Scanner scanner;
	private SelectBoxService box;
	
	public SelectUI(Scanner scanner) {
		this.scanner = scanner;
	}
	
	public void playGame() {
		System.out.println("How many ?");
		int count = Integer.parseInt(scanner.nextLine());
		box = new SelectBoxServiceImpl(count);
		
		for (int i = 0; i < count; i++) {
			System.out.println("마음의 준비를 하고 Enter");
			scanner.nextLine();
			Paper paper = box.getNext();
			System.out.println(paper);
			
		}
	}
}














