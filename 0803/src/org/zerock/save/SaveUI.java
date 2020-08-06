package org.zerock.save;

import java.util.Scanner;

//UI - 대부분 void
//흐름제어이기 때문에 
//외부에서 호출 가능한 경우만  public 
public class SaveUI {
	
	//인스턴스 변수 - 여러곳에서 사용
	private Scanner scanner;
	private PiggySave save;
	
	//scanner가 필요한 객체에 외부에서 의존성 주입 
	//new ~ 가 있는거보다 없는게 유지보수가 좋음
	public SaveUI(Scanner scanner, PiggySave save) {
		this.scanner = scanner;
		this.save = save;
	}

	//private로 공통으로 사용하는 동작 메서드만들기1
	//입력
	private int inputInt(String msg) {
		System.out.println(msg);
		int result = Integer.parseInt(this.scanner.nextLine());
		return result;
	}
	//private로 공통으로 사용하는 동작 메서드만들기2
	//
	private boolean confirm() {
		
		System.err.println("정말 실행하실 겁니까?  y/n");
		String input = scanner.nextLine();
		
		return input.equalsIgnoreCase("Y");
	}
	
	
	
	// 테스트
	public void init() {
		   int oper = inputInt("1.입금 2.출금 3.종료");
		   
		   if(oper ==3) {
			   return;
		   }
		   
		   //입금
		   if(oper ==1) {
			    depositUI();
		   }else if(oper ==2) {
			    withdrawUI();
		   }
		   
		   //재귀
		   init();
		  
	}

	private void withdrawUI() {
		// TODO Auto-generated method stub
		System.out.println("출금 작업입니다. 되돌리실수 없습니다");
		
		if(confirm() == false) {
			System.out.println("출금을 취소하셨습니다.");
			return ;
		}
		
		int money = save.withdraw();
		System.out.println("출금금액 : "+money);
	}

	private void depositUI() {
		// TODO Auto-generated method stub
		int amount = inputInt("얼마를 입금하실건가요?"); // 입금할 금액
		
		
		
		if(confirm() == false) {
			System.out.println("입금 작업을 취소하셨습니다.");
		}
		save.deposit(amount);
		
		
	}

	
}