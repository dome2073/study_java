package org.zerock.multichat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MultiClient {
	// bad code
	public static void main(String[] args) throws Exception {
		String server = "192.168.0.81";
		Scanner keyScanner = new Scanner(System.in);

		System.out.println("본인의 이름을 입력하세요");
		String userName = keyScanner.nextLine();
		
		
		Socket socket = new Socket(server, 5555);

		// --------------쓰기---------------------------
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
		PrintWriter pw = new PrintWriter(osw, true); // printwrite연결
	
		// --------------읽기---------------------------
		InputStream in = socket.getInputStream();
		Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
		BufferedReader br = new BufferedReader(reader);

		System.out.println("메세지를 입력하세요 ");
		
		// write Thread .....
		new Thread(() -> {
			while (true) {
				String msg = userName + ":" + keyScanner.nextLine();
				//pw.print(obj);
				pw.println(msg);
			} // end while

		}).start();

		// Read Thread .....
		new Thread(() -> {

			try {
				while (true) {
					
					System.out.println(br.readLine());
					
				}//while
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}).start();
	}

}
