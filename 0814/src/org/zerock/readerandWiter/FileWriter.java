package org.zerock.readerandWiter;

import java.io.PrintWriter;
import java.io.Writer;

public class FileWriter {
	public static void main(String[] args) throws Exception {
		//Write를 사용하면 변환없이 바로 문자열을 write할수있음
		//대신 개행이 안되므로 PrintWriter로 확장
		
		Writer fw = new java.io.FileWriter("C:\\zzz\\aaa.txt");
		
		PrintWriter pw = new PrintWriter(fw);
		
//		fw.write("aaaaaaaaaaa"); //이렇게쓰면 개행이안됨
//		fw.write("bbbbbbbbbbb");
//		fw.write("ccccccccccc");
		pw.println("Hello World");
		pw.println("Hell World");
		pw.println("Hell JAVA");
		

		pw.close();
		fw.close();
	}
}
