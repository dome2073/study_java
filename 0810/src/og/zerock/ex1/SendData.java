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
			
			System.out.println("입력해보세요");
			//nextLine() 은 \n전까지
			String str = sc.nextLine() +"\n";
			
			if(str.equals("END\n")) {
				break;
			}
			//바이트의 배열로
			byte[] data = str.getBytes();
			
			out.write(data);
		}
		
	}
}
