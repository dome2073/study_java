package og.zerock.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//io¿¹Á¦ -2 ´õºü¸§
public class FileCopy2 {
	
	//badcode - throws Exception
	public static void main(String[] args) throws Exception{
		
		//»¡´ë ÁØºñ
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
		
		//»¡´ë»Ì±â
		in.close();
		out.close();
	}
}

