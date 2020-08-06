package org.zerock.food2;

public class Store {

	private String name; //가게명
	private Position position; //위치 (위도, 경도)
	

	//1. 가게명, 위치
	public Store(String name, Position position) {
		super();
		this.name = name;
		this.position = position;
	}
	
	//2. 가게명, 위도, 경도
	public Store(String name, double lat, double lng) {
		
		this.name = name;
		this.position = new Position(lat, lng);
	}

	public String getName() {
		return name;
	}

	public Position getPosition() {
		return position;
	}

	@Override
	public String toString() {
		return "Store [name=" + name + ", position=" + position + "]";
	}
	
	

}
