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
		//가게 문 연다
		ServerSocket ss = new ServerSocket(5556);
		System.out.println("Ready ......");
		
		
		//손님을 받는다 여러명 받을수 있으니 while
		while(true) {
			//손님을 받는다
			//손님 생성
			Socket socket =  ss.accept();
			//손님에게 보낼 빨대 생성
			OutputStream out = socket.getOutputStream();
			//손님에게 보낼 데이터를 만든다 = byte[] 
//			Path path = Path.of("C:\\zzz\\sample.txt");
			Path path = Paths.get("C:\\\\zzz\\\\sample.txt");
			
			byte[] data = Files.readAllBytes(path);
			
			
			out.write(new String("HTTP/1.1 200 OK\r\n").getBytes()); 
		    out.write(new String("Cache-Control: private\r\n").getBytes()); 
		    out.write(new String("Content-Length: "+data.length+"\r\n").getBytes()); 
		    out.write(new String("Content-Type: text/html; charset=UTF-8\r\n\r\n").getBytes());
		}
		//손님에게 데이터를 보낸다
	}
}
