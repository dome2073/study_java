package og.zerock.ex1;

import java.io.InputStream;
import java.net.Socket;

public class Client1 {
	
	//bad code
	//Ŭ���̾�Ʈ ���α׷�
	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("192.168.0.43", 5555);
		
		System.out.println(socket);
		
		InputStream in = socket.getInputStream();
		
		//�� ����Ʈ�� �迭�� �����. 3��- 3���� �������ϱ�
		byte[] arr = new byte[3];
		
		in.read(arr);
		
		//���ڿ��� ��ȯ
		String str = new String(arr);
		
		System.out.println(str);
//		System.out.println(in.read());
		
	}
}
