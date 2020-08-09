package org.aia.vo;

public class BossMonster extends Monster {
	
	public BossMonster(int level) {
		
		super(level);
		this.hp = hp * 5;
		this.power = power * 2;
		// TODO Auto-generated constructor stub
		
	}


}
