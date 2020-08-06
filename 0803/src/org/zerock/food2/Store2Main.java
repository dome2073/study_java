package org.zerock.food2;

import java.util.Scanner;

public class Store2Main {

	public static void main(String[] args) {

		// �������� ����� �迭 arr�� ���� =
		// 1. Store�迭�� �����´� (�� �����͸� �迭�� �Է����ش� (��������)
		Store[] store = new Store[] { 
				new Store("�췡��", 37.568386, 126.998756),
				new Store("���������������", 37.550624, 127.126389), 
				new Store("��������", 37.484760, 127.038022),
				new Store("Ȳ�Ұ���", 37.568775, 126.986073), 
				new Store("�ϳ������� ���ε�������", 37.484458, 126.901877),
				new Store("���Ĵ�", 37.525697, 127.041080), 
				};
		
		Scanner scanner = new Scanner(System.in);

		//����� �Ÿ��� �ִ� store�� ã�� ���� �ʿ��� ������
		StoreFinder finder = new StoreFinder(store);
		
		Position current = new Position(8,9);

		Store nearestStore = finder.findByPosition(current);

		System.out.println(nearestStore.getName());
	}
}
