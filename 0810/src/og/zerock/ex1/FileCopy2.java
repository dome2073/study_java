package og.zerock.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//io���� -2 ������
public class FileCopy2 {
	
	//badcode - throws Exception
	public static void main(String[] args) throws Exception{
		
		//���� �غ�
		InputStream in = new FileInputStream("C:\\zzz\\sample.jpg");
		OutputStream out = new FileOutputStream("C:\\zzz\\test.jpg");
		
		long start = System.currentTimeMillis();
		
		byte[] buffer = new byte[1024*8];
		
		while(true) {
			
			int count = in.read(buffer);
			if(count ==-1) {
				break;
			}
			out.write(buffer,0,count);
			
		}//end while
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		//����̱�
		in.close();
		out.close();
	}
}

