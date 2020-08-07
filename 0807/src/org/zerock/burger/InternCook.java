package org.zerock.burger;

public class InternCook implements BurgerCook {

	@Override
	public void makeBurger() {
		System.out.println("아직 인턴이라 잘 못 만든 버거");
	}

}
