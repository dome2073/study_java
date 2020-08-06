package org.zero.shape;

public class Circle implements Shape{
	private double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
	//¿øÀÇ ³ĞÀÌ
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * 3.14;
	}
	
}
