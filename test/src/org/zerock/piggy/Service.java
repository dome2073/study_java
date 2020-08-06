package org.zerock.piggy;

//서비스 객체 - 고객의 모든 요구사항이 반영되어야 한다.
// 돈을 입금하고 출금할 service 클래스
public class Service {

	private PiggyBankVO piggyvo;
	

	public Service() {
		
	}
	
	public Service(PiggyBankVO piggivo) {
		super();
		this.piggyvo = piggivo;
	}

	// 돈 입금하는 기능을 가진 메서드
	// 질의는 UI에서 하므로 로직만!
	
	// 현재 금액만 보여주는 메서드
	public int deposit(int money) { // 메서드 안에서만 money에 +?

		System.out.println("입력받은 금액 : " + money);
		piggyvo.setMoney(money);;
		return piggyvo.getMoney();
	}

	public int deposit2() {
		// TODO Auto-generated method stub
		
		return piggyvo.getMoney();
	}

	// 돈 출금하는 기능을 가진 메서드
	// 질의는 UI에서 하므로 로직만!
	public int withdrawal(int money) {
		int result = piggyvo.getMoney() - money;
		return result;
	}

	// 현재 잔액 확인 기능을 가진 메서드
	// 질의는 UI에서 하므로 로직만!
	public void balance() {
		piggyvo.getMoney();
	}
}