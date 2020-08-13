package org.zerock.oto;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import com.google.gson.Gson;

public class OneToOneClient {
	public static void main(String[] args) throws Exception{
		
		Scanner keyScanner = new Scanner(System.in);
		String server = "192.168.0.81";
		String local ="127.0.0.1";
		
		int port =5555 ;
		Gson gson = new Gson();
		
		Socket socket = new Socket(local,port);
		Scanner inScanner = new Scanner(socket.getInputStream());
		
		DataInputStream din = new DataInputStream(socket.getInputStream());
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
//		OutputStream out = socket.getOutputStream();
		System.out.println(socket);
		
		
		//while������ 2����������
		//main �̵����°� 1, new Thread 1
		//�б�� ������
		new Thread(()-> {
			
			while(true) {
				
				//---------------------------------------------------------------------------
				
				try {
					String serverMsg = din.readUTF();
					ChatVO Chatvo = gson.fromJson(serverMsg, ChatVO.class);
					System.out.println(Chatvo);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				String serverMsg = inScanner.nextLine();
//				System.out.println(serverMsg);
				//--------------------------------------------------
			}
		}).start();
		
		
		
		
		
		
				
		//����
		while(true) {
			
			System.out.println("�޼����� �Է��ϼ���");
			String msg = keyScanner.nextLine();
//			String msg = keyScanner.nextLine()+"\n";
			
//			MsgVO vo = new MsgVO(myNum,to,text);
			//������ ��ü ����
			ChatVO vo = new ChatVO(socket.getInetAddress(),port,msg);
			String jsonData = gson.toJson(vo);
			
			dos.writeUTF(jsonData);
			//out.write(msg.getBytes());

			//---------------------------------------------------------------------------
//			String serverMsg = inScanner.nextLine();
//			System.out.println(serverMsg);
			//--------------------------------------------------
		}
		
		
		
	}
}
