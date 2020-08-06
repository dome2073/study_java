package org.zerock.inhert2;

//라면머신 클래스
public class RamanMachine {
	
	//이렇게 사용하면 어떤 라면을 만들어도 RamanMachine은 변경할 필요가 없다.
	//상속, 다형성 --> 개방과폐쇄(SOLID)
	public void cook(ARaman raman) {

		raman.step1();
		raman.cook();
		raman.step3();
	}
}
