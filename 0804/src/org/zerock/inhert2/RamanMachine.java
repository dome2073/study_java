package org.zerock.inhert2;

//���ӽ� Ŭ����
public class RamanMachine {
	
	//�̷��� ����ϸ� � ����� ���� RamanMachine�� ������ �ʿ䰡 ����.
	//���, ������ --> ��������(SOLID)
	public void cook(ARaman raman) {

		raman.step1();
		raman.cook();
		raman.step3();
	}
}
