package og.zerock.ex1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class SendData {
	//badcode
	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		OutputStream out = new FileOutputStream("C:\\zzz\\send.txt");
		
		while(true) {
			
			System.out.println("�Է��غ�����");
			//nextLine() �� \n������
			String str = sc.nextLine() +"\n";
			
			if(str.equals("END\n")) {
				break;
			}
			//����Ʈ�� �迭��
			byte[] data = str.getBytes();
			
			out.write(data);
		}
		
	}
}
