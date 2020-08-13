import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class SendFile2 {
	
	public static void main(String[] args) {
		
		Map<String, String> mimeMap= new HashMap<>();
//		Map<String, String> Map2= new HashMap<>();
		
		mimeMap.put(".jpg", "image/jpg");
		mimeMap.put("mp3", "audio/mpeg");
		mimeMap.put("html", "text/html; charset=UTF-8");
		mimeMap.put("txt", "text/plain; charset=UTF-8");

//		Map2.put("소띠","https://search.naver.com/search.naver?where=nexearch&sm=tab_etc&query=%EC%86%8C%EB%9D%A0%20%EC%9A%B4%EC%84%B8");
		ServerSocket ss = null;

		try {
			// 정상적인 코드
			ss = new ServerSocket(5555);

			System.out.println("ready..");

			while (true) {

				Socket client = ss.accept();
				Scanner inScanner = null;
				OutputStream out = null;

				try {
					inScanner = new Scanner(client.getInputStream());
					out = client.getOutputStream();

					String firstLine = inScanner.nextLine();
					System.out.println(firstLine);
					
					String[] searchList = firstLine.split(" ");
					String query = searchList[1].substring(1);
					
					// crawling
					
					String url="https://search.naver.com/search.naver?where=nexearch&sm=tab_etc&query=" + query;
					
					Document doc=Jsoup.connect(url).get();
					
					//System.out.println(doc);
					
					//#yearFortune
					
					Elements ele=doc.select("#yearFortune div p");
					StringBuilder str=new StringBuilder();
					
					for(int i=0;i<ele.size();i++) {
						Element target=ele.get(i);
						//System.out.println(target.text());
						str.append(target.text());
					}	
					
					//System.out.println(str);
					
					String output = new String(str);
					System.out.println(output);

					out.write(new String("HTTP/1.1 200 OK\r\n").getBytes());
					out.write(new String("Cache-Control: private\r\n").getBytes());
					out.write(new String("Content-Length: " + output.getBytes(Charset.forName("UTF-8")).length + "\r\n").getBytes());
//					out.write(new String("Content-Type: +"+mimeMap.get(ext)+"\r\n\r\n").getBytes());
					out.write(new String("Content-Type: text/html; charset=UTF-8\r\n\r\n").getBytes());
					
					out.write(output.getBytes(Charset.forName("UTF-8")));
					
				} catch (Exception e) {

				} finally {
					out.close();
					inScanner.close();
					client.close();
				}
			}
		} catch (Exception e) {
			// 대안 흐름
			e.printStackTrace();
		} finally {
			// 끝끝내
			if (ss != null) {
				try {
					ss.close();
				} catch (Exception e) {
				}
			} // end if
		} // end finally
	}
}