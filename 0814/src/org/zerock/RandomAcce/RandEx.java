package org.zerock.RandomAcce;

import java.io.RandomAccessFile;

public class RandEx {
	public static void main(String[] args) {
		
		try(	
				//���������� ����� ����
				//��Ʈ��ũ ��� �۾��� ���� ���������� �����
				
				RandomAccessFile raf = new RandomAccessFile("C:\\zzz\\raf.txt", "rw")
				//�ν��Ͻ������� ����ϸ� �ȵ� --- Thread safe
				){
			
			raf.writeInt(10); //4byte
			
			raf.seek(200);
			
//			raf.writeInt(20);
			
			int value = raf.readInt();
			System.out.println(value);
			
			
			//--> 204byte
			//seek�� ����ϸ� �������� ũ�⸦ ���ϰ� �׸�ŭ�� ����������
			//--> ���� �����Ͱ� ��� �ִ��� �� �� ���� --// ���������� ���� �ʿ䰡����
			//�ٽ� : ������� Ŀ���� �̵��� �� �ִ�
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
