package org.zero.shape;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		//shape 타입의 배열
		Shape[] arr = new Shape[3];
		arr[0] = new Circle(10);
		arr[1] = new Triangle(10, 4);
		arr[2] = new Rectangle(10, 10);
		
		Arrays.stream(arr).forEach(shape -> System.out.println(shape.getArea()));
	}
}
