package org.zerock.note;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

//NoteVo ������ �ڵ鸵 ��ü
//���������� Random AccessFile �̿�


public class NoteDAO {
	
	public void insert(NoteVO vo)throws Exception{
		
		//���� ���Ͼ����� �����־�
		RandomAccessFile raf = new RandomAccessFile("C:\\zzz\\0814.txt", "rw");
		
		//���� ������ ũ�⸦ �˾ƾ���, �̵��ϱ� ����
		long len = raf.length();
		
		long cursor = (long)(Math.ceil(len/100.0) * 100);
		
		//Ŀ�� �̵�
		raf.seek(cursor);
		
		//from �Է�
		raf.writeInt(vo.getTo());
		raf.writeInt(vo.getFrom());
		raf.writeInt(vo.getState());
		raf.writeUTF(vo.getContent());
		raf.close();
	}
	
	public List<NoteVO> findByUserNum(int userNum)throws Exception{
		List<NoteVO> result = new ArrayList<>();
		
		RandomAccessFile raf = new RandomAccessFile("C:\\zzz\\0814.txt", "rw");
		
		//1.������ ���̸� �˾��Ḷ
		long count = raf.length()/100; //���ڵ尹�� 
		
		
		//db select�� ����
		for (int i = 0; i < count; i++) {
			
			raf.seek(i * 100); //���ڵ��� ó��
			
			int toValue = raf.readInt();
			if(toValue == userNum) {
				int fromValue = raf.readInt();
				char stateValue = raf.readChar();
				String contentValue = raf.readUTF();
				
				NoteVO vo = NoteVO.builder()
						.from(fromValue)
						.to(toValue)
						.state(stateValue)
						.content(contentValue)
						.build();
					result.add(vo);
			}
		}
		
		//100������ �ǳʶٱ�
		
		raf.close();
		
		return result;
		
		
	}
}
