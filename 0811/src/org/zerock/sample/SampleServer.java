package org.zerock.sample;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.xml.ws.handler.MessageContext.Scope;

import org.zerock.handler.EchoHandler;
import org.zerock.handler.Handler;

public class SampleServer {
	//bad 
		public static void main(String[] args) throws Exception{
			ServerSocket ss = new ServerSocket(5555);
			
			System.out.println("Ready .....");
			
			while(true) {
				Socket socket =  ss.accept();
				System.out.println(socket);
				
				Scanner inScanner = new Scanner(socket.getInputStream(),"UTF-8"); //���ڵ� ����
				
				String ClinetMsg = inScanner.nextLine();
				System.out.println(ClinetMsg);
				
				
				//'ehco'��� �Է����� ���
				
				//'by'��� �Է����� ���
				
				//--> ���ڶ�� �Է����� ��� ����Ŭ�������� , by��� ������ byŬ������ �����ϴ� ������ ���񽺸� �����ʹ�.
				
				//---------------------------------------------------------
				//getHandler�� Handler(�������̽�)Ÿ�� ��ü�� ����
				Handler handler = PropTest.getHandler(ClinetMsg);
				//handle�޼������
				String serverMsg = handler.handle("");
				
				System.out.println("-------------------------");
				System.out.println(serverMsg);
				//---------------------------------------------------------
				
				//Ŭ���̾�Ʈ�� ������
				OutputStream out = socket.getOutputStream();
				out.write((serverMsg+"\n").getBytes("UTF-8"));
				
				socket.close();

			}//end while
			
		}
}
