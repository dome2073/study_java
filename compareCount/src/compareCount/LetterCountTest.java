package compareCount;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class LetterCountTest {

	public static void main(String[] args)throws Exception {
		
		//리스트 선언
		List<LetterCount> list = new ArrayList<>();
		
		//알파벳 아스키코드 97~ 122
		for(int i =97; i<=122;i++) {
			//리스트에 LetterCount객체\
			list.add(new LetterCount((char)i));
			//[ch =a, count =0] ...으로 저장
		}
		//System.out.println(list.toString());
		//System.out.println(list);
		
		//파일 불러오기
		FileInputStream fin = 
				new FileInputStream("C:\\zzz\\alice.txt");
		
		Scanner scanner = new Scanner(fin);
		
		while(true) {
			try {
				String line = scanner.nextLine();
				
				if(line == null) {
					break;
				}
				
				if(line.trim().length() == 0) {
					continue;
				}
				
				char[] arr = line.toCharArray();
				
				
				for(int i = 0; i < arr.length; i++) {
					
					int intValue = (int)arr[i];
					
					if(intValue <97 || intValue >122) {
						continue;
					}
					
					//자신의 알파벳 값 count
					list.get( ((int)arr[i]) -97 ).inc();
				}
			}catch(Exception e) {
				break;
			}
			
		}//end while
		
		//구현한 compareTo
		Collections.sort(list);
		
		//list.forEach(v -> System.out.println(v));
		
	}
}
