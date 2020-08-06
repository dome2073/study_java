package org.zerock.dice;


public class Dice {
	
	public static int roll() {
		return (int)(Math.random() *6)+1; //1 ~6
	}
}
