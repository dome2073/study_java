package org.zero.shape;

public class Triangle implements Shape {
	private int bottom;
	private int height;
	
	public Triangle(int bottom, int height) {
		super();
		this.bottom = bottom;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [bottom=" + bottom + ", height=" + height + "]";
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return bottom * height; //¹Øº¯°öÇÏ±â ³ÐÀÌ
	}
	
	
}
