package org.zerock.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

//���� �ڵ尡 �ƴ�  
//������ ���� �ڵ� 
public class FileCopy1 {
	public static void main(String[] args) throws Exception {
		
		String path = "https://cdn.videofarm.daum.net/vod/v5ad0pfKIAsKpz9hKpBhhGA/mp4_SEEK/movie.mp4?px-bps=2621440&px-bufahead=10&px-time=1596783771&px-hash=d5939be9856eb6212544ea93e015f0bf";
		 
		URL url = new URL(path);
		
		//�д� ����
//		InputStream in = new FileInputStream("c:\\zzz\\test.jpg");
		
		InputStream in = url.openStream();
		
		System.out.println(in);
		
		//������ ��� ���鲨��
		OutputStream os = new FileOutputStream("C:\\zzz\\copy.mp4");
		
		while(true) {
			
			//�� ����Ʈ�� ������ ����
			int data = in.read();
			//���̻� ���� �����Ͱ� ������� -1�̳���
			if(data == -1) {
				break;
			}
			os.write(data);
		}
		
	}
}
