package org.zerock.food2;

public class Store {

	private String name; //���Ը�
	private Position position; //��ġ (����, �浵)
	

	//1. ���Ը�, ��ġ
	public Store(String name, Position position) {
		super();
		this.name = name;
		this.position = position;
	}
	
	//2. ���Ը�, ����, �浵
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
