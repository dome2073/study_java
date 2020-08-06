package org.zerock.shop;

public enum Menu {
	//������
	//enum : ������ ���� ��ü�� ����
	//�����ڸ� ���鶧 public���� ������ ���� --> �ܺο��� ��ü���� �Ұ���
	M1("�Ķ��̵�", 14000),
	M2("���ġŲ", 15000),
	M3("����ġŲ", 16000),
	M4("�Ĵ�", 17000),
	M5("�Ҵ�", 18000)
	;
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	private String name;
	private int price;
	
	Menu(String name, int price){
		this.name = name;
		this.price = price;
	}
}
