package org.zerock.org.DataStructure;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
	
	//���� ������ �ƴ�
	public static void main(String[] args) {
		
		//������ ������ ��ü�� Ű�� �Ǿ����
		Map<Player, String> map = 
				new HashMap<>();
		
		map.put(new Player(1, "������"), "�������� Ŀ�����..");
		map.put(new Player(2, "����ȣ"), "����ȣ�� Ŀ�����..");
		map.put(new Player(3, "�߽ż�"), "�߽ż��� Ŀ�����..");
		map.put(new Player(4, "������"), "�������� Ŀ�����..");
		
		Player target = new Player(3, "");
		
		//hashcode�� �̿��ؼ� �˻��� �Ѵ�.
		//5�� ���� ..
		//target �� �ѹ�
		//==> �ڷᱸ���� ����Ϸ��� equalsa hashcode�� �������̵带 �ؾ��Ѵ�.
		
		String result = map.get(target);
		
		System.out.println(result);
		
		
		
	}
}
