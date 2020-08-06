package org.zerock.piggy;

import java.util.Scanner;

// 사용자에게 입력받을 UI클래스
public class PiggyUI {

	private Service service;
	private Scanner sc; 
	
	// 해당 객체를 사용할때 필요한 데이터를
	// 생성자로 정의
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

	//메세지를 호출하고 입력받은 결과값을 리턴한다.
	private int printInput(String msg) {
		System.out.println(msg);
		int input = Integer.parseInt(sc.nextLine());
		return input;
	}
	
	// 돈을 입출금 할 메서드
	public void init() {
		
		int choice = printInput("1번 입금, 2번 출금, 3번 종료, 4번 잔고확인");
		
		
		if(choice==3) {
			 System.out.println("종료합니다.");
		}
		
		if(choice==1) { // 입금
			int money = printInput("얼마를 입금하실건가요?");
			service.deposit(money);
			if(ask()) {
				System.out.println("잔고는 : " +service.deposit2());
			}
			
		}else if(choice==2) { // 출금
			int money = printInput("얼마를 출금하실건가요?");
			service.withdrawal(money);
			ask();
		}
		else if(choice==4) { 
			System.out.println("현재금액 : " + "원");
		}
		init();
		
		
	}
	
	private boolean ask() {
		System.out.println("정말 실행하실건가요?");
		String input = sc.nextLine();
		return input.equalsIgnoreCase("Y");
	}
	
	
}