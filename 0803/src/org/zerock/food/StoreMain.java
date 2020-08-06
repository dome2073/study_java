package org.zerock.food;

import java.util.Arrays;
import java.util.Scanner;

//god class
public class StoreMain {
	public static void main(String[] args) {
		// �������� ����� �迭 arr�� ���� = 
		//1. Store�迭�� �����´� (�� �����͸� �迭�� �Է����ش� (��������)	
		StoreVO[] vo = new StoreVO[] {
			new StoreVO("�췡��", 37.568386, 126.998756),
			new StoreVO("���������������", 37.550624, 127.126389),
			new StoreVO("��������", 37.484760, 127.038022),
			new StoreVO("Ȳ�Ұ���", 37.568775, 126.986073),
			new StoreVO("�ϳ������� ���ε�������", 37.484458, 126.901877),
			new StoreVO("���Ĵ�", 37.525697, 127.041080),
		};
		
		// ����ڿ��� ���� ��ġ�� �����. /���� /�浵 =
		//2. ������ġ�� �޴´�.
		//��ġ = �浵, ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�浵�� �Է��ϼ���");
		double lat = sc.nextDouble(); //�浵 �ޱ�
		System.out.println("������ �Է��ϼ���");
		double lng = sc.nextDouble(); //���� �ޱ�
		
		
		//3.
		//�迭�� ����
		//�ּҰ��� �Ǵ� ���� ���ϱ� - ���� ����� ���� ���ϱ�
		Arrays.sort(vo, (s1,s2) -> {
			
			double d1 = s1.calcDistance(lat, lng);
			double d2 = s2.calcDistance(lat, lng);
			
			return d1>d2?1:-1;
			
		});
		//���ĵ� ��� = �ּڰ��� �Ǵ� ����
		System.out.println(vo[0]);
		
	}
}

