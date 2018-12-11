package br.com.core.lang.arrays;

public class Cell {

	private String element;
	private Cell nextElement;

	public Cell(String element, Cell nextElement) {
		this.element = element;
		this.nextElement = nextElement;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Cell getNextElement() {
		return nextElement;
	}

	public void setNextElement(Cell nextElement) {
		this.nextElement = nextElement;
	}

}
