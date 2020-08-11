package org.zerock.web;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebToon2 {
	public static void main(String[] args) throws Exception{
		
		String path="https://image-comic.pstatic.net/webtoon/662774/198/20200714151941_133eb52feeffb3db9a8fdefe3a25ab69_IMAG01_2.jpg";
			
		URL url = new URL(path);
		
		//브라우저와 똑같이 헤더메세지를 전송
		//브라우저처럼 동작
		HttpURLConnection urlCon = (HttpURLConnection)url.openConnection();
		urlCon.setRequestProperty("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36");
		InputStream in = urlCon.getInputStream();
		
		OutputStream out = new FileOutputStream("C:\\zzz\\webtoon2.jpg");
		
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
