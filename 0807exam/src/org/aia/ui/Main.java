package org.aia.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.aia.service.MonsterCaveImpl;
import org.aia.service.PlayerServiceImpl;
import org.aia.vo.Monster;
import org.aia.vo.Player;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MonsterCaveImpl Monservice = new MonsterCaveImpl();
		PlayerServiceImpl playerServiceImpl = new PlayerServiceImpl();
		
		
		Player player = new Player("대윤");
		Monster monster = new Monster();
		List<Monster> monlist = new ArrayList<>();
		
		MainUI mainUI = new MainUI(Monservice, playerServiceImpl ,sc, player,monster,monlist);
		
		//몬스터생성
		mainUI.Start();
		
		
		
	}
}
