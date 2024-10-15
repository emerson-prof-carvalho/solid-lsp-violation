package model;

public class Rectangle {
	
	private Double width;
	private Double height;
	
	public void setWidth(Double width) {
		this.width = width;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public Double getHeight() {
		return height;
	}

	public Double getArea() {
		return width * height;
	}
}