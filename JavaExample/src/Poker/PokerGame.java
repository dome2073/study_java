package Poker;

import java.util.Scanner;

public class PokerGame {
	
	Dealer dealer = new Dealer();
	int player_c = 3;
	Player[] players = new Player[player_c];
	Scanner sc = new Scanner(System.in);
	
	//�ӽ� �÷��̾��� �� : 3
	int player_s = 3;
	public void start() {
		
		//1. ������ ����
		System.out.println("������ ���۵Ǿ����ϴ�");
		
		
		//2. ������ �и� ���´�.
		System.out.println("������ �и� �����ϴ�");
		System.out.println(dealer.setCardList());;
		
		//3. ������ �÷��̾�� �и� �ش�
		System.out.println("�и� �޽��ϴ�.");		
		for (int i = 0; i < players.length; i++) {
			players[i] = new Player(dealer.giveCard());
			System.out.println("�÷��̾� "+i+":"+players[i]);
			
		}
		System.out.println(players);

		
		
//		System.out.println("����� ����� ");
//		System.out.println(dealer.rankCheck(players[0].card));
		
		System.out.println("������ �����?? ");
		System.out.println(dealer.rankPlayer(players));
		
		System.out.println("������ �� �����Ͻðڽ��ϱ�?");
		
		
		if(sc.nextLine().equalsIgnoreCase("Y") == true)
			start();
		
		System.out.println("������ �����մϴ�");
	}
	
	public static void main(String[] args) {
		PokerGame game = new PokerGame();
		game.start();
		
		
	}	
		
	
}
