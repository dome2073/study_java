package org.zerock.shop;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MenuItem {
	
	private Menu menu;
	private int qty;
}
