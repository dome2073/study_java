package org.zerkck.web;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class DataEx {
	//bad code
	public static void main(String[] args) throws Exception {
		OutputStream out = new FileOutputStream("C:\\zzz\\data.txt");
		
		DataOutputStream dos = new DataOutputStream(out);
		
		//�����ڵ��� ��κ��� �ѱ��� 3����Ʈ , �տ� 2����Ʈ�� ����
		dos.writeUTF("����"); //8b
		dos.writeUTF("��"); //5b
		//---> ��� DB�� ����� ������ ����
		
		
		
		dos.close();
	}
}
