import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Exception 泥섇뜝�룞�삕 - badCode
public class SendFile {
	public static void main(String[] args) {
		
		Map<String, String> mimeMap = new HashMap<>();
		mimeMap.put("jpg","image/jpeg");
		mimeMap.put("mp3","audio/mpeg");
		mimeMap.put("html","text/html; charset=UTF-8\\r\\n\\r\\n");
		mimeMap.put("text","text/plain; charset=UTF-8\\r\\n\\r\\n");
		
		ServerSocket ss = null;
		
		//try-catch 
		try {
			//�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 �뜝�뙓�벝�삕
			ss = new ServerSocket(5555);
			System.out.println("Ready......");
			while(true) {
				Socket client = ss.accept();
				Scanner inScanner = null;
				OutputStream out = null;
				
				
				try {
					
					inScanner = new Scanner(client.getInputStream(),"utf-8");
		
					out = client.getOutputStream();
					
					//String firstLine = inScanner.nextLine();
					String firstLine = new String(inScanner.nextLine().getBytes("utf-8"), "utf-8");
					
					String[] arr = firstLine.split(" ");
					
					// /aa.jpg �뜝�뙆�슱�삕 /�뜝�룞�삕 \\�뜝�룞�삕 �뜝�뙐�먯삕汝��쇀�뜝占�
					String fileName = arr[1].replace("/", "\\");
					

					if(fileName.equals("\\") || fileName.equals("/favicon.ico")) {
						continue;
						 
					}
					
					File targetFile = new File("C:\\zzz"+fileName);
					
					InputStream fin = new FileInputStream(targetFile);
					
					//�뜝�룞�삕�뜝�룞�삕 �솗�뜝�룞�삕�뜝�룞�삕
					String ext = fileName.substring(fileName.lastIndexOf('.') +1);
					
					System.out.println(fileName);
					
					System.out.println(ext);
					String msg = "<h1>Hello World</h1>"; 
					
					out.write(new String("HTTP/1.1 200 OK\r\n").getBytes("utf-8")); 
				    out.write(new String("Cache-Control: private\r\n").getBytes()); 
				    out.write(new String("Content-Length: "+targetFile.length()+"\r\n").getBytes("utf-8")); 
				    out.write(new String("Content-Type: "+ext+"; charset=UTF-8\r\n\r\n").getBytes());
					
				    byte[] buffer = new byte[1024*8];
				    
				    while(true) {
				    	int count = fin.read(buffer);
				    	if(count ==-1) {break;}
				    	out.write(buffer,0,count);
				    }
//				    
//				    out.write(msg.getBytes());
				}catch(Exception e) {
					e.printStackTrace();
				}finally {
					
					out.close();
					inScanner.close();
					client.close();
					
				}
			} //while end
			
		}catch(Exception e){
			//�뜝�룞�삕�뜝占� �뜝�뜴由�
		}finally {
			//�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕
			if(ss != null) {
				try {
					ss.close();
				}catch(Exception e) {}
			}//end if
		}//end finally
	}
}

