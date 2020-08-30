package Poker;

import java.util.Scanner;

public class PokerGame {
	
	Dealer dealer = new Dealer();
	int player_c = 3;
	Player[] players = new Player[player_c];
	Scanner sc = new Scanner(System.in);
	
	//임시 플레이어의 수 : 3
	int player_s = 3;
	public void start() {
		
		//1. 게임이 시작
		System.out.println("게임이 시작되었습니다");
		
		
		//2. 딜러가 패를 섞는다.
		System.out.println("딜러가 패를 섞습니다");
		System.out.println(dealer.setCardList());;
		
		//3. 딜러가 플레이어에게 패를 준다
		System.out.println("패를 받습니다.");		
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player(dealer.giveCard());
			System.out.println("플레이어 "+i+":"+players[i]);
			
		}
		System.out.println(players);

		
		
//		System.out.println("당신의 결과는 ");
//		System.out.println(dealer.rankCheck(players[0].card));
		
		System.out.println("게임의 결과는?? ");
		System.out.println(dealer.rankPlayer(players));
		
		System.out.println("게임을 더 진행하시겠습니까?");
		
		
		if(sc.nextLine().equalsIgnoreCase("Y") == true)
			start();
		
		System.out.println("게임을 종료합니다");
	}
	
	public static void main(String[] args) {
		PokerGame game = new PokerGame();
		game.start();
		
		
	}	
		
	
}
