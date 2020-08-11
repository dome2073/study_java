package org.zerock.sample;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import org.zerock.handler.Handler;

public class PropTest {
	//bad code

	//bad code
	public static Handler getHandler(String msg)throws Exception {
		
		//handler.properties를 읽을 수 있게 
		Properties props = new Properties();
		props.load(new FileInputStream("C:\\zzz\\handler.properties"));
		
		System.out.println(props);
		
		//키값으로 클래스명을 가지고옴 (properties에 등록)
		String className = props.getProperty(msg);
		
		System.out.println(className);
		
		//클래스 명으로 생성자 생성
		Class clz = Class.forName(className);
		Constructor<?> con = clz.getConstructor(null);
		
		System.out.println(con);
		
		//객체생성
		Handler obj = (Handler)con.newInstance(null);
		
		System.out.println(obj);
		
		//객체반환
		return obj;
	}
}
