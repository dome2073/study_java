package org.zerock.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

//좋은 코드가 아님  
//예제를 위한 코드 
public class FileCopy1 {
	public static void main(String[] args) throws Exception {
		
		String path = "https://cdn.videofarm.daum.net/vod/v5ad0pfKIAsKpz9hKpBhhGA/mp4_SEEK/movie.mp4?px-bps=2621440&px-bufahead=10&px-time=1596783771&px-hash=d5939be9856eb6212544ea93e015f0bf";
		 
		URL url = new URL(path);
		
		//읽는 빨대
//		InputStream in = new FileInputStream("c:\\zzz\\test.jpg");
		
		InputStream in = url.openStream();
		
		System.out.println(in);
		
		//파일을 어디에 만들꺼냐
		OutputStream os = new FileOutputStream("C:\\zzz\\copy.mp4");
		
		while(true) {
			
			//한 바이트의 내용이 나옴
			int data = in.read();
			//더이상 읽을 데이터가 없을경우 -1이나옴
			if(data == -1) {
				break;
			}
			os.write(data);
		}
		
	}
}
