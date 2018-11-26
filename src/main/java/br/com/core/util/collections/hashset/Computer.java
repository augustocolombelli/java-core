package br.com.core.util.collections.hashset;

public class Computer {

	private Integer id;
	private String color;

	public Computer(Integer id, String color) {
		this.id = id;
		this.color = color;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return this.id + " - " + this.color;
	}
	
	@Override
	public boolean equals(Object otherObject) {
		if(otherObject == null) return false;
		Computer otherComputer = (Computer) otherObject;
		if(otherComputer.getId() != this.getId()) return false;
		if(otherComputer.getColor().equals(this.getColor())) return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		return this.getId() * this.getColor().length() * Integer.MAX_VALUE;
	}

}
