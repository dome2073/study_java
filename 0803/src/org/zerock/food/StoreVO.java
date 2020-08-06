package org.zerock.food;

public class StoreVO {

		private String name;
		private double lat;
		private double lng;
		
		
		public StoreVO(String name, double lat, double lng) {
			super();
			this.name = name;
			this.lat = lat;
			this.lng = lng;
		}
		
		public double calcDistance(double tLat, double tLng ) {
			
			//거리구하는 공식
			return Math.sqrt(Math.pow(tLat - this.lat, 2) + Math.pow(tLng - this.lng, 2));
					
			
		}
		// 데이터 위주 클래스는 항상 toString
		@Override
		public String toString() {
			return "StoreVO [name=" + name + ", lat=" + lat + ", ing=" + lng + "]";
		}

		
		
}
