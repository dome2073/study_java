package org.zerock.oos;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class OISEx {
	
	//bad code
	public static void main(String[] args) throws Exception{
		
		ObjectInputStream oin = new ObjectInputStream(new FileInputStream("C:\\zzz\\¡§¥Î¿±.dat"));
		
		Object obj = oin.readObject();
		
		System.out.println(obj);
		
	}
}
