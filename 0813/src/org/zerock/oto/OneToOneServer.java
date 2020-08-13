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
//1��1ä�� ����
public class OneToOneServer {
	public static void main(String[] args) throws Exception{
		
		int port = 5555;
		ServerSocket ss = new ServerSocket(port);
		Scanner keyScanner = new Scanner(System.in);
		Gson gson = new Gson();
		System.out.println("Ready .............");
		
		Socket client = ss.accept(); /////��ٸ����� ....... - Blocking
		
		Scanner inScanner = new Scanner(client.getInputStream());
		DataInputStream dis = new DataInputStream(client.getInputStream());
		
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		OutputStream out = client.getOutputStream();
		
		System.out.println(client);
		
		//����� ������
		new Thread(() -> {
			while(true) {

				try {
					
					String myMsg = keyScanner.nextLine();
					
					ChatVO vo = new ChatVO(ss.getInetAddress(),port,myMsg);
					
					String jMsg= gson.toJson(vo); //json���ڿ��� ����
					//json���ڿ� ����
					
					dos.writeUTF(jMsg);
//					out.write(myMsg.getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		
		//�б�� ������
		while(true) {
			
			//--json���� �б� 1. ���ڿ�
			String clientMsg = dis.readUTF();
			ChatVO vo = gson.fromJson(clientMsg, ChatVO.class);
			System.out.println(vo);

			
			//-------------------scanner�� �б�-------------------------------//			
//			String clientMsg = inScanner.nextLine();
//			System.out.println(clientMsg);
			//---------------------------------------------------------------------------
			
		//���Ḧ �� ���
		
		//���󾲷��� 
			
		
		}//end while
		
	}
}
