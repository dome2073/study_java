package org.zerock.inhert;

public class StoreMain {
	public static void main(String[] args) {
		Store s1 = new Store();
		Store s2 = new SeoulStore();
		
		s1.makeZaZang();
		s2.makeZaZang(); //오버라이딩!
		
		//bad cord -if(instanceof) --> 오버라이딩으로 하는것이 좋다.
		//결국 상속은 if-else를 피하기위해
		if(s2 instanceof SeoulStore) {			
			((SeoulStore) s2).makeZamBong(); //자바는 타입을 보기 떄문에 Store로는 호출불가능 하므로 다운캐스트를 해야한다.
		}
		
	}
}
