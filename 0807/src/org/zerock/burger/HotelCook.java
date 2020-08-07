package org.zerock.burger;

public class HotelCook implements BurgerCook{

	@Override
	public void makeBurger() {
		System.out.println("Hotel의 셰프가 만드는 버거");
	}

}
