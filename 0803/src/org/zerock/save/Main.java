package org.zerock.save;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Main = 필요한 객체를 만들어주고 실행할 수 있게
		Scanner scanner = new Scanner(System.in);
		PiggySave save = new PiggySave();
		SaveUI ui = new SaveUI(scanner, save);
		
		ui.init();
		
	}

}