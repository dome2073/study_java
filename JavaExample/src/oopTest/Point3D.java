package oopTest;

public class Point3D extends Point{
	int z;
	
	public Point3D() {
		super();
		this.x =1;
		this.y=1;
		this.z=1;

	}
	
	
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}


	@Override
	public String toString() {
		return "Point3D [x=" + x + ", y=" + y + ", z=" + z + "]";
	}
	
	
}
