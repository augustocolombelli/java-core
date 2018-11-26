package br.com.core.util.collections.util;

public class Car implements Comparable<Car> {

	private Integer id;
	private String name;

	public Car(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(Car otherCar) {
		return Integer.compare(this.getId(), otherCar.getId());
	}

	public String toString() {
		return this.getId() + " - " + this.getName();
	}

}
