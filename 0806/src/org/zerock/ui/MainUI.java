package org.zerock.ui;

import java.util.Scanner;

import org.zerock.domain.Item;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MainUI {
	
	private CoinUI coinUI;
	private ItemUI itemUI;
	private Scanner sc;

	public void sellItem() {
		
			int total;

			System.out.println("1.���ᱸ�� 2.�� �ֱ� 3.����");
			
			int cho = Integer.parseInt(sc.nextLine());
			//���ᱸ��
			if(cho == 1) {
				
				//������ ��������
				total = coinUI.insertCoins();
				//��ǰ���
				itemUI.printItem(total);
				
				if(total >= 600 ) {
					//���ᱸ��
					System.out.println("�����Ͻ� ��ǰ ��ȣ�� �Է��ϼ���");
					
					int byitem = Integer.parseInt(sc.nextLine());
					
					//������ ���� ���
					Item item = itemUI.printOne(byitem);
					System.out.println("������ ����� " + item.getName() +"�Դϴ�." +item.getPrice()+"��ŭ �����մϴ�." );
					
					//�����ϴ� �޼���
					coinUI.cal(item.getPrice());
				}else {
					System.out.println("���� �����մϴ�.");
					coinUI.insertCoins();
				}				
			}else if(cho ==2) {
				
				total = coinUI.insertCoins();
				
			}else {
				System.out.println("��ȯ�ݾ� : "+coinUI.balance());
				return;
			}
			
			sellItem();
		}

}
