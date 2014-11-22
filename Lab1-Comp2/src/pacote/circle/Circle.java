package pacote.circle;

public class Circle {
	private double radius;
	private String color; 
	
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColour(String color) {
		this.color = color;
	}
	
	public String toString() {
		return super.toString() + " Circle: radius = " + radius + ", color = " + color;
	}
	
}
