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
		
		//유니코드중 대부분의 한글은 3바이트 , 앞에 2바이트는 정보
		dos.writeUTF("가나"); //8b
		dos.writeUTF("다"); //5b
		//---> 사실 DB를 만드는 구조와 동일
		
		
		
		dos.close();
	}
}
