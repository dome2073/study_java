package org.aia.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Monster{
	
	private int level;
	protected int hp;
	protected int power;
	public Monster() {
		super();
		this.level = level;
		this.hp = level * 10;
		this.power = level * 10;
	}
	
	public Monster(int level) {
		super();
		this.level = level;
		this.hp = level * 10;
		this.power = level * 10;
	}


	@Override
	public String toString() {
		return "Monster [level=" + level + ", hp=" + hp + "]";
	}
	
	
}
