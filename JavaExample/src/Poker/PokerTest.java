package Poker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

class PokerTest {

	Dealer dealer = new Dealer();
	Card card = new Card(1, 1);

	@Test
	void init() {

	}

	// --����--
	// 1. ī�� 52�� ��������
	@Test
	void getCardTest() {

		System.out.println(dealer.setCardList());

	}

	// ī�� 5�� �ֱ�
	@Test
	void giveCardTest() {
		System.out.println(dealer.giveCard());
	}

	// ---�÷��̾� �׽�Ʈ --��ī�� �־��
	@Test
	void PlayerTest1() {

		Player player = new Player(dealer.giveCard());

		System.out.println(player);

		// �÷��̾ ���� ī�带 �������� ������ ������ ��ũ�� �˷���
		// ���Ƿ� �� �־�� -- ��ī��
		Card[] card1 = new Card[] { new Card(1, 1), new Card(2, 1), new Card(3, 1), new Card(4, 1), new Card(3, 2) };
		Player player2 = new Player(card1);

		System.out.println(dealer.rankCheck(player2.card));
	}

	// ---�÷��̾� �׽�Ʈ --��ī�� �־��
	@Test
	void PlayerTest2() {
		
		Player player = new Player(dealer.giveCard());
		System.out.println(player);
		
		Player player2 = new Player(dealer.giveCard());
		System.out.println(player2);
	
		
//		Player player = new Player(dealer.giveCard());		
//		Player player2 = new Player(dealer.giveCard());
//		System.out.println(player);
//		System.out.println(player2);

		// �÷��̾ ���� ī�带 �������� ������ ������ ��ũ�� �˷���

		//System.out.println(dealer.rankCheck(player.card));
	}

	@Test
	void rankCheck() {
		Card[] card1 = new Card[] { new Card(1, 1), new Card(2, 1), new Card(3, 1), new Card(4, 2), new Card(3, 2) };

		System.out.println(card.rankCheck(card1));
	}

	// pairüũ
	// 4 - ��ī��
	// 3 - Ʈ����
	// 2 - �����
	// 1 - �����
	@Test
	void getPair4Test() {
		Card[] card1 = new Card[] { new Card(1, 1), new Card(2, 1), new Card(3, 1), new Card(4, 1), new Card(3, 2) };
		int[] numArr = new int[14];
		numArr = card.getNumArr(card1);

		System.out.println(card.getPair(numArr) + "���");
	}

	@Test
	void getPair3Test() {
		Card[] card1 = new Card[] { new Card(1, 1), new Card(2, 1), new Card(3, 1), new Card(4, 3), new Card(3, 2) };

		int[] numArr = new int[14];
		numArr = card.getNumArr(card1);

		System.out.println(card.getPair(numArr) + "���");

	}

	@Test
	void getPair2Test() {
		Card[] card1 = new Card[] { new Card(1, 1), new Card(2, 1), new Card(3, 3), new Card(4, 3), new Card(3, 2) };
		int[] numArr = new int[14];
		numArr = card.getNumArr(card1);

		System.out.println(card.getPair(numArr) + "���");
	}

	@Test
	void getPair1Test() {
		Card[] card1 = new Card[] { new Card(1, 1), new Card(2, 1), new Card(3, 4), new Card(4, 3), new Card(3, 2) };
		int[] numArr = new int[14];
		numArr = card.getNumArr(card1);

		System.out.println(card.getPair(numArr) + "���");
	}

	@Test
	void isStraightTest() {
		Card[] card1 = new Card[] { new Card(1, 8), new Card(2, 7), new Card(3, 9), new Card(4, 11), new Card(3, 10) };
		int[] numArr = new int[14];
		numArr = card.getNumArr(card1);

		System.out.println(card.isStraight(numArr));
	}

	@Test
	void isFlush() {
		Card[] card1 = new Card[] { new Card(1, 8), new Card(1, 2), new Card(1, 9), new Card(1, 11), new Card(1, 10) };
		int[] kindArr = new int[14];
		kindArr = card.getKindArr(card1);

		System.out.println(card.isFlush(kindArr));
	}
	
	//�÷��̾� ��ũ
	@Test
	void rankPlayer() {
		int player_c = 3;
		Player[] players = new Player[player_c];
		
		// 3. ������ �÷��̾�� �и� �ش�
//		for (int i = 0; i < players.length; i++) {
//			= new Player(dealer.giveCard());
//		}
		for (int i = 0; i < 4; i++) {			
			System.out.println(dealer.giveCard().toString());
		}
		
//		for (int i = 0; i < players.length; i++) {
//			System.out.println("�÷��̾� " + i + ":" + players[i]);
//		}
//		
		
	}
}
