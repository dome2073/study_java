package org.zerock.sample;

import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SampleClient {
	//bad 
	public static void main(String[] args) throws Exception{
		
		//Ű���忡�� �Է��� �޴´�
		Scanner keyScanner = new Scanner(System.in);	
		
		System.out.println("INSERT MSG");
		String msg = keyScanner.nextLine();
		
		//�ԷµȰ��� �ϼ��� �Ŀ� ������ ��û - ������ ������ �ּ�ȭ�ϱ����� �Է¹��� �Ŀ� ���Ͽ���
		String local ="127.0.0.1";
		String serverIp = "192.168.0.79";//������ ������ ������
		Socket socket = new Socket(local, 5555); //���Ͽ���
		
		OutputStream out = socket.getOutputStream(); //outputsteam����
		
		out.write((msg +"\n").getBytes("UTF-8")); //������ ���� '\n'�� ��ū����
		out.flush(); //�������� �����ִ� �����͸� �� ������ ���
		
		Scanner inScanner = new Scanner(socket.getInputStream(),"UTF-8");
		String msg2 = inScanner.nextLine(); 
		System.out.println(msg2);
		
		
		socket.close();
		//�������� ������ �޴´�.
		
		
		
	}
}
