package org.zerock.dice;
import java.util.Scanner;

//god class
//뱀 주사위 게임
public class Main {
	
	private static int num = 0; //변수하나를 여러개의 인스턴스가 나눠쓸경우
	
	public static void main(String[] args) {
		
		//플레이어 2명
		Player[] players = new Player[2];
		players[0] = new Player("A", 0);
		players[1] = new Player("B", 0);
		
		//타일 100개
		Tile[] board = new Tile[100];
		
		for(int i=0; i<board.length;i++) {
			board[i] = new Tile(i+1, null);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		//current = 현재
		while(true) {
			int turn = num  % 2;
			
			Player currnetPlayer = players[turn];
			
			System.out.println(currnetPlayer);
			System.out.println("마음의 준비를 하고 엔터");
			scanner.nextLine();
			
			//주사위를 던져야함 
			int value = Dice.roll();
			System.out.println("주사위 수 :"+value);
			//현재 플레이어의 위치
			int playerPos = currnetPlayer.getPos();
			
			if(playerPos + value >= board.length -1) {
				System.out.println("Player WIN");
				break;
			}
			//타일확인(링크)
			//타일위치만큼 이동
			Tile target = board[playerPos + value];
			
			//이동
			currnetPlayer.setPos(playerPos + value);
			System.out.println(currnetPlayer);
			System.out.println("---------------------------");
			num ++;
		}
		
	}
}
