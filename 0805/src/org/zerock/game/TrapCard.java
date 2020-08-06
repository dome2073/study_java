package org.zerock.game;

public class TrapCard extends Card{
	
	private Card origin;

	public TrapCard(String text) {
		super(text);
	}
	
	public TrapCard(Card origin) {
		super("");
		this.origin = origin;
	}

	@Override
	public Card getNext(String choice) {
		
		return origin.getNext(choice);
	}

	
	
	
}
