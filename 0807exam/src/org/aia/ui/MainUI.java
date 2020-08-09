package org.aia.ui;

import java.util.List;
import java.util.Scanner;

import org.aia.service.MonsterCaveImpl;
import org.aia.service.PlayerServiceImpl;
import org.aia.vo.Monster;
import org.aia.vo.Player;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MainUI {

	private MonsterCaveImpl monService;
	private PlayerServiceImpl playerService;
	private Scanner sc;
	private Player player;
	private Monster monster;
	private List<Monster> monlist;

	// 게임 시작시 작동하는 메서드
	public void Start() {
		// 초기 생성시 level=1;

		// 몬스터 생성
		int currentlevel = monService.createMonster();

		// 플레이어 생성
		System.out.println("플레이어명을 입력하세요");

		String userName = sc.nextLine();

		player = playerService.createPlayer(userName);

		// 플레이어 정보표시
		System.out.println("플레이어명  : " + player.getName());
		System.out.println("공격력 : " + player.getPower());
		System.out.println("체력 : " + player.getHp());
		System.out.println();

		// 현재 레벨의 몬스터 정보표시
		monster = currentR(currentlevel);
		System.out.println("현재 몬스터의 레벨 :" + monster.getLevel());
		System.out.println("현재 몬스터의 체력 :" + monster.getHp());
		System.out.println();

		// 몬스터 ArrayList
		monlist = monService.getList();

		Attack();

	}

	// 현재 라운드를 보여주는 메서드
	public Monster currentR(int level) {
		System.out.println("현재라운드 : " + monService.getCurrentRound(level));
		return monService.getCurrentRound(level);
	}

	// 다음 라운드로 넘어가는 메서드
	public Monster nextInt(int currentlevel) {

		Monster mon = monService.getNext(currentlevel);
		System.out.println(mon);
		if(mon.getLevel() %4 ==0) {
			System.out.println("보스몬스터 출현");
		}else {
			
			System.out.println(mon.getLevel() + "단계 몬스터 출현");
		}
		return mon;
	}

	// 공격
	// 유저 -> 몬스터
	// X키를 누르면 공격
	public void Attack() {

		while (true) {

			System.out.println("공격하려면 Y키를 누르세요");
			if (sc.nextLine().equalsIgnoreCase("Y")) {
				System.out.println("공격성공");
				System.out.print("몬스터의 체력 :" + monster.getHp() + "-->");
				monster.setHp(monster.getHp() - player.getPower());
				System.out.println(monster.getHp());
				System.out.println();

				if (monster.getHp() <= 0) { // 다음라운드로 이동
					if (monster.getLevel() == monlist.size()) {
						System.out.println("게임을 클리어하였습니다!");
						break;
					}
					monster = nextInt(monster.getLevel() - 1);
				}
			} else {
				System.out.println("유저가 피해를 입었습니다.");
				System.out.print(player.getName() + "님의 체력 :" + player.getHp() + "-->");
				player.setHp(player.getHp() - monster.getPower());
				System.out.println(player.getHp());
				System.out.println();

				if (player.getHp() <= 0) {
					// 게임종료
					System.out.println("플레이어가 사망하였습니다");
					System.out.println("게임을 종료합니다");
					break;

				}

			}
		}

	}



}
