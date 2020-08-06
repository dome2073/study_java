package org.zerock.shop;

import java.util.Arrays;

//
public class MenuTest {
	public static void main(String[] args) {
		
		Arrays.stream(Menu.values())
		.forEach(menu ->System.out.println(menu.getName() + ":" + menu.getPrice() )
		);
		
	}
}
