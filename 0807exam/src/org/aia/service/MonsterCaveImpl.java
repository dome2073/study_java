package org.aia.service;

import java.util.ArrayList;
import java.util.List;

import org.aia.vo.Monster;

//MonsterCave == ������ ������ ����
public class MonsterCaveImpl implements MonsterCave {

	private Monster monster;

	List<Monster> list = new ArrayList<>();

	// ���� �����ϱ�
	@Override
	public int createMonster() {
		// TODO Auto-generated method stub

		for (int i = 1; i < 11; i++) {

			list.add(new Monster(i));

		}

		return 0;

	}

	// �������
	@Override
	public Monster getCurrentRound(int level) {
		// TODO Auto-generated method stub

		
		Monster CurrMonster = list.get(level);

		// ���͸� ���������� ���� ������ ���Ͱ� ���´�.

		return CurrMonster;
	}

	// ��������
	@Override
	public Monster getNext(int level) {
		// TODO Auto-generated method stub

		System.out.println("���� �ܰ� ���� ����");
		Monster CurrMonster = list.get(level);

		// ���͸� ���������� ���� ������ ���Ͱ� ���´�.

		return CurrMonster;
	}

}
