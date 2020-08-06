package org.zerock.save;

import java.util.Scanner;

//UI - ��κ� void
//�帧�����̱� ������ 
//�ܺο��� ȣ�� ������ ��츸  public 
public class SaveUI {
	
	//�ν��Ͻ� ���� - ���������� ���
	private Scanner scanner;
	private PiggySave save;
	
	//scanner�� �ʿ��� ��ü�� �ܺο��� ������ ���� 
	//new ~ �� �ִ°ź��� ���°� ���������� ����
	public SaveUI(Scanner scanner, PiggySave save) {
		this.scanner = scanner;
		this.save = save;
	}

	//private�� �������� ����ϴ� ���� �޼��常���1
	//�Է�
	private int inputInt(String msg) {
		System.out.println(msg);
		int result = Integer.parseInt(this.scanner.nextLine());
		return result;
	}
	//private�� �������� ����ϴ� ���� �޼��常���2
	//
	private boolean confirm() {
		
		System.err.println("���� �����Ͻ� �̴ϱ�?  y/n");
		String input = scanner.nextLine();
		
		return input.equalsIgnoreCase("Y");
	}
	
	
	
	// �׽�Ʈ
	public void init() {
		   int oper = inputInt("1.�Ա� 2.��� 3.����");
		   
		   if(oper ==3) {
			   return;
		   }
		   
		   //�Ա�
		   if(oper ==1) {
			    depositUI();
		   }else if(oper ==2) {
			    withdrawUI();
		   }
		   
		   //���
		   init();
		  
	}

	private void withdrawUI() {
		// TODO Auto-generated method stub
		System.out.println("��� �۾��Դϴ�. �ǵ����Ǽ� �����ϴ�");
		
		if(confirm() == false) {
			System.out.println("����� ����ϼ̽��ϴ�.");
			return ;
		}
		
		int money = save.withdraw();
		System.out.println("��ݱݾ� : "+money);
	}

	private void depositUI() {
		// TODO Auto-generated method stub
		int amount = inputInt("�󸶸� �Ա��Ͻǰǰ���?"); // �Ա��� �ݾ�
		
		
		
		if(confirm() == false) {
			System.out.println("�Ա� �۾��� ����ϼ̽��ϴ�.");
		}
		save.deposit(amount);
		
		
	}

	
}