package Poker;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

public class Card {
	int kind; // ī������
	int num; // ī���ȣ

	// 2. ī���ȣ�� �����Ѵ�.

	boolean straight = false;
	boolean flush = false;
	boolean pullhouse = false;
	
	int pair = 0;
	int triple = 0;
	
	int[] numArr = new int[14];
	int[] kindArr = new int[5];
	
	Card(int kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	@Override
	public String toString() {
		return "\n kind=" + kind +" num="+ num ;
	}
	
	//������ȣ�� �������� �޼��� //1~13���� (J,Q,K,A)
	public int[] getNumArr(Card[] cArr) { 
		int[] numArr = new int[14];

		for (int i = 0; i < cArr.length; i++) {
			numArr[cArr[i].num]++; //��ȣ���� ī����
		}

		return numArr;
	}

	// ���� ī���� ������ �������� �޼��� //1.�����̽� 2. Ŭ�ι� 3.��Ʈ 4.���̾Ʒ� ����
	public int[] getKindArr(Card[] cArr) {
		int[] kindArr = new int[14];

		for (int i = 0; i < cArr.length; i++) {
			kindArr[cArr[i].kind]++; //ī�� �������� ī����
		}

		return kindArr;
	}
	
	//���Ӱ���� �˷��ִ� �޼��� //-�ξ� ��Ʈ����Ʈ �÷���, �� ��Ʈ����Ʈ �÷���, ����ƾ, �齺Ʈ����Ʈ, 
	public String rankCheck(Card[] cArr) {


		numArr = getNumArr(cArr);
		kindArr = getKindArr(cArr);
		
		pair = getPair(numArr);

		straight = isStraight(numArr);

		flush = isFlush(kindArr);

		if (pair == 3 && pair >= 1)
			pullhouse = true;
		if (flush == true && straight == true)
			return "��Ʈ����Ʈ �÷���";
		if (pair == 4)
			return "��ī��";
		if (triple == 1 && pair >= 1) // ��ĥ�ʿ�
			return "Ǯ�Ͽ콺";
		if (flush == true)
			return "�÷���";
		if (straight == true)
			return "��Ʈ����Ʈ";
		if (triple == 1)
			return "Ʈ����";
		if (pair >= 1)
			return pair + "���";
		else
			return "�����";

	}
	
	//�� �˷��ִ� �޼���
 	public int getPair(int[] numArr) {
 		//����ī���ȣ 4��     -- pair   = 4 --> ��ī��
 		//����ī���ȣ 3��     -- triple = 1 --> Ʈ����
 		//����ī���ȣ2�� x2 -- pair   = 2 --> �����
 		//����ī���ȣ2�� x1 -- pair   = 1 --> �����

		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] == 4)
				pair = 4;
			if (numArr[i] == 3)
				triple = 1;
			if (numArr[i] == 2)
				pair += 1;
		}

		return pair;
	}
 	
 	//��Ʈ����Ʈ - ������ȣ�� ������ Ȯ���ϴ� �޼��� //�����ʿ� --j,q,k,1,2 �϶�
	public boolean isStraight(int[] numArr) {
		
		int straightCnt = 0;
		
		//���� ���ڸ�ŭ ī���� ++ 
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] > 0) {
				straightCnt += 1;
				if (straightCnt == 5) {
					straight = true;
					return straight;
				}
			} else {
				straightCnt = 0;
			}

		}
		return straight;
	}

	//�÷��� -- ���������� ī�� 5���ϰ�� üũ
	public boolean isFlush(int[] kindArr) {

		for (int i = 0; i < kindArr.length; i++) {
			if (kindArr[i] >= 5) {
				flush = true;
				return flush;
			}

		}

		return flush;
	}
}