package oopTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointJTest {
	
	Point p = new Point();
	Point p2 = new Point(3,5);
	Point p3 = new Point(3,5);
	
	
	@Test
	void addTest() {
		Point p = new Point();
		Point p2 = new Point(3,5);
		
		System.out.println(p);
		System.out.println(p2);
	}
	
	@Test
	void getDistanceTest() {
			
		//두점이 같은경우
		assertTrue(p2.getDistance(p3)==0);
		System.out.println(p2.getDistance(p3));
		
		//두점이 다른경우
		assertTrue(p.getDistance(p2)!=0);
		System.out.println(p.getDistance(p2));
				
		
	}
	@Test
	void EqualsTest() {
		
	}
	

}
