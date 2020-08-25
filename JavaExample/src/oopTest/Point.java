
package oopTest;

public class Point {
	int x;
	int y;
	
	public Point() {
		this.x = 1;
		this.y = 1;
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	
	//3 . toString 오버라이딩
	// 객체를 문자열로
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	//두점사이의 거리
	static public double getDistance(Point p1, Point p2) {
		
		return Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2));
		
	}
	//두점사이의 거리
	public double getDistance(Point p) {
		
		//return Math.sqrt(Math.pow(p.x - x,2) + Math.pow(p.y - y,2));
		return getDistance(this, p);
	}
	
	//7. equals()를 오버라이딩 하시오
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//System.out.println(obj);
		//obj = 비교하는 객체
		//참조형 형변환은 반드시 instanceof로 체크한 후에 해야한다.
		if(!(obj instanceof Point))
			return false;

		//x와 y값이 같을경우 true		
		//1 return this.x == this.y ? true: false;
		
		//2
		Point obj_p = (Point)obj;
		
		return obj_p.x == this.x && obj_p.y == this.y ? true : false; 
	
		
	}

	
}
