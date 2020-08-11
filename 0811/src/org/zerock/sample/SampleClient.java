package org.zerock.sample;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SampleClient {
	//bad 
	public static void main(String[] args) throws Exception{
		
		//키보드에서 입력을 받는다
		Scanner keyScanner = new Scanner(System.in);	
		
		System.out.println("INSERT MSG");
		String msg = keyScanner.nextLine();
		
		//입력된값이 완성된 후에 서버에 요청 - 서버의 연결을 최소화하기위해 입력받은 후에 소켓연결
		String local ="127.0.0.1";
		String serverIp = "192.168.0.79";//전달할 서버의 아이피
		Socket socket = new Socket(local, 5555); //소켓연결
		
		OutputStream out = socket.getOutputStream(); //outputsteam생성
		
		out.write((msg +"\n").getBytes("UTF-8")); //데이터 전송 '\n'을 토큰으로
		out.flush(); //파이프에 남아있는 데이터를 다 보낼때 사용
		
		Scanner inScanner = new Scanner(socket.getInputStream(),"UTF-8");
		String msg2 = inScanner.nextLine(); 
		System.out.println(msg2);
		
		
		socket.close();
		//서버에서 응답을 받는다.
		
		
		
	}
}
