package org.zerock.sample;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import org.zerock.handler.Handler;

public class PropTest {
	//bad code

	//bad code
	public static Handler getHandler(String msg)throws Exception {
		
		//handler.properties�� ���� �� �ְ� 
		Properties props = new Properties();
		props.load(new FileInputStream("C:\\zzz\\handler.properties"));
		
		System.out.println(props);
		
		//Ű������ Ŭ�������� ������� (properties�� ���)
		String className = props.getProperty(msg);
		
		System.out.println(className);
		
		//Ŭ���� ������ ������ ����
		Class clz = Class.forName(className);
		Constructor<?> con = clz.getConstructor(null);
		
		System.out.println(con);
		
		//��ü����
		Handler obj = (Handler)con.newInstance(null);
		
		System.out.println(obj);
		
		//��ü��ȯ
		return obj;
	}
}
