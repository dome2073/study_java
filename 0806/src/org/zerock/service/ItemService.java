package org.zerock.service;

import java.util.List;

import org.zerock.domain.Item;

public interface ItemService {
	
	//구매가능한 목록을 보여주는 
	List<Item> findByPrice(int price);
	
	Item getItem(int no);
	
}
