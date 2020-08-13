package org.zerock.oos;

import java.io.InputStream;
import java.net.URL;

public class ConnectTest {
	public static void main(String[] args) {
		
		for (int i = 0; i < 500; i++) {
			
			new Thread(()-> {  
				
				try {
					URL url = new URL("https://www.ilbe.com/list/politics?page=55&listStyle=list&searchType=title_content&search=%EB%8B%A8%EA%B5%B0");
					
					InputStream in = url.openStream();
					
					System.out.println(in);
					
					in.close();
					
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			}).start();
			
		}
	}
}
