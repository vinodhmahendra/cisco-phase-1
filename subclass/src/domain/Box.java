package domain;

public class Box {

	private double length,width,height;
	
	public Box() {
		this.length = 1;
		this.width = 1;
		this.height = 1;
	}
	
	public Box(double length) {
		this.width = this.length = this.height = length;
	}
	
	public Box(double length, double width,double height) {
		this.length = length;
		this.height = height;
		this.width = width;
		System.out.println(" and the height of " + height + " . ");
	}
	
	public double volume() {
		return width* height* length;
	}
}
