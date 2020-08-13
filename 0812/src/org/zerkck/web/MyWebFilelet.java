package org.zerkck.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class MyWebFilelet {
	
	static Map<String, String> mimeMap;
	static {
		mimeMap = new HashMap<>();
		mimeMap.put("jpg","image/jpeg");
		mimeMap.put("mp3","audio/mpeg");
		mimeMap.put("html","text/html; charset=UTF-8");
		mimeMap.put("text","text/plain; charset=UTF-8");
	}
	

	
	//파일 확장자를 요구한 경우
	public void doGET(MyWebRequest request, OutputStream out)throws Exception{
		
		String mimeType = mimeMap.get(request.getExt());
		
		
		
		
		File file = new File("C:\\zzz\\"+request.getCore().replace("/","\\"));
		
		out.write(new String("HTTP/1.1 200 OK\r\n").getBytes()); 
	    out.write(new String("Cache-Control: private\r\n").getBytes()); 
	    out.write(new String("Content-Length: "+file.length()+"\r\n").getBytes()); 
	    out.write(new String("Content-Type: "+mimeType+" \r\n\r\n").getBytes());
		
	    byte[] buffer = new byte[1024*8];
	    
	    try
	    (
	    		InputStream fin = new FileInputStream(file)
	    ) 
	    {
	    	while(true) {
	    		int count = fin.read(buffer);
	    		if(count ==-1) {break;}
	    		out.write(buffer,0,count);
	    	}
	    }catch(Exception e) {
	    	System.out.println(e.getMessage());
	    }
	}
}
