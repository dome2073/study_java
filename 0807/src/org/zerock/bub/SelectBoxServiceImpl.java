package org.zerock.bub;

import java.util.ArrayList;
import java.util.List;

public class SelectBoxServiceImpl implements SelectBoxService {
	
	private List<Paper> paperList;

	SelectBoxServiceImpl(int count){
		
		paperList = new ArrayList<>();
		
		int idx = (int)(Math.random() * count);
		
		for(int i = 0;i < count; i++) {
			
			if(i == idx) {
				paperList.add(new Paper("´çÃ·"));
				continue;
			}
			paperList.add(new Paper("²Î"));
		}
	}
	
	@Override
	public Paper getNext() {
		
		if(paperList.size() == 0) {
			return null;
		}
		
		return paperList.remove(0);
	}

}














