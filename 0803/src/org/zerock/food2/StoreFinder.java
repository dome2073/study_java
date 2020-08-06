package org.zerock.food2;

import java.util.Arrays;

//���� ��ü -���� ��� �䱸������ �ݿ��Ǿ�� �Ѵ�. 
public class StoreFinder {
	
	//Store ��ü�迭 ����
	private Store[] arr;
	

	public StoreFinder(Store[] arr) {
		this.arr = arr;
	}
	
	//�ּҰ��� �Ǵ� ���� ���ϱ� - ���� ����� ���� ���ϱ�
	
	public Store findByPosition(Position position) {
		
		Arrays.sort(arr, (s1,s2) -> {
			
			double d1 = s1.getPosition().calcDistance(position);
			double d2 = s2.getPosition().calcDistance(position);
			
			return d1>d2?1:-1;
			
		});
		
		return arr[0];
	}
}
