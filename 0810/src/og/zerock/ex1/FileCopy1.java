package og.zerock.ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//ioøπ¡¶
public class FileCopy1 {
	
	//badcode - throws Exception
	public static void main(String[] args) throws Exception{
		
		//ª°¥Î ¡ÿ∫Ò
		InputStream in = new FileInputStream("C:\\zzz\\sample.jpg");
		OutputStream out = new FileOutputStream("C:\\zzz\\test.jpg");
		
		long start = System.currentTimeMillis();
		
		while(true) {
			
			int data = in.read();
			if(data == -1) break;
			out.write(data);
			
		}//end while
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
		//ª°¥ÎªÃ±‚
		in.close();
		out.close();
	}
}
