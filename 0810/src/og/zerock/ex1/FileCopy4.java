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
		//�ٰ����� �������� - �ѹ��� ���� ���� ��������
		//����Ʈ�� �迭 ����
		byte[] buffer = new byte[5];
		while(true) {
			
			//in.read() -- data�� ����
			//in.read(byte[]) --count�� ����
			int count = in.read(buffer);
			System.out.println(Arrays.toString(buffer));
			System.out.println(count);
			if(count == -1) {
				break;
			}
			//0 - ��ġ (�Ǿ�)
			//count - ���� ���� ������ ��ŭ 
			out.write(buffer,0,count);
			
		}//end while
		
	}
}
