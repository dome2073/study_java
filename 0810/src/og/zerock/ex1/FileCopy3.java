package og.zerock.ex1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//ioøπ¡¶ -3
public class FileCopy3 {
	
	//badcode - throws Exception
	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("127.0.0.1", 5555);
		
		InputStream in = socket.getInputStream();
		
		
		//ª°¥Î ¡ÿ∫Ò
		//url∑Œ ∫Ø∞Ê
//		URL url = new URL("https://www.naver.com");
//		InputStream in = url.openStream();
//		
		OutputStream out = new FileOutputStream("C:\\zzz\\test.text");
		
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
		
		//ª°¥ÎªÃ±‚
		in.close();		out.close();
	}
}

