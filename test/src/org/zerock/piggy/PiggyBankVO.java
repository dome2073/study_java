package org.zerock.piggy;

// ���������� VOŬ���� ����
public class PiggyBankVO {
		
		private int money; // �Է¹��� ��
		private int total; // �� �ݾ�
		private int weight;
		
		public PiggyBankVO() {
			super();	
		}
	
		public PiggyBankVO(int money, int total) {
			super();
			this.money = money;
			this.total = total;
		}
		
		public PiggyBankVO(int money, int total, int weight) {
			super();
			this.money = money;
			this.total = total;
			this.total = weight;
		}
		

		@Override
		public String toString() {
			return "PiggyBankVO [money=" + money + ", total=" + total + "]";
		}

		public void setMoney(int money) {
			this.total += money;
		}

		public int getMoney() {
			
			return total;
		}

		

}