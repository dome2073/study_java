package Poker;


import java.util.Arrays;


public class Player {
	
	Card[] card = new Card[5];
	String rank;
	
	Player(){
			
			card[0] = new Card(1,1);
			card[1] = new Card(2,1);
			card[2] = new Card(3,2);
			card[3] = new Card(1,2);
			card[3] = new Card(1,3);
	}
	
	Player(Card[] card){
		this.card = card;
	}
	
	public static void main(String[] args) {
		Player p = new Player();
		System.out.println(p);
	}

	@Override
	public String toString() {
		return Arrays.toString(card);
	}

	
	
}
