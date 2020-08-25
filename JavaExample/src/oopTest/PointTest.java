package oopTest;

public class PointTest {
		
	public static void main(String[] args) {
		
		Point point1 = new Point(3,5);
		Point point4 = new Point(3,5);
		System.out.println("Point(x,y) : "+point1);
		
		Point point2 = new Point();
		System.out.println("Point() : "+ point2);
				
		
		System.out.println("두점사이의거리1 :"+Point.getDistance(point1, point2));
		System.out.println("두점사이의거리2 :"+point1.getDistance(point2));
		
		Point point3 = new Point3D(3,4,2);
//		System.out.println(point3);
		
		
		System.out.println(point1.equals(""));
		System.out.println(point1.equals(null));
		System.out.println(point1.equals(point4));
		System.out.println(point1.equals(point2));
		
	}
	
	
}
