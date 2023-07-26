package shape;

public class Rectangle extends Shape {
	// 너비, 높이
	double x;
	double y;
	
	public Rectangle(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	double area() {
		return this.x * this.y;
	}
}
