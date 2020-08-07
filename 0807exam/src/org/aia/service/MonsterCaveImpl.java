package org.aia.service;

import java.util.ArrayList;
import java.util.List;

import org.aia.vo.Monster;

//MonsterCave == 동굴에 나오는 몬스터
public class MonsterCaveImpl implements MonsterCave {

	private Monster monster;

	List<Monster> list = new ArrayList<>();

	// 몬스터 생성하기
	@Override
	public int createMonster() {
		// TODO Auto-generated method stub

		for (int i = 1; i < 11; i++) {

			list.add(new Monster(i));

		}

		return 0;

	}

	// 현재라운드
	@Override
	public Monster getCurrentRound(int level) {
		// TODO Auto-generated method stub

		
		Monster CurrMonster = list.get(level);

		// 엔터를 누를때마다 다음 레벨의 몬스터가 나온다.

		return CurrMonster;
	}

	// 다음라운드
	@Override
	public Monster getNext(int level) {
		// TODO Auto-generated method stub

		System.out.println("다음 단계 몬스터 출현");
		Monster CurrMonster = list.get(level);

		// 엔터를 누를때마다 다음 레벨의 몬스터가 나온다.

		return CurrMonster;
	}

}
