package org.zerock.service;

import java.util.List;

import org.zerock.domain.Item;

public interface ItemService {
	
	//���Ű����� ����� �����ִ� 
	List<Item> findByPrice(int price);
	
	Item getItem(int no);
	
}
