package org.zerock.multichat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiServer {
	
	//bad
	public static void main(String[] args) throws Exception{
		
		ServerSocket ss = new ServerSocket(5555);
		
		System.out.println("Ready ...........");
		List<PrintWriter> pwList = new ArrayList<>();
		while(true) {
			
			Socket socket = ss.accept();
			System.out.println(socket);
			
			
			//--------------읽기---------------------------
			InputStream in = socket.getInputStream();
			
			Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
			
			BufferedReader br = new BufferedReader(reader);
			
			//--------------쓰기--------------------------------------------
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
			PrintWriter pw = new PrintWriter(osw, true); // printwrite연결
			pwList.add(pw);
			//다른사람의 printWriter 를 알아야함
			
			Map<String,PrintWriter> listmap = new HashMap<>();
			
			listmap.put("정대윤", pw);
			//귀속말 
			//내가 --> 누구한테
			//read,write 두개가 한 싸이클
			new Thread(()->{
				try {
					while(true) {
						//받으면 보내기
						String ClientMsg = br.readLine();
						System.out.println(ClientMsg);
						
						//pw.println("server : " + ClientMsg);
						
						synchronized (pwList) {
							
							pwList.forEach(p -> p.println(ClientMsg));
						}
						
						//사용자가 나가고싶을경우
						//1. arryylist에서 해당 사용자를 뺴야함
						
						//귀속말을 보내고싶을경우
						
						
					}
				}catch(Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					//읽는게 잘못될경우 break
					
				}
				
			}).start();
		}//end while
		
		
	}
}
