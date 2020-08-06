package org.zerock.dice;
import java.util.Scanner;

//god class
//�� �ֻ��� ����
public class Main {
	
	private static int num = 0; //�����ϳ��� �������� �ν��Ͻ��� ���������
	
	public static void main(String[] args) {
		
		//�÷��̾� 2��
		Player[] players = new Player[2];
		players[0] = new Player("A", 0);
		players[1] = new Player("B", 0);
		
		//Ÿ�� 100��
		Tile[] board = new Tile[100];
		
		for(int i=0; i<board.length;i++) {
			board[i] = new Tile(i+1, null);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		//current = ����
		while(true) {
			int turn = num  % 2;
			
			Player currnetPlayer = players[turn];
			
			System.out.println(currnetPlayer);
			System.out.println("������ �غ� �ϰ� ����");
			scanner.nextLine();
			
			//�ֻ����� �������� 
			int value = Dice.roll();
			System.out.println("�ֻ��� �� :"+value);
			//���� �÷��̾��� ��ġ
			int playerPos = currnetPlayer.getPos();
			
			if(playerPos + value >= board.length -1) {
				System.out.println("Player WIN");
				break;
			}
			//Ÿ��Ȯ��(��ũ)
			//Ÿ����ġ��ŭ �̵�
			Tile target = board[playerPos + value];
			
			//�̵�
			currnetPlayer.setPos(playerPos + value);
			System.out.println(currnetPlayer);
			System.out.println("---------------------------");
			num ++;
		}
		
	}
}
