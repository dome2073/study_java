package org.zerock.inhert;

public class StoreMain {
	public static void main(String[] args) {
		Store s1 = new Store();
		Store s2 = new SeoulStore();
		
		s1.makeZaZang();
		s2.makeZaZang(); //�������̵�!
		
		//bad cord -if(instanceof) --> �������̵����� �ϴ°��� ����.
		//�ᱹ ����� if-else�� ���ϱ�����
		if(s2 instanceof SeoulStore) {			
			((SeoulStore) s2).makeZamBong(); //�ڹٴ� Ÿ���� ���� ������ Store�δ� ȣ��Ұ��� �ϹǷ� �ٿ�ĳ��Ʈ�� �ؾ��Ѵ�.
		}
		
	}
}
