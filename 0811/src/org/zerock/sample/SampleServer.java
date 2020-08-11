package org.zerock.sample;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.xml.ws.handler.MessageContext.Scope;

import org.zerock.handler.EchoHandler;
import org.zerock.handler.Handler;

public class SampleServer {
	//bad 
		public static void main(String[] args) throws Exception{
			ServerSocket ss = new ServerSocket(5555);
			
			System.out.println("Ready .....");
			
			while(true) {
				Socket socket =  ss.accept();
				System.out.println(socket);
				
				Scanner inScanner = new Scanner(socket.getInputStream(),"UTF-8"); //인코딩 지정
				
				String ClinetMsg = inScanner.nextLine();
				System.out.println(ClinetMsg);
				
				
				//'ehco'라고 입력했을 경우
				
				//'by'라고 입력했을 경우
				
				//--> 에코라고 입력햇을 경우 에코클래스실행 , by라고 했을때 by클래스를 실행하는 동적인 서비스를 만들고싶다.
				
				//---------------------------------------------------------
				//getHandler로 Handler(인터페이스)타입 객체를 생성
				Handler handler = PropTest.getHandler(ClinetMsg);
				//handle메서드실행
				String serverMsg = handler.handle("");
				
				System.out.println("-------------------------");
				System.out.println(serverMsg);
				//---------------------------------------------------------
				
				//클라이언트로 보내기
				OutputStream out = socket.getOutputStream();
				out.write((serverMsg+"\n").getBytes("UTF-8"));
				
				socket.close();

			}//end while
			
		}
}
