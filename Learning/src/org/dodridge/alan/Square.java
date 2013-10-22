package org.dodridge.alan;

public class Square extends Polygon {

	private Integer sideLength;
	
	public Square(int sideLength) {
		if (sideLength < 1) {
			throw new IllegalArgumentException();
		}
		this.setNumberOfSides(4);
		this.setSideLength(sideLength);
	}
	
	public int getSideLength() {
		return sideLength;
	}

	public void setSideLength(int sideLength) {
		if (sideLength > 0) {
			this.sideLength = sideLength;
		}
	}
	
	@Override
	public int getArea() {
		return sideLength*sideLength;
	}

}
