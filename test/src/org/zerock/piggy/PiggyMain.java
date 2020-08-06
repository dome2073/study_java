package org.zerock.piggy;

import java.util.Scanner;

public class PiggyMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		PiggyBankVO piggyvo = new PiggyBankVO();
		PiggyBankVO piggyvo1 = new PiggyBankVO(2,3);
		PiggyBankVO piggyvo2 = new PiggyBankVO(2,3,4);
	
		//PiggyUI ui = new PiggyUI(sc, new Service());
		PiggyUI ui = new PiggyUI(sc, new Service(piggyvo));
		
		ui.init();
		
//		SaveUI2 ui2 = new SaveUI2(sc);
		
		
	}

}