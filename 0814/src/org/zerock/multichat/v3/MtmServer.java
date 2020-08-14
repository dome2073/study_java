package org.zerock.multichat.v3;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MtmServer {

	//bad code
	public static void main(String[] args) throws Exception{
		
		ServerSocket ss = new ServerSocket(5555);
		System.out.println("Ready............");
		Map<String, PrintWriter> pwMap = new HashMap<>();
		
		while(true) {
			
			Socket socket = ss.accept();
			System.out.println(socket);
			InputStream in = socket.getInputStream();
			Reader inr = new InputStreamReader(in, StandardCharsets.UTF_8);
			BufferedReader br = new BufferedReader(inr);
			
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);
			PrintWriter pw = new PrintWriter(osw,true);
			
			
			new Thread(() ->  {
				try {
					while(true) {
						String clientMsg = br.readLine();
						System.out.println(clientMsg);
						
						String[] arr = clientMsg.split(":");
						
						switch (arr[0]) {
						case "0":
							pwMap.put(arr[1], pw);
							System.out.println(pwMap);
							break;
						case "1":
							pwMap.values().forEach(p -> p.println(arr[1]+":"+ arr[2]));
						case "2":
							
							System.out.println(Arrays.toString(arr));
							
							String target = arr[2];
							
							PrintWriter targetPw = pwMap.get(target);
							
							targetPw.println("±Ó¼Ó¸»-"+arr[1]+"-"+arr[3]);

						default:
							break;
						}

						
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}).start();
			
			
			
		}//end while
	}
}











