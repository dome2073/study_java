package org.zerock.game;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Card {

	private String text;
	private Card yesCard;
	private Card noCard;
	
	public Card(String text) {
		this.text = text;
	}
	public Card getNext(String choice) {
		if(choice.equalsIgnoreCase("y")) {
			return this.yesCard;
		}else {
			return this.noCard;
		}
	}	
}
