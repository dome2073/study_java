package og.zerock.ex1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class StringServer {
	
	//bad
	public static void main(String[] args) throws Exception{
		
		ServerSocket ss = new ServerSocket(5555);
		
		System.out.println("Server Ready...");
		
		while(true) {
			Socket client = ss.accept();
			System.out.println("���ο� �մ� �湮"+client);
			
			//�а� ���� //�������
			InputStream in = client.getInputStream();
			OutputStream out = client.getOutputStream();

			//� ������ ���ڿ��� ���� �𸣴� Scanner�� ���� �Ѷ��� ��
			// \n�� ���� ������� ���� -��������-
			//------�д��۾�-----
			Scanner insc = new Scanner(in);
			String msg = insc.nextLine();
			System.out.println(msg);
			
			//---����-----
			out.write((msg+"\n").getBytes());
			
			
			//��������
			client.close();
			
		}
		
		
	}
}
