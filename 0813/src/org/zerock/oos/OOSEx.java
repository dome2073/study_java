package org.zerock.oos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class OOSEx {
	
	//bad code
	public static void main(String[] args) throws Exception {
		
		MsgVO vo = new MsgVO("������", "Hello World");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\zzz\\������.dat"));
		
		oos.writeObject(vo); //���ܹ߻� : NotSerializableException ==> Serializable�� �����ؾߵ�
		
		//�����۾� --> ��Ű����, Ŭ������, ������ �� ���ƾ���
	}
	
}
