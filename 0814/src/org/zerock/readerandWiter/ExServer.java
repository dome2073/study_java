package org.zerock.readerandWiter;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;

public class ExServer {
	//bad
	public static void main(String[] args) throws Exception{
		
		ServerSocket ss = new ServerSocket(5555);
		
		System.out.println("ready ....");
		
		Socket socket = ss.accept();
		
		InputStream in = socket.getInputStream();
		//��ȯ
		Reader reader = new InputStreamReader(in);
		//���ڿ��б��
		BufferedReader br = new BufferedReader(reader);
		
		System.out.println(br.readLine());
		
	}
}
