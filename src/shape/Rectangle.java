package shape;

public class Rectangle implements Shape2D{
	// 너비, 높이
	private double x;
	private double y;
	
	public Rectangle() {
	}
	
	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	// 넓이
	@Override
	public double area() {
		return this.x * this.y;
	}
	
	// 둘레
	@Override
	public double circum() {
		return 2 * (this.x + this.y);
	}
}
