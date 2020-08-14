package org.zerock.note;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

//NoteVo 데이터 핸들링 객체
//내부적으로 Random AccessFile 이용


public class NoteDAO {
	
	public void insert(NoteVO vo)throws Exception{
		
		//현재 파일없을시 문제있어
		RandomAccessFile raf = new RandomAccessFile("C:\\zzz\\0814.txt", "rw");
		
		//현재 파일의 크기를 알아야함, 이동하기 위해
		long len = raf.length();
		
		long cursor = (long)(Math.ceil(len/100.0) * 100);
		
		//커서 이동
		raf.seek(cursor);
		
		//from 입력
		raf.writeInt(vo.getTo());
		raf.writeInt(vo.getFrom());
		raf.writeInt(vo.getState());
		raf.writeUTF(vo.getContent());
		raf.close();
	}
	
	public List<NoteVO> findByUserNum(int userNum)throws Exception{
		List<NoteVO> result = new ArrayList<>();
		
		RandomAccessFile raf = new RandomAccessFile("C:\\zzz\\0814.txt", "rw");
		
		//1.파일의 길이를 알아햐마
		long count = raf.length()/100; //레코드갯수 
		
		
		//db select랑 같음
		for (int i = 0; i < count; i++) {
			
			raf.seek(i * 100); //레코드의 처음
			
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
		
		//100단위로 건너뛰기
		
		raf.close();
		
		return result;
		
		
	}
}
