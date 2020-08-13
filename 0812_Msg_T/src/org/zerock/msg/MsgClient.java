package org.zerock.msg;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

import com.google.gson.Gson;

public class MsgClient {

	//bad code
	public static void main(String[] args) throws Exception{
		
		Scanner keyScanner = new Scanner(System.in);
		
		Gson gson = new Gson();
		
		System.out.println("1.등록, 2.조회");
		
		String oper = keyScanner.nextLine();
		
		int myNum = 0;
		
		switch (oper) {
		case "1":
			System.out.println("누구에게?");
			int to = Integer.parseInt(keyScanner.nextLine());
			System.out.println("내용은요?");
			String text = keyScanner.nextLine();
			
			MsgVO vo = new MsgVO(myNum,to,text);
			
			String jsonStr = gson.toJson(vo);
			
			Socket socket = new Socket("192.168.0.43",5555);
			DataOutputStream dos
			 = new DataOutputStream(socket.getOutputStream());
			
			dos.writeInt(1);
			dos.writeUTF(jsonStr);
			
			dos.close();
			socket.close();
			
			break;
			
		case "2":
			
			Socket socket2 = new Socket("192.168.0.43",5555);
			DataOutputStream dos2
			 = new DataOutputStream(socket2.getOutputStream());
			
			DataInputStream din2
			 = new DataInputStream(socket2.getInputStream());
			
			dos2.writeInt(2);
			dos2.writeInt(myNum);
			
			String jsonListStr = din2.readUTF();
			
			System.out.println(jsonListStr);
			
			din2.close();
			dos2.close();
			socket2.close();
			
			break;

		default:
			break;
		}
		
		
	}
}
