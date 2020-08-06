package org.zerock.inhert2;

/*
추상클래스 ARaman
ARaman은 super클래스
물려줄 기능(메서드)들은 정의하고
반드시 바꿔서 써야하는 cook()은 /라면마다 끓이는 방법이 다르기 때문/
구현부없이 abstract를 명시하는 메서드로 만들어준다.
==> 다른 자손클래스에서는 cook()메서드를 오버라이딩하도록 강요하게된다.!
*/
public abstract class ARaman {

	public void step1() {
		System.out.println("물을 끓인다");
	}

	public abstract void cook();

	public void step3() {
		System.out.println("그릇에 예쁘게 담아주세요");
	}

}