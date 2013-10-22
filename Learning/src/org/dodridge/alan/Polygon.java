package org.dodridge.alan;

public abstract class Polygon {
	
	private int numberOfSides;
	
	public abstract int getArea();

	public int getNumberOfSides() {
		return numberOfSides;
	}

	public void setNumberOfSides(int numberOfSides) {
		if (numberOfSides > 2) {
			this.numberOfSides = numberOfSides;
		}
	}
}
