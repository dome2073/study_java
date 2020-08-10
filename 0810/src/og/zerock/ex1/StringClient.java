package og.zerock.ex1;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class StringClient {
	//bad
	public static void main(String[] args) throws Exception {
		
		//1. 家南 积己
		Socket socket = new Socket("127.0.0.1",5555);
		
		//2. input, output 积己
		InputStream in = socket.getInputStream();
		OutputStream out = socket.getOutputStream();
		
		//静扁
		Scanner outsc = new Scanner(in);
		String msg = outsc.nextLine();
		out.write(msg.getBytes());
		
		//佬扁
		Scanner insc = new Scanner(in);
		String answer = insc.nextLine();
		System.out.println(answer);
		socket.close();
		
	}
}
