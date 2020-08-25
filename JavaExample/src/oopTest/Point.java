
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
	
	//3 . toString �������̵�
	// ��ü�� ���ڿ���
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	//���������� �Ÿ�
	static public double getDistance(Point p1, Point p2) {
		
		return Math.sqrt(Math.pow(p1.x - p2.x,2) + Math.pow(p1.y - p2.y,2));
		
	}
	//���������� �Ÿ�
	public double getDistance(Point p) {
		
		//return Math.sqrt(Math.pow(p.x - x,2) + Math.pow(p.y - y,2));
		return getDistance(this, p);
	}
	
	//7. equals()�� �������̵� �Ͻÿ�
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//System.out.println(obj);
		//obj = ���ϴ� ��ü
		//������ ����ȯ�� �ݵ�� instanceof�� üũ�� �Ŀ� �ؾ��Ѵ�.
		if(!(obj instanceof Point))
			return false;

		//x�� y���� ������� true		
		//1 return this.x == this.y ? true: false;
		
		//2
		Point obj_p = (Point)obj;
		
		return obj_p.x == this.x && obj_p.y == this.y ? true : false; 
	
		
	}

	
}
