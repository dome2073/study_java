package org.zerock.burger;

import java.util.Scanner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BurgerFront {

	private Scanner scanner;
	private BurgerCook cook;
	
	public void order() {
		System.out.println("������ �غ� �ϰ� Enter");
		
		scanner.nextLine();
		
		cook.makeBurger();
	}
	
	
}
