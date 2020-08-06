package org.zerock.food2;


//��ġ (����,�浵)
public class Position {
	
	private double lat; //���� 
	private double lng; //��
	
	
	
	public Position(double lat, double lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	
	//�� ���� �Ÿ��� ���ϴ� �Լ� 
	public double calcDistance(Position target) {
		return Math.sqrt(Math.pow(this.lat - target.lat, 2) + Math.pow(this.lng - target.lng,2));
	}

	@Override
	public String toString() {
		return "Position [lat=" + lat + ", lng=" + lng + "]";
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}

	public double getLat() {
		return lat;
	}

	public double getLng() {
		return lng;
	}
	
	
	
}
