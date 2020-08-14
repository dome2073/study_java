package org.zerock.RandomAcce;

import java.io.RandomAccessFile;

public class RandEx {
	public static void main(String[] args) {
		
		try(	
				//지역변수로 사용한 이유
				//네트워크 통신 작업인 경우는 지역변수로 써야함
				
				RandomAccessFile raf = new RandomAccessFile("C:\\zzz\\raf.txt", "rw")
				//인스턴스변수로 사용하면 안됨 --- Thread safe
				){
			
			raf.writeInt(10); //4byte
			
			raf.seek(200);
			
//			raf.writeInt(20);
			
			int value = raf.readInt();
			System.out.println(value);
			
			
			//--> 204byte
			//seek을 사용하면 데이터의 크기를 정하고 그만큼씩 나눌수있음
			//--> 현재 데이터가 몇건 있는지 알 수 있음 --// 순차적으로 읽을 필요가없음
			//핵심 : 마음대로 커서를 이동할 수 있다
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
