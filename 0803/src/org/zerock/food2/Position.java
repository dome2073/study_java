package org.zerock.food2;


//위치 (위도,경도)
public class Position {
	
	private double lat; //위도 
	private double lng; //경
	
	
	
	public Position(double lat, double lng) {
		super();
		this.lat = lat;
		this.lng = lng;
	}
	
	//두 점의 거리를 구하는 함수 
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
