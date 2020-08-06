package org.zerock.inhert2;

import java.util.Scanner;

//메인
public class RamanMain {

	public static void main(String... args) throws Exception{
	
		Scanner scanner = new Scanner(System.in);
		
		//클래스이름을 입력하는데로 시작
		Class clz = Class.forName("org.zerock.in2."+ scanner.nextLine());
		
		ARaman raman = (ARaman)clz.getConstructor(null).newInstance(null);
		
		
		System.out.println("RAMAN: " + raman);
		
		RamanMachine machine = new RamanMachine();
		
		machine.cook(raman);
		
	}
}
