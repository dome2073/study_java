package org.zerkck.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyWebServer {
	
	//포트 사용중이면 에러
	//0811수업 객체지향 변경 + try-with-resource
	//일반 파일에 대한 서비스 + 동적인 서비스 (fourtune?....)
	//확장자가 aia가 아니면 파일 ----
	public void runServer(int port) throws IOException {
		ServerSocket ss = new ServerSocket(port);
		
		System.out.println("Server Ready....");
		
		
		while(true) {
			
			//시스템상 문제가 있을 수 있는 부분은 try
			try(
				//try-with-resource
				//각각을 close를 안해도됨 -- closeable
				Socket socket = ss.accept();
				InputStream in = socket.getInputStream();
				Scanner inScanner = new Scanner(in);
				OutputStream out = socket.getOutputStream();
				
					
				){
				
				String firstLine = inScanner.nextLine();
				
				//ex) echo?_______
				//정보를 읽어서 request 객체로
				System.out.println(firstLine);
				
				MyWebRequest request = new MyWebRequest(firstLine);
				System.out.println(request);
				
				if(request.getExt().equals("aia") ==false) {
					//일반파일을 요구하는 경우
					//파일이름이랑 outputstream 으로 화면출력
					new MyWebFilelet().doGET(request, out);
					
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}//end while
	}
}
