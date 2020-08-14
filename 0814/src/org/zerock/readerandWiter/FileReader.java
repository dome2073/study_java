package org.zerock.readerandWiter;

import java.io.BufferedReader;
import java.io.Reader;

public class FileReader {
	public static void main(String[] args) throws Exception {

		// 1.scanner - nextline 으로 읽기
		// 2. bufferedReader - ReadLine()으로 읽기

		Reader fr = new java.io.FileReader("C:\\zzz\\aaa.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String line = br.readLine(); //
			if (line == null) {
				break;
			}
			System.out.println(line);
		}
	}
	//socket은 getinput, output밖에없음
	//	 --> 변환해주는 애가있다 
	// inputStream --> Reader ====> InputStreamReader    // Reader -> input 으로 변환은 못한다 (상속과같이)
	// outputStream --> Writer ====> OutputStreamWriter  // Writer -> output 으로 변환은 못한다 (상속과같이)
}
