package org.zerock.readerandWiter;

import java.io.PrintWriter;
import java.io.Writer;

public class FileWriter {
	public static void main(String[] args) throws Exception {
		//Write�� ����ϸ� ��ȯ���� �ٷ� ���ڿ��� write�Ҽ�����
		//��� ������ �ȵǹǷ� PrintWriter�� Ȯ��
		
		Writer fw = new java.io.FileWriter("C:\\zzz\\aaa.txt");
		
		PrintWriter pw = new PrintWriter(fw);
		
//		fw.write("aaaaaaaaaaa"); //�̷��Ծ��� �����̾ȵ�
//		fw.write("bbbbbbbbbbb");
//		fw.write("ccccccccccc");
		pw.println("Hello World");
		pw.println("Hell World");
		pw.println("Hell JAVA");
		

		pw.close();
		fw.close();
	}
}
