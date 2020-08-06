package org.zerock.piggy;

import java.util.Scanner;

// ����ڿ��� �Է¹��� UIŬ����
public class PiggyUI {

	private Service service;
	private Scanner sc; 
	
	// �ش� ��ü�� ����Ҷ� �ʿ��� �����͸�
	// �����ڷ� ����
	public PiggyUI(Scanner sc, Service service) {
		super();
		this.sc = sc;
		this.service = service;
	}
	
	// toString
	@Override
	public String toString() {
		return "PiggyUI [sc=" + sc + ", service=" + service + "]";
	}

	//�޼����� ȣ���ϰ� �Է¹��� ������� �����Ѵ�.
	private int printInput(String msg) {
		System.out.println(msg);
		int input = Integer.parseInt(sc.nextLine());
		return input;
	}
	
	// ���� ����� �� �޼���
	public void init() {
		
		int choice = printInput("1�� �Ա�, 2�� ���, 3�� ����, 4�� �ܰ�Ȯ��");
		
		
		if(choice==3) {
			 System.out.println("�����մϴ�.");
		}
		
		if(choice==1) { // �Ա�
			int money = printInput("�󸶸� �Ա��Ͻǰǰ���?");
			service.deposit(money);
			if(ask()) {
				System.out.println("�ܰ�� : " +service.deposit2());
			}
			
		}else if(choice==2) { // ���
			int money = printInput("�󸶸� ����Ͻǰǰ���?");
			service.withdrawal(money);
			ask();
		}
		else if(choice==4) { 
			System.out.println("����ݾ� : " + "��");
		}
		init();
		
		
	}
	
	private boolean ask() {
		System.out.println("���� �����Ͻǰǰ���?");
		String input = sc.nextLine();
		return input.equalsIgnoreCase("Y");
	}
	
	
}