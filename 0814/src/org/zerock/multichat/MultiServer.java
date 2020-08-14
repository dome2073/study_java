package org.zerock.multichat;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiServer {
	
	//bad
	public static void main(String[] args) throws Exception{
		
		ServerSocket ss = new ServerSocket(5555);
		
		System.out.println("Ready ...........");
		List<PrintWriter> pwList = new ArrayList<>();
		while(true) {
			
			Socket socket = ss.accept();
			System.out.println(socket);
			
			
			//--------------�б�---------------------------
			InputStream in = socket.getInputStream();
			
			Reader reader = new InputStreamReader(in, StandardCharsets.UTF_8);
			
			BufferedReader br = new BufferedReader(reader);
			
			//--------------����--------------------------------------------
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
			PrintWriter pw = new PrintWriter(osw, true); // printwrite����
			pwList.add(pw);
			//�ٸ������ printWriter �� �˾ƾ���
			
			Map<String,PrintWriter> listmap = new HashMap<>();
			
			listmap.put("������", pw);
			//�ͼӸ� 
			//���� --> ��������
			//read,write �ΰ��� �� ����Ŭ
			new Thread(()->{
				try {
					while(true) {
						//������ ������
						String ClientMsg = br.readLine();
						System.out.println(ClientMsg);
						
						//pw.println("server : " + ClientMsg);
						
						synchronized (pwList) {
							
							pwList.forEach(p -> p.println(ClientMsg));
						}
						
						//����ڰ� ������������
						//1. arryylist���� �ش� ����ڸ� ������
						
						//�ͼӸ��� ������������
						
						
					}
				}catch(Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					//�д°� �߸��ɰ�� break
					
				}
				
			}).start();
		}//end while
		
		
	}
}
