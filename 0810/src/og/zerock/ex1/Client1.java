package og.zerock.ex1;

import java.io.InputStream;
import java.net.Socket;

public class Client1 {
	
	//bad code
	//클라이언트 프로그램
	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("192.168.0.43", 5555);
		
		System.out.println(socket);
		
		InputStream in = socket.getInputStream();
		
		//빈 바이트의 배열을 만든다. 3개- 3개를 받을꺼니까
		byte[] arr = new byte[3];
		
		in.read(arr);
		
		//문자열로 변환
		String str = new String(arr);
		
		System.out.println(str);
//		System.out.println(in.read());
		
	}
}
