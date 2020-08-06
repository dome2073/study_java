package org.zerock.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.zerock.domain.Item;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ItemServiceImpl implements ItemService {
	
	//���� (AllArgsConstructor)
	private List<Item> itemList;
	
	@Override
	public List<Item> findByPrice(int price) {
		
		//���� �ݾ׿��� ������ �� �ִ� ��ǰ ���
		List<Item> result = itemList.stream()
		.filter(item -> item.getPrice() <= price)
		.collect(Collectors.toList());
		return result;
	}

	@Override
	public Item getItem(int no) {
		// TODO Auto-generated method stub
		Item items = itemList.get(no);
		System.out.println(items);
		
		return items;
		
	}


		
	

}
