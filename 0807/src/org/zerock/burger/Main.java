package org.zerock.burger;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		BurgerCook hcook
		  = new InternCook();
		
		Scanner scanner 
		  = new Scanner(System.in);
		
		BurgerFront front 
		= new BurgerFront(scanner, hcook);
		
		front.order();
		
	}
}
