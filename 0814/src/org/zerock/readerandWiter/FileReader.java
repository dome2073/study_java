package org.zerock.readerandWiter;

import java.io.BufferedReader;
import java.io.Reader;

public class FileReader {
	public static void main(String[] args) throws Exception {

		// 1.scanner - nextline ���� �б�
		// 2. bufferedReader - ReadLine()���� �б�

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
	//socket�� getinput, output�ۿ�����
	//	 --> ��ȯ���ִ� �ְ��ִ� 
	// inputStream --> Reader ====> InputStreamReader    // Reader -> input ���� ��ȯ�� ���Ѵ� (��Ӱ�����)
	// outputStream --> Writer ====> OutputStreamWriter  // Writer -> output ���� ��ȯ�� ���Ѵ� (��Ӱ�����)
}
