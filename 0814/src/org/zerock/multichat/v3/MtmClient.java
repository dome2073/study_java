package org.zerock.multichat.v3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class MtmClient {
	
	//bad code
	public static void main(String[] args) throws Exception{
		
		Scanner keyScanner = new Scanner(System.in);
		
		System.out.println("본인이름 입력");
		String userName = keyScanner.nextLine();
		
		Socket socket = new Socket("127.0.0.1",5555);
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
		PrintWriter pw = new PrintWriter(osw,true);
		
		InputStream in = socket.getInputStream();
		Reader inr = new InputStreamReader(in, StandardCharsets.UTF_8);
		BufferedReader br = new BufferedReader(inr);
		
		System.out.println("메시지를 입력하세요");
		
		pw.println("0:"+userName);
		
		//write thread
		new Thread(() -> {
			while(true) {
				System.out.println("일반메시지 1, 귓속말 2");
				String oper = keyScanner.nextLine();
				
				if(oper.equals("1")) {
					String msg =  userName+":"+keyScanner.nextLine();
					pw.println("1:"+msg);	
				}else if(oper.equals("2")) {
					System.out.println("누구한테?");
					String target = keyScanner.nextLine();
					System.out.println("내용은?");
					String content = keyScanner.nextLine();
					System.out.println("2:"+userName+":"+target+":"+content);
					pw.println("2:"+userName+":"+target+":"+content);
					
				}
				pw.flush();
				
				
				
				
			}//end while
			
		}).start();
		
		//read thread
		new Thread(() -> {
			try {
				while(true) {
					
					System.out.println(br.readLine());
					
				}//end while
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}).start();
		
		
	}

}


















