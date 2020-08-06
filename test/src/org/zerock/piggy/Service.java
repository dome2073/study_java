package org.zerock.piggy;

//���� ��ü - ���� ��� �䱸������ �ݿ��Ǿ�� �Ѵ�.
// ���� �Ա��ϰ� ����� service Ŭ����
public class Service {

	private PiggyBankVO piggyvo;
	

	public Service() {
		
	}
	
	public Service(PiggyBankVO piggivo) {
		super();
		this.piggyvo = piggivo;
	}

	// �� �Ա��ϴ� ����� ���� �޼���
	// ���Ǵ� UI���� �ϹǷ� ������!
	
	// ���� �ݾ׸� �����ִ� �޼���
	public int deposit(int money) { // �޼��� �ȿ����� money�� +?

		System.out.println("�Է¹��� �ݾ� : " + money);
		piggyvo.setMoney(money);;
		return piggyvo.getMoney();
	}

	public int deposit2() {
		// TODO Auto-generated method stub
		
		return piggyvo.getMoney();
	}

	// �� ����ϴ� ����� ���� �޼���
	// ���Ǵ� UI���� �ϹǷ� ������!
	public int withdrawal(int money) {
		int result = piggyvo.getMoney() - money;
		return result;
	}

	// ���� �ܾ� Ȯ�� ����� ���� �޼���
	// ���Ǵ� UI���� �ϹǷ� ������!
	public void balance() {
		piggyvo.getMoney();
	}
}