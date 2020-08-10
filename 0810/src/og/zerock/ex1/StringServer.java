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
			System.out.println("새로운 손님 방문"+client);
			
			//읽고 쓰기 //빨대생성
			InputStream in = client.getInputStream();
			OutputStream out = client.getOutputStream();

			//어떤 종류의 문자열을 줄지 모르니 Scanner를 통해 한라인 쭉
			// \n을 같이 보내줘야 가능 -프로토콜-
			//------읽는작업-----
			Scanner insc = new Scanner(in);
			String msg = insc.nextLine();
			System.out.println(msg);
			
			//---에코-----
			out.write((msg+"\n").getBytes());
			
			
			//연결종료
			client.close();
			
		}
		
		
	}
}
