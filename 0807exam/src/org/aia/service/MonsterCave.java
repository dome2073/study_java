package org.aia.service;

import org.aia.vo.Monster;

public interface MonsterCave {
	
	//���� ����
	public int createMonster() ;
	
	public Monster getNext(int level);
	
	public Monster getCurrentRound(int level);
	
	
}
