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
			
			//Ŭ���̾�Ʈ
			Scanner keyScanner = new Scanner(System.in);
			//gson
			Gson gson = new Gson();
			System.out.println("1.��� , 2.��ȸ");
			
			String oper = keyScanner.nextLine();
			//����ȣ
			int myNum =24;
			String local = "127.0.0.1";
			String server = "192.168.0.83";
			switch (oper) {
			//���
			case "1":
				System.out.println("�������� �����ðڽ��ϱ�? ");
				//������ȣ
				int to = Integer.parseInt(keyScanner.nextLine());
				System.out.println("����");
				String text = keyScanner.nextLine();
				
				MsgVO vo = new MsgVO(myNum,to,text);
				
				//json���ڿ��� ���� (��ü-> json)
				String jsonStr = gson.toJson(vo);
				
				//�����ϱ����� ���Ͽ���
				Socket socket = new Socket(local,5555);
				//���� ����
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				
				
				dos.writeInt(1); //��۾�?
				dos.writeUTF(jsonStr); //������ � json���ڸ� ���°���? �� 
				
				
				
				
				dos.close();
				socket.close();
				
				//24
				break;
				
				//��ȸ
			case "2":
				//�����ϱ����� ���Ͽ���
				Socket socket2 = new Socket(local,5555);
				//���� ����
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
