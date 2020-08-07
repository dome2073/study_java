package org.aia.vo;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
	
	private String name;
	private int power;
	private int hp;
	
	
	public Player(String name) {
		super();
		this.name = name;
		this.power = 100;
		this.hp = 100;
	}
	
	
}
