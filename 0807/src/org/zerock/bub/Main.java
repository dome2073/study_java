package org.zerock.bub;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		SelectUI ui = new SelectUI(scanner);
		
		ui.playGame();
		
	}
}
