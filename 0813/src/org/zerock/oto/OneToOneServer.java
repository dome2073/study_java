package org.zerock.oto;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import com.google.gson.Gson;

//b-c
//1대1채팅 서버
public class OneToOneServer {
	public static void main(String[] args) throws Exception{
		
		int port = 5555;
		ServerSocket ss = new ServerSocket(port);
		Scanner keyScanner = new Scanner(System.in);
		Gson gson = new Gson();
		System.out.println("Ready .............");
		
		Socket client = ss.accept(); /////기다리는중 ....... - Blocking
		
		Scanner inScanner = new Scanner(client.getInputStream());
		DataInputStream dis = new DataInputStream(client.getInputStream());
		
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		OutputStream out = client.getOutputStream();
		
		System.out.println(client);
		
		//쓰기용 쓰레드
		new Thread(() -> {
			while(true) {

				try {
					
					String myMsg = keyScanner.nextLine();
					
					ChatVO vo = new ChatVO(ss.getInetAddress(),port,myMsg);
					
					String jMsg= gson.toJson(vo); //json문자열로 변경
					//json문자열 전송
					
					dos.writeUTF(jMsg);
//					out.write(myMsg.getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		//읽기용 쓰레드
		while(true) {
			
			//--json으로 읽기 1. 문자열
			String clientMsg = dis.readUTF();
			ChatVO vo = gson.fromJson(clientMsg, ChatVO.class);
			System.out.println(vo);

			
			//-------------------scanner로 읽기-------------------------------//			
//			String clientMsg = inScanner.nextLine();
//			System.out.println(clientMsg);
			//---------------------------------------------------------------------------
			
		//종료를 할 경우
		
		//데몬쓰레드 
			
		
		}//end while
		
	}
}
