package org.zerock.org.DataStructure;


public class Player {
	
	private int no;
	private String name;
	
	public Player(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Player [no=" + no + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		//동작확인용
		System.out.println("hashcode.............");
		
		final int prime = 31;
		int result = 1;
		result = prime * result + no;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		if (no != other.no)
			return false;
		return true;
	}
	
	
	
	
}
