package og.zerock.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;

public class FileCopy4 {
	//bad code
	public static void main(String[] args) throws Exception {
		
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		sc.nextLine();
		System.out.println();
		
//		InputStream in = new FileInputStream("C:\\zzz\\0810.txt");
		OutputStream out = new FileOutputStream("C:\\zzz\\test.txt");
		
		for (int i = 0; i <100; i++) {
			
		}
		//바가지로 가져오기 - 한번에 많은 양을 가져오기
		//바이트의 배열 선언
		byte[] buffer = new byte[5];
		while(true) {
			
			//in.read() -- data를 뜻함
			//in.read(byte[]) --count를 뜻함
			int count = in.read(buffer);
			System.out.println(Arrays.toString(buffer));
			System.out.println(count);
			if(count == -1) {
				break;
			}
			//0 - 위치 (맨앞)
			//count - 새로 들어온 데이터 만큼 
			out.write(buffer,0,count);
			
		}//end while
		
	}
}
