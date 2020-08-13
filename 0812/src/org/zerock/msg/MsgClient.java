package org.zerock.msg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

import com.google.gson.Gson;

public class MsgClient {
	
	//bad code
	public static void main(String[] args) throws Exception{
		
//		while(true) {
			
			//클라이언트
			Scanner keyScanner = new Scanner(System.in);
			//gson
			Gson gson = new Gson();
			System.out.println("1.등록 , 2.조회");
			
			String oper = keyScanner.nextLine();
			//내번호
			int myNum =24;
			String local = "127.0.0.1";
			String server = "192.168.0.83";
			switch (oper) {
			//등록
			case "1":
				System.out.println("누구에게 보내시겠습니까? ");
				//보낼번호
				int to = Integer.parseInt(keyScanner.nextLine());
				System.out.println("내용");
				String text = keyScanner.nextLine();
				
				MsgVO vo = new MsgVO(myNum,to,text);
				
				//json문자열로 변경 (객체-> json)
				String jsonStr = gson.toJson(vo);
				
				//전송하기위해 소켓연결
				Socket socket = new Socket(local,5555);
				//빨대 연결
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				
				
				dos.writeInt(1); //어떤작업?
				dos.writeUTF(jsonStr); //서버는 어떤 json문자를 보냈겠지? 후 
				
				
				
				
				dos.close();
				socket.close();
				
				//24
				break;
				
				//조회
			case "2":
				//전송하기위해 소켓연결
				Socket socket2 = new Socket(local,5555);
				//빨대 연결
				DataOutputStream dos2 = new DataOutputStream(socket2.getOutputStream());
				DataInputStream din2 = new DataInputStream(socket2.getInputStream());
				
				dos2.writeInt(2);
				dos2.writeInt(myNum);
				
				String jsonList =  din2.readUTF();
				System.out.println(jsonList);
				
				din2.close();
				dos2.close();
				socket2.close();
				
				break;
				
			
			default:
				break;
			}
		}
//		}
}
