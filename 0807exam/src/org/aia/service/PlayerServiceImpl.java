package org.aia.service;

import org.aia.vo.Player;

public class PlayerServiceImpl implements PlayerServcie {
	
	private Player player;
	
	@Override
	public Player createPlayer(String name) {
		// TODO Auto-generated method stub
		Player player = new Player(name);
	
		return player;
	}

	
	
	

}
