package org.zerock.piggy;

// 돼지저금통 VO클래스 생성
public class PiggyBankVO {
		
		private int money; // 입력받은 돈
		private int total; // 총 금액
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