package org.zero.shape;

public class Rectangle implements Shape {
	//정사각형
	private int width;
	private int height;
	
	public Rectangle(int witdh, int height) {
		super();
		this.width = witdh;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rectangle [witdh=" + width + "]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	
	
}
