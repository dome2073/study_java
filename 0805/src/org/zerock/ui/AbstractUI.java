package org.zerock.ui;

import java.security.ProtectionDomain;
import java.util.Scanner;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class AbstractUI implements CommonUI {
	
	private Scanner scanner;
	

	
	protected void print(String msg) {
		System.out.println(msg);
	}
	
	protected String printStr(String msg) {
		print(msg);
		return scanner.nextLine();
	}
	
	protected int printInt(String msg) {
		return Integer.parseInt(printStr(msg));
	}

}
