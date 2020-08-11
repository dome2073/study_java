package org.zerock.web;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class WebToon1 {
	public static void main(String[] args) throws Exception{
		
		String path="http://t1.daumcdn.net/webtoon/op/22e8cb6e54a4c19ce4d6df5e66afc8177aea3572";
			
		URL url = new URL(path);
		InputStream in = url.openStream();
		
		OutputStream out = new FileOutputStream("C\\zzz\\webtoon.jpg");
		
		//최적화 바이트 = 8KB
		byte[] buffer = new byte[1024*8];
		
		while(true) {
			int count = in.read(buffer);
			
			if(count == -1) {
				break;
			}
			
			out.write(buffer,0,count);
		}
		
		//마지막에 한것부터 닫음
		in.close();
		out.close();
	}
	
}
