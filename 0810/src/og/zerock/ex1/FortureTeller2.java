package og.zerock.ex1;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FortureTeller2 {
	
	//bad code
	public static void main(String[] args) throws Exception{
		

			
//			Scanner sc = new Scanner(System.in);
//			String urlquery = sc.nextLine();
			String urlquery = "https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%9D%A0%EB%B3%84%EC%9A%B4%EC%84%B8";
			
			Document doc =  Jsoup.connect(urlquery).get();
			 //		System.out.println(doc);
			Elements ele = doc.select(".sign_lst a");

			
			
			StringBuffer str = new StringBuffer();
			
			for (int i = 0; i < ele.size(); i++) {
				
				Element target = ele.get(i);
				
				str.append(target.text());
				
			}
			
			String str2 = new String(str);
			System.out.println(str2);
			String str3 = str2.replace("¶ì", "¶ì ");
			System.out.println(str3);
			String[] arr = str2.split(" ");
			
			System.out.println(arr[0]);
			
//			str.append("<br/><a href=''></a>");
//			System.out.println(str);
//			String str2 = new String(str);
//			
//			
//			
//			OutputStream out = new FileOutputStream("C:\\zzz\\"+urlquery+".html");
//			
//			out.write(str2.getBytes());
		
		
 		
	}
}
