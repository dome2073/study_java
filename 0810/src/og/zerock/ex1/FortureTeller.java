package og.zerock.ex1;

import java.util.HashMap;
import java.util.Map;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class FortureTeller {

	// bad code
	public static void main(String[] args) throws Exception {
		
		Map<String, String> aMap = new HashMap<>();
		
		String urlquery = "https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EB%9D%A0%EB%B3%84%EC%9A%B4%EC%84%B8";

		Document doc = Jsoup.connect(urlquery).get();
		// System.out.println(doc);
		Elements ele = doc.select(".sign_lst a");

		// 穿端 苦
		StringBuffer query_str = new StringBuffer();

		for (int i = 0; i < ele.size(); i++) {

			Element target = ele.get(i);

			query_str.append(target.text());
		}
		String string_query = new String(query_str);
		String str_q = string_query.replace("苦", "苦 ");
		// System.out.println(string_query);

		// 苦 壕伸 持失
		String[] url_arr = str_q.split(" ");
		// ----------------------
		for (int i = 0; i < url_arr.length; i++) {
//			System.out.println(url_arr[i]);
			String url = "https://search.naver.com/search.naver?where=nexearch&sm=tab_etc&query=" + url_arr[i];

			Document doc2 = Jsoup.connect(url).get();
			// System.out.println(doc);
			Elements ele2 = doc2.select("#yearFortune div p");

			StringBuffer str2 = new StringBuffer();
			// #yearForturn
			for (int j = 0; j < ele2.size(); j++) {

				Element target = ele2.get(j);

				str2.append(target.text());
				
			}
			String st2 = new String(str2);
			

			
			aMap.put(url_arr[i],st2);
			
		}
			
		System.out.println(aMap.get("社苦"));
//			
//			
//			
//			OutputStream out = new FileOutputStream("C:\\zzz\\"+urlquery+".html");
//			
//			out.write(str2.getBytes());

	}
}
