package org.zerock.note.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.zerock.note.NoteDAO;
import org.zerock.note.NoteVO;

public class NoteDAOTests {
	
	private NoteDAO dao;
	

	@Test
	public void test1() throws Exception {
		System.out.println("test1......");
		
		dao = new NoteDAO();
		
		for (int i = 0; i < 10; i++) {
			
			NoteVO vo = new NoteVO(i,1,'N',"Hello");
			
			dao.insert(vo);
			
		}
	}
	
	@Test
	public void testRead() throws Exception{
		dao = new NoteDAO();
		
		List<NoteVO> list = dao.findByUserNum(1);
		
		System.out.println(list);
	}
}
