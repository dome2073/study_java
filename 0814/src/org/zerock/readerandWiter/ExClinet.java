package org.zerock.readerandWiter;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ExClinet {
	//bad
	public static void main(String[] args) throws Exception{
		String local = "127.0.0.1";
		
		Scanner keyScanner = new Scanner(System.in);
		
		System.out.println("input msg");
		
		String str = keyScanner.nextLine();
		
		Socket socket = new Socket(local,5555);
		
		OutputStream out = socket.getOutputStream();
		
		//printwrite¿¬°á
		PrintWriter pw = new PrintWriter(out,true);
		pw.println(str);
		
		
	}
}
