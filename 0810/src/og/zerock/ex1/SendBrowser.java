package og.zerock.ex1;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class SendBrowser {
	//bad code
	public static void main(String[] args) throws Exception {
		//���� �� ����
		ServerSocket ss = new ServerSocket(5556);
		System.out.println("Ready ......");
		
		
		//�մ��� �޴´� ������ ������ ������ while
		while(true) {
			//�մ��� �޴´�
			//�մ� ����
			Socket socket =  ss.accept();
			//�մԿ��� ���� ���� ����
			OutputStream out = socket.getOutputStream();
			//�մԿ��� ���� �����͸� ����� = byte[] 
//			Path path = Path.of("C:\\zzz\\sample.txt");
			Path path = Paths.get("C:\\\\zzz\\\\sample.txt");
			
			byte[] data = Files.readAllBytes(path);
			
			
			out.write(new String("HTTP/1.1 200 OK\r\n").getBytes()); 
		    out.write(new String("Cache-Control: private\r\n").getBytes()); 
		    out.write(new String("Content-Length: "+data.length+"\r\n").getBytes()); 
		    out.write(new String("Content-Type: text/html; charset=UTF-8\r\n\r\n").getBytes());
		}
		//�մԿ��� �����͸� ������
	}
}
