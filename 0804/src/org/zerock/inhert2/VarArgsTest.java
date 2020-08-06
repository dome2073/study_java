package org.zerock.inhert2;

import java.util.Arrays;

public class VarArgsTest {

	public static void print(String[] arr ) {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		print(new String[]{"11","22","33"});
		print(new String[]{"11"});
	}
}
