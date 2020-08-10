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
			
			//서버가 메세지지 전송
			//보내는 빨대1
			OutputStream out = socket.getOutputStream();
			
			String msg = "<h1>Hello World</h1>"; 
			
			out.write(new String("HTTP/1.1 200 OK\r\n").getBytes()); 
		    out.write(new String("Cache-Control: private\r\n").getBytes()); 
		    out.write(new String("Content-Length: "+msg.getBytes().length+"\r\n").getBytes()); 
		    out.write(new String("Content-Type: text/html; charset=UTF-8\r\n\r\n").getBytes());
			
		    out.write(msg.getBytes());
			
		    
		    //바이트의 배열 선언
//			byte[] arr = {97,98,99};
//			
//			out.write(arr);
//			
			//프로토콜 : 규약 , 약속
			//1. 누가먼저 보낼지 (클라이언트 -> 서버)
			//2. 데이터를 보내는데 얼만큼 보내는지
			// 2-1. 길이를 모를경우? ---길이를 미리 보내준다.
			// 2-2. 특정 데이터가 나올경우 거기까지 
			// 2-3. Scanner를 쓰는 방법 - 
			//3. 문자열로 하고싶은경우
			// 3-1. 문자열을 바이트의 배열로 바꾸기 String text = new String(bytes, "UTF-8")
			// 3-2. 바이트 배열을 문자열로 바꾸기 byte[] bytes = text.getByte("UTF-8");
		    
		    //1. 연결방식 ->클래스
		    //			->URL(제공)
		    //			Socket 연결
		    
		    //2. Input/ OutputStream --- 약속 : 프로토콜 : 보내고 받는 순서 포멧
		    
		    
		}
		
	}
}
