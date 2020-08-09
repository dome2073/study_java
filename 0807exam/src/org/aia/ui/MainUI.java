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

	// ���� ���۽� �۵��ϴ� �޼���
	public void Start() {
		// �ʱ� ������ level=1;

		// ���� ����
		int currentlevel = monService.createMonster();

		// �÷��̾� ����
		System.out.println("�÷��̾���� �Է��ϼ���");

		String userName = sc.nextLine();

		player = playerService.createPlayer(userName);

		// �÷��̾� ����ǥ��
		System.out.println("�÷��̾��  : " + player.getName());
		System.out.println("���ݷ� : " + player.getPower());
		System.out.println("ü�� : " + player.getHp());
		System.out.println();

		// ���� ������ ���� ����ǥ��
		monster = currentR(currentlevel);
		System.out.println("���� ������ ���� :" + monster.getLevel());
		System.out.println("���� ������ ü�� :" + monster.getHp());
		System.out.println();

		// ���� ArrayList
		monlist = monService.getList();

		Attack();

	}

	// ���� ���带 �����ִ� �޼���
	public Monster currentR(int level) {
		System.out.println("������� : " + monService.getCurrentRound(level));
		return monService.getCurrentRound(level);
	}

	// ���� ����� �Ѿ�� �޼���
	public Monster nextInt(int currentlevel) {

		Monster mon = monService.getNext(currentlevel);
		System.out.println(mon);
		if(mon.getLevel() %4 ==0) {
			System.out.println("�������� ����");
		}else {
			
			System.out.println(mon.getLevel() + "�ܰ� ���� ����");
		}
		return mon;
	}

	// ����
	// ���� -> ����
	// XŰ�� ������ ����
	public void Attack() {

		while (true) {

			System.out.println("�����Ϸ��� YŰ�� ��������");
			if (sc.nextLine().equalsIgnoreCase("Y")) {
				System.out.println("���ݼ���");
				System.out.print("������ ü�� :" + monster.getHp() + "-->");
				monster.setHp(monster.getHp() - player.getPower());
				System.out.println(monster.getHp());
				System.out.println();

				if (monster.getHp() <= 0) { // ��������� �̵�
					if (monster.getLevel() == monlist.size()) {
						System.out.println("������ Ŭ�����Ͽ����ϴ�!");
						break;
					}
					monster = nextInt(monster.getLevel() - 1);
				}
			} else {
				System.out.println("������ ���ظ� �Ծ����ϴ�.");
				System.out.print(player.getName() + "���� ü�� :" + player.getHp() + "-->");
				player.setHp(player.getHp() - monster.getPower());
				System.out.println(player.getHp());
				System.out.println();

				if (player.getHp() <= 0) {
					// ��������
					System.out.println("�÷��̾ ����Ͽ����ϴ�");
					System.out.println("������ �����մϴ�");
					break;

				}

			}
		}

	}



}
