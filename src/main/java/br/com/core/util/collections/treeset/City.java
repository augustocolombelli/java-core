package br.com.core.util.collections.treeset;

public class City implements Comparable<City> {

	private Integer id;
	private String name;

	public City(Integer id, String name) {
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

	public String toString() {
		return this.id + " - " + this.getName();
	}

	@Override
	public int compareTo(City o) {
		return Integer.compare(this.getId(), o.getId());
	}
	
	@Override
	public int hashCode() {
		return this.getId() * this.getName().length() * Integer.MAX_VALUE;
	}

}
