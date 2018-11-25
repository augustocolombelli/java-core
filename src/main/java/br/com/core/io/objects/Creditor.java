package br.com.core.io.objects;

import java.io.Serializable;

public class Creditor implements Serializable {
	private static final long serialVersionUID = 8913785305290411092L;
	private Integer id;
	private String name;

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

}
