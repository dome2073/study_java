package og.zerock.ex1;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	
	//bad code
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(5555);
		
		System.out.println("Server Ready");
		
		while(true) {
			
			Socket socket = ss.accept();
			
			System.out.println(socket);
			
			//������ �޼����� ����
			//������ ����1
			OutputStream out = socket.getOutputStream();
			
			String msg = "<h1>Hello World</h1>"; 
			
			out.write(new String("HTTP/1.1 200 OK\r\n").getBytes()); 
		    out.write(new String("Cache-Control: private\r\n").getBytes()); 
		    out.write(new String("Content-Length: "+msg.getBytes().length+"\r\n").getBytes()); 
		    out.write(new String("Content-Type: text/html; charset=UTF-8\r\n\r\n").getBytes());
			
		    out.write(msg.getBytes());
			
		    
		    //����Ʈ�� �迭 ����
//			byte[] arr = {97,98,99};
//			
//			out.write(arr);
//			
			//�������� : �Ծ� , ���
			//1. �������� ������ (Ŭ���̾�Ʈ -> ����)
			//2. �����͸� �����µ� ��ŭ ��������
			// 2-1. ���̸� �𸦰��? ---���̸� �̸� �����ش�.
			// 2-2. Ư�� �����Ͱ� ���ð�� �ű���� 
			// 2-3. Scanner�� ���� ��� - 
			//3. ���ڿ��� �ϰ�������
			// 3-1. ���ڿ��� ����Ʈ�� �迭�� �ٲٱ� String text = new String(bytes, "UTF-8")
			// 3-2. ����Ʈ �迭�� ���ڿ��� �ٲٱ� byte[] bytes = text.getByte("UTF-8");
		    
		    //1. ������ ->Ŭ����
		    //			->URL(����)
		    //			Socket ����
		    
		    //2. Input/ OutputStream --- ��� : �������� : ������ �޴� ���� ����
		    
		    
		}
		
	}
}
