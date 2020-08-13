package org.zerock.oos;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class OOSEx {
	
	//bad code
	public static void main(String[] args) throws Exception {
		
		MsgVO vo = new MsgVO("정대윤", "Hello World");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\zzz\\정대윤.dat"));
		
		oos.writeObject(vo); //예외발생 : NotSerializableException ==> Serializable을 구현해야됨
		
		//복원작업 --> 패키지명, 클래스명, 변수명 다 같아야함
	}
	
}
