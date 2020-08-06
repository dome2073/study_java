package org.zerock.shop;

public enum Menu {
	//음식점
	//enum : 정해진 수의 객체를 만듬
	//생성자를 만들때 public으로 만들지 않음 --> 외부에서 객체생성 불가능
	M1("후라이드", 14000),
	M2("양념치킨", 15000),
	M3("마늘치킨", 16000),
	M4("파닭", 17000),
	M5("불닭", 18000)
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
