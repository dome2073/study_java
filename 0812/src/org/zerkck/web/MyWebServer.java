package org.zerkck.web;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyWebServer {
	
	//��Ʈ ������̸� ����
	//0811���� ��ü���� ���� + try-with-resource
	//�Ϲ� ���Ͽ� ���� ���� + ������ ���� (fourtune?....)
	//Ȯ���ڰ� aia�� �ƴϸ� ���� ----
	public void runServer(int port) throws IOException {
		ServerSocket ss = new ServerSocket(port);
		
		System.out.println("Server Ready....");
		
		
		while(true) {
			
			//�ý��ۻ� ������ ���� �� �ִ� �κ��� try
			try(
				//try-with-resource
				//������ close�� ���ص��� -- closeable
				Socket socket = ss.accept();
				InputStream in = socket.getInputStream();
				Scanner inScanner = new Scanner(in);
				OutputStream out = socket.getOutputStream();
				
					
				){
				
				String firstLine = inScanner.nextLine();
				
				//ex) echo?_______
				//������ �о request ��ü��
				System.out.println(firstLine);
				
				MyWebRequest request = new MyWebRequest(firstLine);
				System.out.println(request);
				
				if(request.getExt().equals("aia") ==false) {
					//�Ϲ������� �䱸�ϴ� ���
					//�����̸��̶� outputstream ���� ȭ�����
					new MyWebFilelet().doGET(request, out);
					
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}//end while
	}
}
