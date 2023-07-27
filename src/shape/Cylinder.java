package shape;

public class Cylinder implements Shape3D{
	
	private Circle circle; // 원 객체
	private double z; // z축
	
	public Cylinder() {
	}
	
	public Cylinder(Circle circle, double z) {
		this.circle = circle;
		this.z = z;
	}
	
	public Cylinder(double r, double z) {
		this.circle = new Circle(r);
		this.z = z;
	}

	// Shape에 있는 area 메소드와 Shape3D에 있는 volume 메소드 모두를 구현해야 함
	@Override
	public double area() {
		return circle.area() * 2 + circle.circum() * z;
	}
	
	@Override
	public double volume() {
		return circle.area() * z;
	}
}
