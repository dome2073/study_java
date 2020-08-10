package og.zerock.ex1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FortureTeller {
	
	//bad code
	public static void main(String[] args) throws Exception{
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=tab_etc&query=%EB%8F%BC%EC%A7%80%EB%9D%A0%20%EC%9A%B4%EC%84%B8";
		
 		Document doc =  Jsoup.connect(url).get();
// 		System.out.println(doc);
 		Elements ele = doc.select("#yearFortune div p");
 		
 		StringBuffer str = new StringBuffer();
 		//#yearForturn 
 		for (int i = 0; i < ele.size(); i++) {

 			Element target = ele.get(i);
// 			System.out.println(target.text());
			str.append(target.text());
		}
 		System.out.println(str);
	}
}
