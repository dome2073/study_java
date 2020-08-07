package org.zerock.burger;

import java.util.Scanner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BurgerFront {

	private Scanner scanner;
	private BurgerCook cook;
	
	public void order() {
		System.out.println("마음의 준비를 하고 Enter");
		
		scanner.nextLine();
		
		cook.makeBurger();
	}
	
	
}
